package bean;

import java.util.Objects;

public class User 
{
	private int num1, num2;

	public User(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	@Override
	public String toString() {
		return "User [num1=" + num1 + ", num2=" + num2 + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(num1, num2);
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
		return num1 == other.num1 && num2 == other.num2;
	}

	
	
	
}
