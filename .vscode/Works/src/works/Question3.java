package works;
import java.util.Scanner;
public class Question3{
	public static int isreverse(int n)
	{
		int rem;
		 int decimal=0;
		 
		 if(n==0)
			 return 0;
		 while(n>0)
		 {
			rem=n%10;
			decimal=decimal*10+rem;
			n=n/10;
		 }
		 return decimal;
	}
 public static void main(String args[])
 {
	 Scanner sc=new Scanner (System.in);
	 System.out.println("Enter the Number");
	 int n=sc.nextInt();
	 int reversed=isreverse(n);
	 System.out.println("The Reverse is "+reversed);
 }
}