import java.util.Scanner; 
public class LearningArrays {
    public static void main(String[] args) {
        int[] intArray;
        
    Scanner reader = new Scanner(System.in);
        
    intArray = new int[10];
    
            intArray[0] = 14;
            intArray[1] = 31;
            intArray[2] = 18;
            intArray[3] = 24;
            intArray[4] = 67;
            intArray[5] = 19;
            intArray[6] = 75;
            intArray[7] = 26;
            intArray[8] = 79;
            intArray[9] = 37;
            
    int answer;
        
        System.out.println("What number less than 100 do you want me to check?");
        answer = reader.nextInt();
        
        if (answer == 14)
        {
           System.out.println("The number " + answer + " is here."); 
        }
         if (answer == 31)
        {
           System.out.println("The number " + answer + " is here."); 
        }
         if (answer == 18)
        {
           System.out.println("The number " + answer + " is here."); 
        }
         if (answer == 24)
        {
           System.out.println("The number " + answer + " is here."); 
        }
         if (answer == 67)
        {
           System.out.println("The number " + answer + " is here."); 
        }
         if (answer == 19)
        {
           System.out.println("The number " + answer + " is here."); 
        }
         if (answer == 75)
        {
           System.out.println("The number " + answer + " is here."); 
        }
         if (answer == 26)
        {
           System.out.println("The number " + answer + " is here."); 
        }
         if (answer == 79)
        {
           System.out.println("The number " + answer + " is here."); 
        }
         if (answer == 37)
        {
           System.out.println("The number " + answer + " is here."); 
        }
        else 
        {
           System.out.println("The number " + answer + " is not here."); 
        }
       
        
    
    }
}
