package com.bean;

import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class MyDate 
{
	
	private int dd,mm,yy;
	
	public MyDate() 
	{
		
	}

	public MyDate(int dd, int mm, int yy) 
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}

	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dd, mm, yy);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		return dd == other.dd && mm == other.mm && yy == other.yy;
	}
	
	
	
	
}
