package defaultconstructor;

public class exp1 {
// example- default constructor
	
	//default constructor -----> provided by compiler
	//user: to copy/load all the members of class into object
	// sample()
	//{
	//}
	public static void main(String[] args)
	{
		 exp1 e1=new exp1(); //default constructor call from same class
		 e1.m1();
		 e1.m2();
		 
		 //1.exp1-->classname-->datatype
		 //2.e1-->objname----> to identify/refer object
		 //3.new----> keyword---> use to create empty/blank object
		 
		 //exp1()---> classname()----> constructor call
		 System.out.println("---------------------");
		 
		 exp2 e2=new exp2();
		 e2.m3();      // default constructor call from diff class
	}
	public void m1()
	{
		System.out.println("running method m1");
	}
	public void m2()
	{
		System.out.println("running method m2");
	}
}
