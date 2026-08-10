package aspect.provider;

import java.io.FileInputStream;
import java.util.Properties;

import services.Calc;

public class ObjectProvider {

		public static Calc createObject()
		{
			Calc c1 = null;
			
			try 
			{
				FileInputStream fis = new FileInputStream(".//Resources//info.properties");
				
				Properties p = new Properties();
				p.load(fis);
				
				String className = p.getProperty("BusinessClass");
				
				c1 = (Calc) Class.forName(className).newInstance();
				
			}
			
			catch (Exception e)
			{
				e.printStackTrace();
			}
			
			return c1;
		}
}
