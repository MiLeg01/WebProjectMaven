//package com.persistenceJPA;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.domain.User;
//
//public class CustomerServiceDaoImpl implements CustomerServiceDao {
//
//	private EntityManager entityManager;
//
//	@PersistenceContext
//	public void setEntityManager(EntityManager entityManager) {
//		this.entityManager = entityManager;
//	}
//
//	public CustomerServiceDaoImpl() {
//		// TODO Auto-generated constructor stub
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<User> getAllUser() {
//
//		Query query = entityManager.createQuery("from Customer");
//		return query.getResultList();
//	}
//
//	@Override
//	public User getUserId(Long id) {
//		return entityManager.find(User.class, id);
//	}
//
//	@Override
//	@Transactional(propagation = Propagation.REQUIRED)
//	public void addUser(User cust) {
//		entityManager.persist(cust);
//	}
//
//	@Override
//	@Transactional(propagation = Propagation.REQUIRED)
//	public void deleteUser(User cust) {
//		User cust2 = entityManager.find(User.class, cust.getId());
//		entityManager.remove(cust2);
//	}
//
//	@Override
//	@Transactional(propagation = Propagation.REQUIRED)
//	public void updateUser(User cust) {
//		entityManager.merge(cust);
//	}
//}
