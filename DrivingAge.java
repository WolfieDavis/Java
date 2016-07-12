import java.util.Scanner; 
public class DrivingAge {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        int driving;
        int age;
        
        System.out.println("How old are you?");
        age = reader.nextInt();
        
        if (age > 16)
        {
            System.out.println("Hey you can drive!");
        }
        else
        {
             System.out.println("You are too young to drive!");
        }
        
        
        System.out.println(driving);
    }
}
