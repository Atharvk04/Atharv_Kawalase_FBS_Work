package com.bean;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;


@Entity
@Table(name ="account_table")
@Inheritance(strategy = InheritanceType.JOINED)
public class Account 
{
	@Id
	private int accNo;
	
	@Column
	private float accbal;
	
	@Embedded
	private MyDate accOpeningDate;
	
	public Account() 
	{
		
	}

	public Account(int accNo, float accbal, MyDate accOpeningDate ) 
	{
		this.accNo = accNo;
		this.accbal = accbal;
		this.accOpeningDate = accOpeningDate;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public float getAccbal() {
		return accbal;
	}

	public void setAccbal(float accbal) {
		this.accbal = accbal;
	}

	
	public MyDate getAccOpeningDate() {
		return accOpeningDate;
	}

	public void setAccOpeningDate(MyDate accOpeningDate) {
		this.accOpeningDate = accOpeningDate;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accbal=" + accbal + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(accNo, accbal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return accNo == other.accNo && Float.floatToIntBits(accbal) == Float.floatToIntBits(other.accbal);
	}
	
	
}
