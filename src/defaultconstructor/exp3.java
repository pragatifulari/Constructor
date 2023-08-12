package defaultconstructor;

public class exp3 {
	// exp()
	//{
		
	//}
public static void main(String[] args)
{
	exp3 e1=new exp3();
	e1.m3();
			//new= keyword---- which is create blank obj
			//exp3= constructor call 
	System.out.println("---------------------");
	
	exp4 e2=new exp4();
	e2.m5();
	
}
public void m3()
{
System.out.println("Run program in same class");	
}
public void m4()
{
System.out.println("Run program same class in m4 method");	
}
}

