package com.tpo.batch.boot.docker.job;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Tiberiu
 * @since 20/03/16.
 */
@Configuration
@EnableAutoConfiguration
@EnableBatchProcessing
@Import(PenguinWisdomJobConfig.class)
public class PenguinWisdomConfig {
}
