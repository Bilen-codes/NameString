import java.util.Scanner;
public class NameString {
    public static void main (String [] args){
        Scanner keyboard = new Scanner(System.in);
        String name;
        System.out.println("Please enter a name");
        name = keyboard.nextLine();
        System.out.println("The name is " + name);

    }
}
