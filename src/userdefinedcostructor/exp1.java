package userdefinedcostructor;

public class exp1 {
	
	int num2;
	int num3;
	
	exp1()
	{
		num2=10;
		num3=20;
	}
public void addition()
{
System.out.println(num2+num3);	
}
public void multiplication()
{
System.out.println(num2*num3);	
}

public static void main(String[] args)
{
exp1 e1=new exp1();
e1.addition();
e1.multiplication();
}
}
