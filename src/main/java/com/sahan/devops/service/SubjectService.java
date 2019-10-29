package com.sahan.devops.service;

import com.sahan.devops.model.Subject;
import com.sahan.devops.utility.ResponseObject;
import org.springframework.http.ResponseEntity;

public interface SubjectService {
    ResponseEntity<ResponseObject> saveSubjectDetails(Subject subject);
}
