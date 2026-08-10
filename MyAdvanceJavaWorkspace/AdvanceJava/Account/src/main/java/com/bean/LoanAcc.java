package com.bean;

import java.util.Objects;

import jakarta.persistence.Entity;

@Entity
public class LoanAcc extends Account
{
	private int tenure;
	private float PrincipalAmount;
	
	public LoanAcc() 
	{
		
	}

	public LoanAcc(int accNo, float accbal, MyDate accOpeningDate,int tenure, float principalAmount) 
	{
		super(accNo, accbal, accOpeningDate);
		this.tenure = tenure;
		PrincipalAmount = principalAmount;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public float getPrincipalAmount() {
		return PrincipalAmount;
	}

	public void setPrincipalAmount(float principalAmount) {
		PrincipalAmount = principalAmount;
	}

	@Override
	public String toString() {
		return "LoanAcc [tenure=" + tenure + ", PrincipalAmount=" + PrincipalAmount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(PrincipalAmount, tenure);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoanAcc other = (LoanAcc) obj;
		return Float.floatToIntBits(PrincipalAmount) == Float.floatToIntBits(other.PrincipalAmount)
				&& tenure == other.tenure;
	}
	
	
	
	
}
