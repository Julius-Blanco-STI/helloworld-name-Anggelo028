package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {
    public static void main(String[] args) {
        Scanner ans = new Scanner(System.in);
        
        System.out.println("-----Hello World-----\n");
        
        System.out.print("Whats your name?  ");
            String name = ans.nextLine();
                System.out.println("");
            
        System.out.print("How old are you?  ");
            String age = ans.nextLine();
                System.out.println("");
            
        System.out.print("Whats your address?  ");
            String add = ans.nextLine();
                System.out.println("");
                
        System.out.println("Hi " +name);
        System.out.println("Your age is " +age);
        System.out.println("You live at " +add);
                
    }
    
}
