package Assign_ment;

import java.util.Scanner;

public class Assign_2 {
    /*
    Problem Statement A mathema cs teacher wants to analyze a posi ve integer entered by a student.
     For the given number, determine whether it is:  Even or Odd   Posi ve or Zero   Divisible by 5 or not
     The program must display all applicable classifica ons.
     Input Format A single integer N.
     Output Format Print three lines:
     Even/Odd
     Posi ve/Zero
     Divisible by 5/Not Divisible by 5
     */
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        if(num%2 == 0){
            System.out.println("Even number");
        }else {
            System.out.println("Odd number");
        }
        if(num > 0){
            System.out.println("Positive number");
        }else {
            System.out.println("Zero");
        }
        if(num%5 == 0){
            System.out.println("Divisible by 5");
        }else {
            System.out.println("Not Divisible by 5");
        }
    }
}
