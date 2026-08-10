package aspect.provider;

import java.io.FileInputStream;
import java.util.Properties;

import services.InterestCal;

public class ObjectProvider 
{
	public static InterestCal createObject()
	{
		InterestCal i1 = null;
		
		try
		{
			FileInputStream fis = new FileInputStream(".//Resources//info.properties");
			
			Properties p = new Properties();
			p.load(fis);
			
			String className = p.getProperty("BusinessClass");
			
			i1 = (InterestCal) Class.forName(className).newInstance();
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return i1;
	}
}
