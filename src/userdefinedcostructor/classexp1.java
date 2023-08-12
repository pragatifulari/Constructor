package userdefinedcostructor;

public class classexp1 {
	// exp of user defined constructor
	
	//step1= declration of variable
	
	int num1;
	int num2;
	
	//step2: variable decalration
	//user defined constructor----> provided by user
	//use1: intialization global variable
	//use2: copy/load all the mem of class into obj
classexp1()
{
	num1=10;
	num2=20;
}
                                //step3: usage
public void addition()
{
System.out.println(num1+num2);	
}
public void multiplication()
{
System.out.println(num1*num2);	
}
 public static void main(String[] args)
 {
	classexp1 c1=new classexp1(); // user defined constructor call from same class
	c1.addition();
			
	 
 }
	

}
