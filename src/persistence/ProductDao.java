package persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Product;

public class ProductDao {

	Session session;
	Transaction transaction;
	
	public void insert(Product p) throws Exception{
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.save(p);
		transaction.commit();
		session.close();
	}
	
	public List<Product> search() throws Exception{
		session = HibernateUtil.getSessionFactory().openSession();
		List<Product> list1 = session.createQuery(" FROM Product ").list();
		session.close();	
		return list1;
	}	
}