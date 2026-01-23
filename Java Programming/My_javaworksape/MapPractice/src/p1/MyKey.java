package p1;

public class MyKey implements Comparable 
{
	int key;

	public MyKey(int key) {
		super();
		this.key = key;
	}

	@Override
	public String toString() {
		return "\n"+ this.key ;
	}

	@Override
	public int compareTo(Object o) 
	{
		MyKey mk = (MyKey)o;
		return this.key-mk.key;
	}

	
	
	
}
