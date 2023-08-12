package userdefinedconstrucorwithparameter;

public class exp2 {
	int num3;
	int num4;
	
	//user defined with 2int parameter constructor
	//use1: intialization global variable
	//use2: copy all the member of class into object
	
	exp2(int c,int d)
	{
		num3=c;
		num4=d;
	}
	public void sub()
	{
		System.out.println(num3-num4);
	}

}
