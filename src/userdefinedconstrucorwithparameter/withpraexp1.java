package userdefinedconstrucorwithparameter;

public class withpraexp1 {
	//exp 3: user defined constructor with parameter
	
	//declaration
	int num1;
	int num2;
	
	//step2: intialization
	//user defined constructor with 2 int(int,int) parameter
	//use1: to initialize global variable
	//use2:copy all the members of class into object
	
	withpraexp1(int a,int b)   // declaration
	{
		num1=a;  // assign local variable into global variable
		num2=b;
	}
	
	//step3: usage
	public void add()
	{
		System.out.println(num1+num2);
	}
	public void mul()
	{
		System.out.println(num1*num2);
	}
	public static void main(String[] args)
	{
		withpraexp1 v1=new withpraexp1(10,20); // initialization of local variable
		v1.add();
		
		exp2 e1=new exp2(90,30);
		e1.sub();
	}

}
