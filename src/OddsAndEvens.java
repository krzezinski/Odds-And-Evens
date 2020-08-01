import java.util.*;
public class OddsAndEvens {
    public static void main(String[] args){
        // Part 1
        System.out.println("Let’s play a game called \"Odds and Evens\"");
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String userName = input.nextLine();
        System.out.print("Hi " + userName + ", which do you choose?  (O)dds or (E)vens? ");
        String userChoice = String.valueOf(input.next().toUpperCase().charAt(0));
        if (userChoice.equals("O")) {
            System.out.println(userName + " has picked odds! The computer will be evens.");
        } else {
            System.out.println(userName + " has picked evens! The computer will be odds.");
        }
        System.out.println("----------------------------------------\n");
        // Part 2
        System.out.print("How many \"fingers\" do you put out? ");
        int userHand = input.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer + " \"fingers\".");
        System.out.println("----------------------------------------\n");
        int totalHand = userHand + computer;
        System.out.println(userHand + " + " + computer + " = " + totalHand);
        boolean oddOrEven = totalHand % 2 == 0;
        if(oddOrEven){
            System.out.println(totalHand + " is ...even!");
            if (userChoice.equals("E")) {
                System.out.println("That means " + userName + " wins! :)");
            } else {
                System.out.println("That means computer wins! :)");
            }
        } else{
            System.out.println(totalHand + " is ...odd!");
            if (userChoice.equals("E")) {
                System.out.println("That means computer wins! :)");
            } else {
                System.out.println("That means " + userName + " wins! :)");
            }
        }
    } // main
} // OddsAndEvens