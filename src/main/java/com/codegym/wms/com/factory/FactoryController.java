package com.codegym.wms.com.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factory")
public class FactoryController {
    @Autowired
    FactoryService factoryService;
    @GetMapping
    public ResponseEntity<Iterable<Factory>> getAllFactory() {
        Iterable<Factory> factoryIterable = factoryService.findAll();
        if(factoryIterable == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(factoryIterable, HttpStatus.OK);
        }
    }
}
