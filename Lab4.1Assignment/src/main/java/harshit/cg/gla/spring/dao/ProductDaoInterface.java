package harshit.cg.gla.spring.dao;

import java.util.List;

import harshit.cg.gla.spring.entity.Product;


public interface ProductDaoInterface {
	
	public boolean create(Product product);
	public List<Product> reterive();
	

}
