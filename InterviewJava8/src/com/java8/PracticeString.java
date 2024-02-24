package com.java8;
class Singleton
{
	private static Singleton obj=null;
	private Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{
		if(obj==null)
		{
			synchronized(Singleton.class)
			{
			  if(obj==null)
			  {
				 obj= new Singleton();
			  }
			}
			return obj;
		}
		return obj;
		
	}
	
}
public class PracticeString 
{

	public static void main(String[] args) 
	{
		Singleton obj1=Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());

}
}