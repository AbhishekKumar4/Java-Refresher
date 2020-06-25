package com.abhishek.jpaspec.controller;

import com.abhishek.jpaspec.entity.Case;
import com.abhishek.jpaspec.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestPagination {

    @Autowired
    private CaseService caseService;

    @GetMapping(path = "/cases")
    public ResponseEntity<List<Case>> getCaseEx1(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable) {
        return new ResponseEntity<>(caseService.getCaseList(pageable), HttpStatus.OK);
    }

    @GetMapping(path = "/cases")
    public ResponseEntity<List<Case>> getCaseEx2(@PageableDefault(page = 0, size = 10)
                                              @SortDefault.SortDefaults({
                                                      @SortDefault(sort = "id", direction = Sort.Direction.ASC)
                                              }) Pageable pageable) {
        return new ResponseEntity<>(caseService.getCaseList(pageable), HttpStatus.OK);
    }
}
