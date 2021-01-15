package com.codegym.wms.com.factory;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactoryRepository extends PagingAndSortingRepository<Factory, String> {
    Iterable<Factory> findAllByFactoryNameContaining(String name);
}
