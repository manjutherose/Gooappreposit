package GooPro1172020.GooProA1172020;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.testng.annotations.Test;

public class GooApp {
	 static Logger lg = Logger.getLogger(GooPro1172020.GooProA1172020.GooApp.class);
	 @Test
    public void testcase1()
    {

	   
	    try
	    {
	    	 System.out.println( "www.hsn.com" );
	 	    PropertyConfigurator.configure("log4j.properties");
	 	    
	 	    //Log in console in and log file
	 	    
	 	    lg.info("Starting Testcase1 in AppTest");
	 	    lg.trace("tracing");
	 	    String fname = "Manju";
	 	    lg.trace("processing first name - " + fname);
	 	   throw new NullPointerException("demo"); 
	 	 
	 	    
	    }
	    catch(Exception e)
	    {
	    	 lg.error((e.getMessage()));
	    	 lg.fatal("fatal");
	    }
	    finally
	    {
	    	lg.info("Executing finally block");
	    }
	    }
  public void f() {
  }
}
