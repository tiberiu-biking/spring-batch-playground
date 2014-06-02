package com.tpo.w.spring.simple;

import org.springframework.batch.core.launch.support.CommandLineJobRunner;

public class SimpleJobRunner {

  public static void main( String[] args ) throws Exception {
    String[] myStringArray = { "simpleJob.xml", "simpleJob" };
    CommandLineJobRunner.main( myStringArray );
  }
}
