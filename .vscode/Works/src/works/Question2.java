package works;
import java.util.*;
public class Question2 {
 public static void main(String args[])
 {
	 Scanner sc=new Scanner (System.in);
	 System.out.println("Enter the Number");
	 int n=sc.nextInt();
	 int rem;
	 String decimal=" ";
	 String real=" ";
	 if(n==0)
		 System.out.println(0);
	 while(n>0)
	 {
		rem=n%2;
		decimal=decimal+rem;
		n=n/2;
	 }
	 for(int i=decimal.length()-1;i>0;i--)
	 {
		 char ch=decimal.charAt(i);
		 real=real+ch;
	 }
	 System.out.println("The binary equivalent is "+real);
 }
}
