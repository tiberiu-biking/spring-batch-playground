package com.tpo.w.spring.simple;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * 
 * @author tareq.abedrabbo
 */
public class PrintTasklet implements Tasklet {

  private String message;

  public void setMessage( String message ) {
    this.message = message;
  }

  @Override
  public RepeatStatus execute( StepContribution aArg0, ChunkContext aArg1 ) throws Exception {
    System.out.print( message );
    return RepeatStatus.FINISHED;
  }
}
