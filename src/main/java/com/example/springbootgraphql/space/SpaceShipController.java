package com.example.springbootgraphql.space;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Slf4j
@Controller
public class SpaceShipController {

    private final SpaceShipService service;


    @QueryMapping()
    public SpaceShipEntity spaceship(@Argument Integer id) {
        return SpaceShipEntity.builder()
                .id(id)
                .captain("Mike")
                .fuel(99)
                .model("Nice")
                .destination(DestinationEnum.MARS)
                .build();
    }


}

