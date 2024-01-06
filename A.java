import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 //Print A in * pattern
	 //int n=5;
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int mid = n/2;
	 for(int i=1;i<=n;i++){
	     for(int j=1;j<=n;j++){
	         if(i==1 || i==mid || j==1 || j==n){
	             System.out.print("*");
	         }
	         else
	        System.out.print(" ");
	     }
	      System.out.println();
	 }
