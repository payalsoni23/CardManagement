package com.web.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.web.Entity.Card;
import com.web.Repository.CardRepository;

@RestController
@RequestMapping(value = "/api")
public class CardController {

	@Autowired
	private CardRepository cardRepo;

	/*
	 * @Autowired public CardController(CardRepository theCardDAO) { cardRepo =
	 * theCardDAO; }
	 */

	@GetMapping("/showCards")
	public ModelAndView listCards() {
		ModelAndView myCards = new ModelAndView("showCards.jsp");
		List<Card> cards = cardRepo.findAll(Sort.by(Sort.Direction.ASC, "expiryDate"));
		myCards.addObject("cards", cards);
		return myCards;
	}

	@RequestMapping(value = "/addCard", method = RequestMethod.POST)
	public String addCard(@RequestParam String bankName, @RequestParam String cardNumber,
			@RequestParam String expiryDate) {
		Card card = new Card();
		card.setBankName(bankName);
		card.setCardNumber(cardNumber);
		card.setExpiryDate(expiryDate);
		cardRepo.save(card);
		return "Card saved - " + card.toString();
	}

}
