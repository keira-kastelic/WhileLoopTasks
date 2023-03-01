/**
 * Auto Coin Lab
 * Author: Keira
 * Collaborator(s): Megan
 * On My Honor, I confirm that I followed all collaboration policy guidelines and that the work I am submitting is my own: KAK
 **/

public class WhileLoopTasks {
    public static void main(String[] args) {

        System.out.println("Task 1"); // labeling the task
        String phrase = new String("Today is monday November 15, 2021"); // creating my phrase
        int length = phrase.length(); // finding the length of the phrase for a numerical value to compare to
        while (length < 38) { // creating a while loop statement for printing the phrase 5 times
            System.out.println(phrase); // printing the phrase
            length++; // adding one digit to the number each time
        }

        System.out.println("Task 2"); // labeling the task
        int num = 15; // creating a variable for the number
        while (num >= 15 && num <= 20) { // creating a while loop statement to list numbers from 15 to 20
            System.out.println(num); // printing out the numbers
            num += 2; // adding two to get odd numbers
        }

        System.out.println("Task 3"); // labeling the task
        int integer = 1; // creating a varible for the loop
        while (integer >= 1 && integer <= 5){ // creating a while loop statement to print integers between 1 and 5
            System.out.println( integer *  integer); // finding the square of the numbers
            integer++; // adding one to find the next number
        }

        System.out.println("Task 4"); // labeling the task
        int count = 5; // creating a variable that starts at 5
        while (count <=5 && count >= 1){ // creating a while loop statements to print out numbers from five to one
            System.out.println(count); // printing out the numbers
            count --; // subtracting one to get to the next number
        } System.out.println("Blastoff!"); // souting blastoff

        System.out.println("Task 5"); // labeling the task
        int number = 1; // creating an integer for the numbers
        int sum = 0; // creating a variable that wouldbe the sum of the numbers
        while(number >= 1 && number <= 10){ // creating a while loop statement to print out numbers from 1 to 10
            System.out.println(number); // printing out the numbers
            sum = sum + number; // sunding the sum of the new are previous number
            number++; // ading one to get the value of the next number up
        } System.out.println(sum); // printing out the sum of all numbers
        }
    }