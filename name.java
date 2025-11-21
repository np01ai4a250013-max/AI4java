import java.util.Scanner;

/**
 * Write a description of class name here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class name
{
    public static void main(String[]args)
    {
    //System.out.println("My name is");
    //System.out.println("Pradhamsa pradhan");
    
    //String name="prashamsa pradhan";
    //System.out.println("My name is"+name);
    
    String name="pp";
    int Age=22;
    float GPA=22.2f;
    System.out.println(name);
     System.out.println(Age);
      System.out.println(GPA);
      
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value1");
    float value1=sc.nextFloat();
    System.out.println("Enter the value2");
    long value2=sc.nextLong();
    
     System.out.println("the value is,"+value1);
     System.out.println("the value is,"+value2);
     
     String big=(value1>=2)?"rue":"lse";
     System.out.println(big);
     String small=(value2>=10)?"e":"l";
      System.out.println(small);
      
     
    
    
    
    
    
    
    
    
    
    
      
      
    
    
    }
}