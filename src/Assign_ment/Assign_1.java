package Assign_ment;

import java.util.Scanner;

public class Assign_1 {
    /*
    Problem Statement
    A local electricity board calculates the monthly electricity bill based on the number of units consumed.
    The billing system follows these rules:  First 100 units → ₹5 per unit   Next 100 units (101–200) → ₹7 per unit
     Next 200 units (201–400) → ₹10 per unit   Above 400 units → ₹15 per unit  For example, if a customer consumes 250 units,
    the first 100 units are charged at ₹5, the next 100 at ₹7, and the remaining 50 at ₹10. Write a program to calculate the total electricity bill.
    Input Format A single integer N, represen ng the number of units consumed. Output Format Print the total electricity bill.
    Problem Statement A local electricity board calculates the monthly electricity bill based on the number of units consumed.
    The billing system follows these rules:  First 100 units → ₹5 per unit   Next 100 units (101–200) → ₹7 per unit
     Next 200 units (201–400) → ₹10 per unit   Above 400 units → ₹15 per unit  For example, if a customer consumes 250 units,
    the first 100 units are charged at ₹5, the next 100 at ₹7, and the remaining 50 at ₹10. Write a program to calculate the total electricity bill.
    Input Format A single integer N, represen ng the number of units consumed.
    Output Format Print the total electricity bill.
     */

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the unit: ");
        int unit = input.nextInt();

        if(unit <= 100){
            System.out.println("Total electricity bill : " + (unit  * 5));
        } else if (unit > 100  && unit <201 ) {
            int bill1 = (100 * 5) + (unit - 100 ) * ( 7 ) ;
            System.out.println("Total electricity bill : " + bill1);
        } else if (unit > 200 && unit <400) {
            int bill2 = ((100 * 5) + (100 * 7) +(400 - unit) *(10)) ;
            System.out.println("Total electricity bill : " + bill2 );
        }else{
            int bill3 =  ((100 * 5) + (100 * 7) +(200 * 10) + (unit - 400) * (15 ));
            System.out.println("Total electricity bill : " +bill3 );
        }
    }

}
