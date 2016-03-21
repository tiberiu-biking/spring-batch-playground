package com.tpo.batch.boot.docker.app;

import com.tpo.batch.boot.docker.job.PenguinWisdomConfig;
import org.springframework.boot.SpringApplication;

/**
 * @author Tiberiu
 * @since 20/03/16.
 */
public class PenguinWisdomApp {

    public static void main(String[] args) {
        SpringApplication.run(PenguinWisdomConfig.class, args);
    }

}
