package com.web.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CARD")
public class Card {

	public Card() {

	}

	public Card(String bankName, String cardNumber, String expiryDate) {
		this.bankName = bankName;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
	}

	@Column(name = "Bank_name")
	String bankName;

	@Id
	@Column(name = "Card_number")
	String cardNumber;

	@Column(name = "Expiry_date")
	String expiryDate;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "CardDetails [cardNumber=" + cardNumber + ", bankName=" + bankName + ", expiryDate=" + expiryDate + "]";
	}

}
