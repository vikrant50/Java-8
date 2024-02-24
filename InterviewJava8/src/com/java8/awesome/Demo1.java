package com.java8.awesome;

@FunctionalInterface
interface Message
{
	abstract void message(String msg);//we can't call this method
	
	
}
public class Demo1 
{


	public static void main(String[] args)
	{
	

		    //after lamda expression
		    Message message2=(msg)->System.out.println(msg);
			message2.message("hi amit");
	}

}
            