import java.util.Scanner; 
public class AgeFinder {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        int age;
        
        System.out.println("How old are you?");
        age = reader.nextInt();
        
        if (age > 33)
        {
            System.out.println("You are older than me!");
        }
        else if (age == 33)
        {
            System.out.println("You are the same age as me!");
        }
        else
        {
             System.out.println("You are younger than me!");
        }
    
    }
}
