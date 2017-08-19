package junit;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class Tester {
	   int x = 3;
	   int y = 2;
	   Arithmetic test = new Arithmetic();
	   
	   @Test
	   public void testMultiply() {	  
	      assertEquals(x*y, test.multiply(x, y));     
	      //assertTrue(result == 6);
	      
	   }
	   
	   

}
