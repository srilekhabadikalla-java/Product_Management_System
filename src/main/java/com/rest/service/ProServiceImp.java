package com.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Charges;
import com.rest.model.Product;
import com.rest.repo.ProductRepo;
@Service
public class ProServiceImp implements ProService {
	@Autowired
	private ProductRepo repo;


	@Override
	public Product savePro(Product P) {
		
		Charges ch=P.getCharges();
		if (ch == null) {
	        ch = new Charges();
	        P.setCharges(ch);
	    }
		double pr=P.getPrice();
		double g=0.0,dis=0.0,dc=0.0 ,fp=0.0;
		
		switch (P.getCategory()) {
        case "Electronics":
        	g=pr*0.15;
        	dis=pr*0.18;
        	dc=350;
            break;
        case "Home Appliances":
        	g=pr*0.22;
        	dis=pr*0.24;
        	dc=800;
            break;
        case "Clothing":
        	g=pr*0.40;
        	dis=pr*0.12;
        	dc=0;
            break;
        case "Furniture":
        	g=pr*0.10;
        	dis=pr*0.18;
        	dc=300;
            break;
        default:
            System.out.println("Unknown Category");
            break;
    }
		 fp=pr+dc+g-dis;
		ch.setDelivary_charges(dc);
		ch.setDiscount(dis);
		ch.setGst(g);
		P.setFinalPrice(fp);
	
		Product prod=repo.save(P);
		
		return prod;
	}

	@Override
	public Product getOne(int id) {
		Product p=repo.findById(id).get();
		return p;
	}

}
