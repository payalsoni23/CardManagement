package com.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.Entity.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, String> {

}
