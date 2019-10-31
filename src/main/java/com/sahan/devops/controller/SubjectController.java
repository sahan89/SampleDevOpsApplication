package com.sahan.devops.controller;

import com.sahan.devops.model.Subject;
import com.sahan.devops.repository.SubjectRepository;
import com.sahan.devops.service.SubjectService;
import com.sahan.devops.utility.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/subjectController")
public class SubjectController {
    private final String APPLICATION_JSON = "application/json";

    private final SubjectService subjectService;
    private final SubjectRepository subjectRepository;

    @Autowired
    public SubjectController(SubjectService subjectService,
                             SubjectRepository subjectRepository) {
        this.subjectService = subjectService;
        this.subjectRepository = subjectRepository;
    }

    @RequestMapping(value = "/saveSubjectDetails", method = RequestMethod.POST, produces = {APPLICATION_JSON})
    public ResponseEntity<ResponseObject> saveSubjectDetails(@RequestBody Subject subject) {
        return subjectService.saveSubjectDetails(subject);
    }

    @RequestMapping(value = "/getAllSubjectDetails", method = RequestMethod.GET, produces = {APPLICATION_JSON})
    public List<Subject> getAllSubjectDetails() {
        return subjectRepository.findAll();
    }
}
