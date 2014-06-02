package com.tpo.w.spring.batch.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.tpo.w.spring.model.Product;

public class ProductItemWriter implements ItemWriter< Product > {

  @Override
  public void write( List< ? extends Product > aProductList ) throws Exception {
    for ( Product p : aProductList )
      System.out.println( p.getId() + "," + p.getName() );
  }
}
