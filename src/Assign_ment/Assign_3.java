package Assign_ment;

import java.util.Scanner;

public class Assign_3 {
    /*
    Problem Statement A number-analysis applica on needs to process the digits of a given posi ve integer.
    Your task is to calculate:
    1. The sum of all digits.
    2. The product of all digits.
    3. Whether the number is divisible by 3 based on its digit sum.
    The program must process the number digit by digit using a loop.
    Input Format A single posi ve integer N.
    Output Format Print:
    Sum: <sum>
    Product: <product>
    Divisible by 3: Yes/No
     */

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int num2 = num;
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num = num/10;
        }

        System.out.println("Sum: "+ sum);

        int product = 1;
        while(num2 > 0){
            int pro = num2 % 10;
            product *= pro;
            num2/= 10;
        }

        System.out.println("Product: "+ product);

        if (sum%3 == 0){
            System.out.println("Divisible by 3: Yes ");
        }else {
            System.out.println("Divisible by 3: No");
        }
    }
}
