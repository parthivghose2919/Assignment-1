import java.util.*;
public class Question1{
   static boolean isprime(int n){
    if (n==0||n==1) 
    return false;
    if (n==2||n==3)
    return true;
    if(n%2==0||n%3==0)
    return false;
    for(int i=5;i<n;i+=6)
    {
        if(n%i==0||n%(i+2)==0)
        return false;
    }
    return true;
   }
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the Number");
    int n=sc.nextInt();
    System.out.println("The number is Prime:"+Question1.isprime(n));

}
}