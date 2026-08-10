package com.bean;

import jakarta.persistence.Entity;

@Entity
public class SavingAcc extends Account
{
	private float intRate;
	
	public SavingAcc() 
	{
		
	}

	public SavingAcc(int accNo, float accbal, MyDate accOpeningDate,float intRate) 
	{
		super(accNo, accbal, accOpeningDate);
		this.intRate = intRate;
	}

	public float getIntRate() {
		return intRate;
	}

	public void setIntRate(float intRate) {
		this.intRate = intRate;
	}

	@Override
	public String toString() {
		return "SavingAcc [intRate=" + intRate + "]";
	}
	
	
}
