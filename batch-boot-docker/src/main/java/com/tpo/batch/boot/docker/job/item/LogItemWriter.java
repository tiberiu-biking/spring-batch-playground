package com.tpo.batch.boot.docker.job.item;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * @author Tiberiu
 * @since 20/03/16.
 */
public class LogItemWriter implements ItemWriter<String> {

    private static final Log logger = LogFactory.getLog(LogItemWriter.class);

    public void write(List<? extends String> data) throws Exception {
        logger.info(data);
    }
}
