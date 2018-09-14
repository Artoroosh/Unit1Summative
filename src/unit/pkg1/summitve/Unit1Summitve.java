/*
Corbinash 
 */
package unit.pkg1.summitve;
 import javax.swing.*;
public class Unit1Summitve {
    public static void main(String[] args) {
//Get input from user  
String fullName = JOptionPane.showInputDialog("What is your full name ");
String doubleStnOne = JOptionPane.showInputDialog("Enter a Number ");
String doubleStrTwo = JOptionPane.showInputDialog("Enter another Number");
//we set up the number for math 
Double doubleOne = Double.parseDouble(doubleStnOne);
Double doubleTwo = Double.parseDouble(doubleStrTwo);
//We do all the calculations 
Double sum =(doubleOne + doubleTwo);
Double Difference =(doubleOne - doubleTwo);
Double Product =(doubleOne * doubleTwo);
Double Quontient = (doubleOne / doubleTwo);       

//Convert users name to Caps
int space = fullName.indexOf(" ");
fullName= fullName.substring(0,space);
String fullNameInCaps = fullName.toUpperCase(); 

//We output to users
System.out.println("Your first name in caps is "+fullNameInCaps);
System.out.println("The sum is " + sum);
System.out.println("the Difference is "+Difference);
System.out.println("The Product is "+Product);
System.out.println("The Quontient is "+Quontient);




    }
    
}
