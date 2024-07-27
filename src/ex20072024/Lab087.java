package ex20072024;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        //take a user input and check if number is even or odd

        // logic building
        // figure out the inputs
        // data type-int
        // how to take input in java-scanner class
        // nextInt()-> input
        // do we need conversion or directly
        // rough logic
        // optimize

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int user_input= sc.nextInt();
        System.out.println(user_input);

        if(user_input%2==0)
        {
            System.out.println("Even number");
        }
        else {
            System.out.println("odd number");
        }


    }
}
