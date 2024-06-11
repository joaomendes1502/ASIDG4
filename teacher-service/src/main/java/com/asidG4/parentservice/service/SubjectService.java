package com.asidG4.parentservice.service;

import com.asidG4.parentservice.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    public final SubjectRepository subjectRepository;

    @Autowired
    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public void deleteSubjectById(Long subjectId){
        subjectRepository.deleteById(subjectId);
    }
}
