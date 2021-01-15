package com.codegym.wms.com;

public interface CommonService<E> {
    Iterable<E> findAll();

    Iterable<E> findAllByNameContaining(String name);

    E findById(String id);

    E save(E object);

    E findByMaxId();

    void remove(E object);
}
