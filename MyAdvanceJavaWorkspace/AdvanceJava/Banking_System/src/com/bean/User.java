package com.bean;

import java.util.Objects;

public class User 
{
	int accNo;
	String accType;
	float accSal;
	static int count;
	
	static
	{
		count = 100000;
	}

	public User(String accType, float accSal) 
	{
		this.accNo = ++count;
		this.accType = accType;
		this.accSal = accSal;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public float getAccSal() {
		return accSal;
	}

	public void setAccSal(float accSal) {
		this.accSal = accSal;
	}

	public static int getCount() {
		return count;
	}

	
	public String toString() {
		
		return ("\n "+ "accNo=" + accNo + "\n "+
				"\n "+ "accType=" + accType +  "\n "+
				"\n "+ "accSal=" + accSal );
	}

	
	public int hashCode() {
		return Objects.hash(accNo, accSal, accType);
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return accNo == other.accNo && Float.floatToIntBits(accSal) == Float.floatToIntBits(other.accSal)
				&& Objects.equals(accType, other.accType);
	}
		
	
	
}
