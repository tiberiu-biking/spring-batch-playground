package com.tpo.batch.boot.docker.job;

import com.tpo.batch.boot.docker.job.item.LogItemWriter;
import com.tpo.batch.boot.docker.job.item.PenguinWisdomItemReader;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.support.PassThroughItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tiberiu
 * @since 20/03/16.
 */
@Configuration
public class PenguinWisdomJobConfig {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Job wisdomJob() {
        return jobBuilderFactory.get("Penguin wisdom job")
                .start(printWisdomStep())
                .build();
    }

    @Bean
    public Step printWisdomStep() {
        return stepBuilderFactory.get("Print penguin wisdom step")
                .<String, String>chunk(1)
                .reader(reader())
                .processor(processor())
                .writer(writer())
                .build();
    }

    @Bean
    public ItemWriter<String> writer() {
        return new LogItemWriter();
    }

    @Bean
    public ItemProcessor<String, String> processor() {
        return new PassThroughItemProcessor<>();
    }

    @Bean
    public ItemReader<String> reader() {
        return new PenguinWisdomItemReader();
    }

}

