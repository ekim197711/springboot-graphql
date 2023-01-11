package com.example.springbootgraphql.space;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface SpaceShipRepository extends CrudRepository<SpaceShipEntity, Integer> {

    @Query("SELECT T FROM SpaceShipEntity as T")
    List<SpaceShipEntity> findSome();
}

