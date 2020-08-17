package com.web.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.web.Entity.Card;

@Repository
public class CardDAOImpl implements CardDAO {

	private EntityManager entityManager;

	@Autowired
	public CardDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	@Transactional
	public List<Card> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Card> query = currentSession.createQuery("from Card", Card.class);
		List<Card> cardList = query.getResultList();
		return cardList;
	}

}
