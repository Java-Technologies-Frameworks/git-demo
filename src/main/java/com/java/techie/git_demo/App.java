package com.java.techie.git_demo;

/**
 * Hello world!
 *
 */
public class App 
{
	public void addData(String data)
	{
		System.out.println("inside addData method of String type:");
		if(data.equals("java techie prasanna"))
				{
			       System.out.println("conditioncheck::>>");
				}
				
	}
    public static void main( String[] args )
    {
    	 App ap=new App();
    	 ap.addData("prasanna");
        System.out.println( "Hello World!" );
    }
}
