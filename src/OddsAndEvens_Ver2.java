import java.util.*;
public class OddsAndEvens_Ver2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String userName = userGreeting(input);
        String userSel = userSel(input, userName);
        playGame(input, userName, userSel);
    } // main

    private static String userGreeting(Scanner input) {
        System.out.println("Let’s play a game called \"Odds and Evens\"");
        System.out.print("What is your name? ");
        String userName = input.nextLine();
        return userName;
    } // userGreeting

    private static String userSel(Scanner input, String userName) {
        System.out.print("Hi " + userName + ", which do you choose?  (O)dds or (E)vens? ");
        String userChoice = String.valueOf(input.next().toUpperCase().charAt(0));
        if (userChoice.equals("O")) {
            System.out.println(userName + " has picked odds! The computer will be evens.");
        } else {
            System.out.println(userName + " has picked evens! The computer will be odds.");
        }
        printSeparator();
        return userChoice;
    } // userGreeting

    private static void playGame(Scanner input, String userName, String userSel) {
        // Part 2
        System.out.print("How many \"fingers\" do you put out? ");
        int userHand = input.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer + " \"fingers\".");
        printSeparator();
        int totalHand = userHand + computer;
        System.out.println(userHand + " + " + computer + " = " + totalHand);
        boolean oddOrEven = totalHand % 2 == 0;
        if(oddOrEven){
            System.out.println(totalHand + " is ...even!");
            if (userSel.equals("E")) {
                System.out.println("That means " + userName + " wins! :)");
            } else {
                System.out.println("That means computer wins! :)");
            }
        } else{
            System.out.println(totalHand + " is ...odd!");
            if (userSel.equals("E")) {
                System.out.println("That means computer wins! :)");
            } else {
                System.out.println("That means " + userName + " wins! :)");
            }
        }
        printSeparator();
    } //playGame

    public static void printSeparator() {
        System.out.println("----------------------------------------\n");
    } // printSeparator

} // OddsAndEvens_Ver2