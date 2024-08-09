package com.rest.service;

import com.rest.model.Product;

public interface ProService {
	public Product savePro(Product P);
	public Product getOne(int id);

}
