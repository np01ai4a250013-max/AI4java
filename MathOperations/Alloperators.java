package MathOperations;
import java.util.Scanner;


/**
 * Write a description of class Alloperators here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Alloperators
{

    public static void main (String[]args)
    {
    // int a=2;
    // int b=10;
    
    // float sum=a+b;
    // float sub=a-b;
    // //System.out.println(sum+"/n"+sub);
    // System.out.println(sum +"\n" + "," +sub);
    
    // Scanner sc=new Scanner(System.in);
    // System.out.println("enter a numeric grade");
    // float grade=sc.nextFloat();
    
    // String ans=(grade>=40)?"pass":"fail";
     // System.out.println("the student is:"+ans);
     
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the second value");
    int sec=sc.nextInt();
    
    int hour=sec/3600;
    int min=(sec%3600)/60;
    int sec2=sec%60;
    
   System.out.println("the hour is"+hour +"\n"+ "The min is"+min +"\n"+"The second is"+sec2);
   
   
    
    
    
    
    
    }
}