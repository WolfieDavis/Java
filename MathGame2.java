import java.util.Scanner; 
import java.util.Random;
public class MathGame2 {
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
    
    if (total < 25)
    {
     System.out.println("Self Destruct in");
    
    try {
    Thread.sleep(2000);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    
    System.out.println("10");
    
    try {
    Thread.sleep(2000);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    
    System.out.println("9");
    
    try {
    Thread.sleep(2000);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    
    System.out.println("8");
    
    try {
    Thread.sleep(2000);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    
    System.out.println("7");
    
    try {
    Thread.sleep(2000);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    
    System.out.println("6");
    
    try {
    Thread.sleep(2000);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    
    System.out.println("5");
    
    try {
    Thread.sleep(2000);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    
    System.out.println("4");
    
    try {
    Thread.sleep(2000);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    
    System.out.println("3");
    
    try {
    Thread.sleep(2000);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    
    System.out.println("2");
    
    try {
    Thread.sleep(2000);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    
    System.out.println("1");
    
    try {
    Thread.sleep(2000);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
    
    System.out.println("0");
    
    try {
    Thread.sleep(4000);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}

    System.out.println("KABOOM!");
    }
    
    }while (total < 25);
    
    }
}
