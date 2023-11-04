

import java.util.Scanner;
public class ChangeCalc{

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        //prompts user to enter amount of dollars
        System.out.println("Enter your dollar amount: "); 
        double dollars = s.nextDouble();
        
        System.out.println("\nYou have:\n ");

        // caclulates and displays 100s 
        int hund = (int)dollars/100; 
        System.out.println("\t- "+hund+" hundred(s)");

        dollars = dollars - hund *100; 
       
        // calculates and displays 50s 
        int fif = (int)dollars/50; 
        System.out.println("\t- "+fif+" fifty(s)");

        dollars = dollars - fif *50;

        // calculates and displays 20s
        int twen = (int)dollars/20; 
        System.out.println("\t- "+twen+" twenty(s)");

        dollars = dollars - twen *20;

        // calculates and displays 10s
        int ten = (int)dollars/10; 
        System.out.println("\t- "+ten+" ten(s)");
 
        dollars = dollars - ten *10;

        // calculates and displays 5s
        int five = (int)dollars/5; 
        System.out.println("\t- "+five+" five(s)");
 
        dollars = dollars - five *5;
        
        // calculates and displays 1s
        int ones = (int)dollars/1; 
        System.out.println("\t- "+ones+" one(s)");
  
        dollars = dollars - ones *1;

        // calculates and displays 0.25
        double quart = dollars/0.25; 
        System.out.println("\t- "+(int)quart+" quarter(s)");
  
        dollars = dollars - (int)quart *0.25;

        // calculates and displays 0.10
        double dime = dollars/0.10; 
        System.out.println("\t- "+(int)dime+" dime(s)");
  
        dollars = dollars - (int)dime *0.10;

        // calculates and displays 0.05
        double nickel = dollars/0.05; 
        System.out.println("\t- "+(int)nickel+" nickel(s)");
  
        dollars = dollars - (int)nickel *0.05;

        // calculates and displays 0.01
        double cent = dollars/0.01; 
        System.out.println("\t- "+(int)cent+" cent(s)");
  
        
        System.out.println("\nGoodbye!");

        s.close();


    }
}
