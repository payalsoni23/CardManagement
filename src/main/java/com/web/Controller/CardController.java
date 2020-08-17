package com.web.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.DAO.CardDAO;
import com.web.Entity.Card;

@RestController
@RequestMapping(value = "/api")
public class CardController {

	private CardDAO cardDAO;

	@Autowired
	public CardController(CardDAO theCardDAO) {
		cardDAO = theCardDAO;
	}

	@GetMapping("/cards")
	public List<Card> listCards() {
		return cardDAO.findAll();
	}
	/*
	 * @Autowired CardRepository repository;
	 * 
	 * @RequestMapping(value = "/") public String welcomePage() { return
	 * "welcome"; }
	 * 
	 * @RequestMapping(value = "/list-cards") public ModelAndView showCards() {
	 * ModelAndView myCards = new ModelAndView("list-cards");
	 * myCards.addObject(repository.findAll().toString()); return myCards; }
	 */
	/*
	 * @RequestMapping(value = "/add-card", method = RequestMethod.GET) public
	 * String addCard(ModelMap model) { model.addAttribute("todo", new Todo(0,
	 * getLoggedInUserName(model), "Default Desc", new Date(), false)); return
	 * "todo"; }
	 * 
	 * @RequestMapping(value = "/add-card", method = RequestMethod.POST) public
	 * String addTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
	 * 
	 * if (result.hasErrors()) { return "todo"; }
	 * 
	 * todo.setUser(getLoggedInUserName(model)); repository.save(todo); return
	 * "redirect:/list-todos"; }
	 */
}
