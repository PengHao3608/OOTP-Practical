import java.util.Scanner;
public class Practical1Q2 {
      public static void main(String[] args)   {
    int age, days, seconds;
    
    Scanner scan= new Scanner(System.in);
    System.out.print("Enter your age (years): ");
    age=scan.nextInt();
    days= age*365;
    seconds=days*86400;
    System.out.print("Age in years: " + age +" years" );
    System.out.print("\nAge in days: " + days +" days" );
    System.out.print("\nAge in seconds: " + seconds +" seconds\n" );
     	
}}
      
