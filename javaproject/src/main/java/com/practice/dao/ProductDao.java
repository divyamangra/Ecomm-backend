//package com.practice.dao;
//
//import java.util.List;
//
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.practice.model.Product;
//
//
//@Repository
//public class ProductDao implements IProductDao{
//
//	@Autowired
//	private SessionFactory session;
//
//
//	public void add(Product product) {
//		session.getCurrentSession().save(product);
//
//	}
//
//public void update(Product product) {
//	session.getCurrentSession().update(product);
//
//	}
//public void delete(int product_id) {
//	session.getCurrentSession().delete(getProduct(product_id));
//
//
//}
//public Product getProduct(int product_id) {
//	return (Product)session.getCurrentSession().get(Product.class, product_id);
//}
//public List getAllProducts() {
//	return session.getCurrentSession().createQuery("from Product").list();
//
//}
//
//
//
//
//}
