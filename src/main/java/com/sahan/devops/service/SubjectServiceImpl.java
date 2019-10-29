package com.sahan.devops.service;

import com.sahan.devops.model.Subject;
import com.sahan.devops.repository.SubjectRepository;
import com.sahan.devops.utility.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SubjectServiceImpl implements SubjectService {
    private final SubjectRepository subjectRepository;

    @Autowired
    public SubjectServiceImpl(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public ResponseEntity<ResponseObject> saveSubjectDetails(Subject subject) {
        ResponseObject responseObject;
        if (subject != null) {
            subject.setCreatedDate(new Date());
            Subject saveObject = this.subjectRepository.save(subject);
            responseObject = new ResponseObject(("Successfully Saved!"), true, saveObject);
            return new ResponseEntity<>(responseObject, HttpStatus.OK);
        } else {
            responseObject = new ResponseObject(("Error Saving!"), true, null);
            return new ResponseEntity<>(responseObject, HttpStatus.NOT_ACCEPTABLE);
        }
    }
}
