package com.shop.model;

public class Payment 
{
	private int orderId;
	private String cardName;
	private String cardNumber;
	private String expiry;
	private String cvv;
	
	public Payment() 
	{

	}

	public Payment(int orderId, String cardName, String cardNumber, String expiry, String cvv) 
	{
		this.orderId = orderId;
		this.cardName = cardName;
		this.cardNumber = cardNumber;
		this.expiry = expiry;
		this.cvv = cvv;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	
	
}
