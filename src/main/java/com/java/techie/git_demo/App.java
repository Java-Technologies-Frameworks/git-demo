package com.java.techie.git_demo;

public class App 
{
	public void addData(String data)
	{
		if(data.equals(Constant.DATA_TYPE))
				{
			       System.out.println("conditioncheck::>>");
				}	
	}	
   public void addMethod()
   {
	   System.out.println("adding a new methodin remote repo");
   }
    public static void main( String[] args )
    {
    	 App ap=new App();
    	 ap.addData("prasanna");
        System.out.println( "Hello World   !" );
		System.out.println( "test................" );
    }
}
