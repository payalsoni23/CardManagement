package com.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.web.Entity.Card;

@Component
public interface CardRepository extends JpaRepository<Card, String> {

}
