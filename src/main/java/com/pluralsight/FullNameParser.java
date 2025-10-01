package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        // Variables
//        String firstName = "";
//        String middleName = "";
//        String LastName = "";

        //Format options: First Last | First M. Last
        String formatOptionPrompt = "Select format 1 or 2: \n 1)  First Last\n 2)  First Middle Last";
        System.out.println(formatOptionPrompt);
        int userFormatOption = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter your full name: ");
        String userFullName = scanner.nextLine().trim();


        //Print name based on user choice
        if (userFormatOption == 1){
            String[] splitName = userFullName.split(" ");
            System.out.println("First name:  "+ splitName[0] + "\n Last Name: " + splitName[1]);
        }
        // Get the middle initial
        else{
            String[] splitName = userFullName.split(" ");
            char middleInitial = splitName[1].charAt(0);
            System.out.println("First name:  "+ splitName[0] + "\n Middle name: " + middleInitial + ".\n" + "Last name: " + splitName[2]);
        }




    }
}
