package aepltest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import aepltest.dto.UserDto;

@Component
public class UserDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void userRegistration(UserDto userDto) {
		// TODO Auto-generated method stub
		entityTransaction.begin();
		entityManager.persist(userDto);
		entityTransaction.commit();
	}

	public List<UserDto> fetchAll() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("select data from aepl_user_registration data");
		List<UserDto> lct = query.getResultList();
		return lct;
	}

}
