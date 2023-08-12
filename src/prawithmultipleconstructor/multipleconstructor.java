package prawithmultipleconstructor;

public class multipleconstructor {
// user defined constructor --------->multiple constructor---------> constructor overloading
	int num1;
	int num2;
	String name; //smita
	
	//user defined without/zero parameter constructor
	
   multipleconstructor()
   {
	   num1=10;
	   num2=20;
   }
   // user defined with 2 int(int, int) parameter constructor
   multipleconstructor(int a,int b)
   {
	   int num1=a;
	   int num2=b;
   }
   //user defined constructor with string parameter
   multipleconstructor(String s1)
   {
	   name=s1;
   }
   public void studentName()
   {
	   System.out.println(name);
   }
   public void add()
   {
	   System.out.println(num1+num2);
   }
   
   public static void main(String[] args)
   {
	   multipleconstructor m1=new multipleconstructor();
	   m1.add();
	   
	   System.out.println("--------------------------");
	   multipleconstructor m2=new multipleconstructor();
	   m2.add();
	   
	   System.out.println("___________________________");
	   
	   multipleconstructor m3=new multipleconstructor();
	   m3.studentName();
   }
}
