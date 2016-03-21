package com.tpo.batch.boot.docker.job.item;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Value;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Tiberiu
 * @since 20/03/16.
 */
public class PenguinWisdomItemReader implements ItemReader<String> {

    private static final Log logger = LogFactory.getLog(PenguinWisdomItemReader.class);
    public static final String BASH = "/bin/sh";
    public static final String COMMAND = "-c";
    private boolean once = false;

    @Value("${penguin.wisdom.command}")
    private String penguinSaysCommand;

    public String read() throws Exception {

        if (once) {
            return null;
        }
        logger.info("Running command: " + penguinSaysCommand);

        Process process = new ProcessBuilder(BASH, COMMAND, penguinSaysCommand).start();

        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line).append("\n");
        }
        once = true;
        return sb.toString();
    }
}
