package work1ramya;

import org.testng.annotations.AfterClass;  
import org.testng.annotations.Test;  

public class AnnotationRamya {

  
		 @AfterClass  
		 public void after_class()  
		 {  
		     System.out.println("The above are the programming languages");  
		 }  
		 @Test  
		 public void testcase1()  
		 {  
		     System.out.println("C");  
		 }  
		 @Test  
		 public void testcase2()  
		 {  
		     System.out.println("C++");  
		 }  
		 @Test  
		 public void testcase3()  
		 {  
		     System.out.println("Java");  
		 }  
		  
	}


