package com.codegym.wms.com.factory;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactoryServiceImpl implements FactoryService {
    @Autowired
    private FactoryRepository factoryRepository;

    //region SEARCH
    @Override
    public Iterable<Factory> findAll() {
        try {
            Iterable<Factory> factories = factoryRepository.findAll();
            if(Lists.newArrayList(factories).size() == 0) {
                return null;
            } else {
                return factories;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Iterable<Factory> findAllByNameContaining(String name) {
        return null;
    }

    @Override
    public Factory findById(String id) {
        return null;
    }

    @Override
    public Factory findByMaxId() {
        return null;
    }
    //endregion

    @Override
    public Factory save(Factory object) {
        return null;
    }



    @Override
    public void remove(Factory object) {

    }
}
