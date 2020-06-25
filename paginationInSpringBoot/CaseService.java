package com.abhishek.jpaspec.service;

import com.abhishek.jpaspec.entity.Case;
import com.abhishek.jpaspec.repository.CaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CaseService {

    @Autowired
    private CaseRepository caseRepository;

    public List<Case> getCaseList(Pageable pageable) {
        Page<Case> pagedResult = caseRepository.findAll(pageable);
        List<Case> results = pagedResult.hasContent() ? pagedResult.getContent() : Collections.EMPTY_LIST;
        return results;
    }
}
