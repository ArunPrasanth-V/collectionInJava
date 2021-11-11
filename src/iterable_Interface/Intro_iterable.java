package iterable_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/*  Iterable is an inteface that used to iterate the 
 * given list 
 * it can be done in 3 ways
 *     1)enhanced for loop
 *     2)lamdas forEach Loop
 *     3)iterator method
 * 
 */
public class Intro_iterable {
	
	public static void main(String args[])
	{
		List<String> list = new ArrayList<String>();
		  
	      // add elements
	      list.add("Geeks");
	      list.add("for");
	      list.add("Geeks");
	  
	      //1st Way
	      for( String element : list ){
	          System.out.println( element );
	      }
	      
	      //2nd way
	      list.forEach(
	                    (element) -> System.out.println(element) 
	                  );
	      
	      //3rd way
	      Iterator<String> iterator = list.iterator();
	      
	        while (iterator.hasNext()) {
	            String element = iterator.next();
	            System.out.println(element);
	        }
	}

}
