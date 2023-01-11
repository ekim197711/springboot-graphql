package com.example.springbootgraphql.space;

import org.springframework.stereotype.Service;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class SpaceShipService {
    private final SpaceShipRepository repository;
}

