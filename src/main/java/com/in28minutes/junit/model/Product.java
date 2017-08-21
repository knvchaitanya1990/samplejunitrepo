package com.in28minutes.junit.model;

/**
 * Product Model API.
 */
public interface Product {

	public long getId();

	public String getName();

	public ProductType getType();

	public Amount getAmount();
}
