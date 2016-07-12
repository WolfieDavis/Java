import java.util.Scanner; 
import java.util.Random;
public class MathGame {
    public static void main (String[] args) {
    
    Scanner reader = new Scanner(System.in);
    
    Random rand = new Random();
    
    int input = 0;
    
    int answer = 0;
    
    int total;
    
    total = 0;
    
    do {
    int  num1 = rand.nextInt(10) + 1;
    
    int  num2 = rand.nextInt(10) + 1;
     
    int  operation = rand.nextInt(3) + 1;

    if (operation == 1)
    {
        System.out.println(num1 +" - "+  num2 +"=");
        input = reader.nextInt();
        
        answer = num1 - num2;
        
        System.out.println("The correct answer is " + answer);
        
        if (input == num1 - num2)
        {
            total = total + 1;
        }
        if (input != num1 - num2)
        {
             total = total - 1;
        }
    }
    
    
    if (operation == 2)
    {
        System.out.println(num1 +" + "+ num2 +"=");
        input = reader.nextInt();
        
        answer = num1 + num2;
        
        System.out.println("The correct answer is " + answer);
        
        if (input == num1 + num2)
        {
            total = total + 1;
        }
        if (input != num1 + num2)
        {
             total = total - 1;
        }
    }
    
    
    if (operation == 3)
    {
        System.out.println(num1 +" x "+ num2 +"=");
        input = reader.nextInt();
        
        answer = num1 * num2;
        
        System.out.println("The correct answer is " + answer);
        
        if (input == num1 * num2)
        {
            total = total + 1;
        }
        if (input != num1 * num2)
        {
             total = total - 1;
        }
    }
    
    System.out.println("You have " +total+ " points");

    }while (total < 25);
    
    }
}
