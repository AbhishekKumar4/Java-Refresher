package com.abhishek.jpaspec.repository;

import com.abhishek.jpaspec.entity.Case;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseRepository extends PagingAndSortingRepository<Case, Long> {

}
