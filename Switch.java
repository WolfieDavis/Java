import java.util.Scanner;
public class Switch {
    public static void main (String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
         int menu_option;
       
        System.out.println("What option do you want? (0,1,blank) ");
        menu_option = reader.nextInt();
        
        switch (menu_option) {
            case 0:
                    System.out.print("You selected option 0");
                    
            case 1:
                    System.out.print("You selected option 1");
            default:
                    System.out.print("You selected the blank option!");
        }
    }
}
