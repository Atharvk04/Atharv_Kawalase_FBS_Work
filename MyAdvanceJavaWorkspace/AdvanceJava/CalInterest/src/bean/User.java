package bean;

import java.util.Objects;

public class User 
{
	private double principal, rate;
	private int time;
	
	
	public User(double principal, double rate, int time) {
		super();
		this.principal = principal;
		this.rate = rate;
		this.time = time;
	}


	public double getPrincipal() {
		return principal;
	}


	public void setPrincipal(double principal) {
		this.principal = principal;
	}


	public double getRate() {
		return rate;
	}


	public void setRate(double rate) {
		this.rate = rate;
	}


	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}


	@Override
	public String toString() {
		return "User [principal=" + principal + ", rate=" + rate + ", time=" + time + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(principal, rate, time);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Double.doubleToLongBits(principal) == Double.doubleToLongBits(other.principal)
				&& Double.doubleToLongBits(rate) == Double.doubleToLongBits(other.rate) && time == other.time;
	}
	
	
}
