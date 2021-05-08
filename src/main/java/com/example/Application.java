package com.example;

import io.micronaut.runtime.Micronaut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
        LOGGER.info("\"Micronaut-Example\" application started successfully !!");
        LOGGER.info("Machine configuration: [Available processors: {}]", Runtime.getRuntime().availableProcessors());
    }
}
