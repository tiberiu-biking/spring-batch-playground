package com.tpo.w.spring.batch.reader;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.tpo.w.spring.model.Product;

public class ProductFieldSetMapper implements FieldSetMapper< Product > {

  @Override
  public Product mapFieldSet( FieldSet aFieldSet ) throws BindException {
    Product newProduct = new Product();

    newProduct.setId( aFieldSet.readString( ProductReaderConstants.ID ) );
    newProduct.setName( aFieldSet.readString( ProductReaderConstants.NAME ) );

    return newProduct;

  }

}
