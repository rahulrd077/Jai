package projpackager.TestDemo;
import java.util.*;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Faa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LIFO
		
		PriorityQueue s = new PriorityQueue();
		
		
		s.add("Zebra");
		s.add("Rahul");
		s.add("9");
		s.add("8");
		
		
		
		
		System.out.println("First output");
		
		System.out.println(s);
		
		System.out.println(" size of first output is = "+s.size());
		
		
		
		s.add("Hen");
		
System.out.println("Second output");
System.out.println(s);
System.out.println("size of second output is = "+s.size());


    System.out.println("Check the contains method       :->>>>  "
    		+ s.contains("Das"));
    s.remove("Hen");
    System.out.println("Third output ");
    System.out.println(s);
    System.out.println("size of third output is = "+s.size());
	
	
	}

}
