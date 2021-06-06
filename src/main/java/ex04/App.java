/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Mauricio Rios
 */
package ex04;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String noun = myApp.getNoun();
        String verb = myApp.getVerb();
        String adj = myApp.getAdj();
        String adverb = myApp.getAdverb();
        String outputString = myApp.generateOutputString(noun, verb, adj, adverb);
        myApp.printOutput(outputString);
    }

    public String getNoun() {
        System.out.print("Enter a noun: ");
        return in.nextLine();
    }

    public String getVerb() {
        System.out.print("Enter a verb: ");
        return in.nextLine();
    }

    public String getAdj() {
        System.out.print("Enter a adjective: ");
        return in.nextLine();
    }

    public String getAdverb() {
        System.out.print("Enter a adverb: ");
        return in.nextLine();
    }

    public String generateOutputString(String noun, String verb, String adj, String adverb) {
        return "Do you "+verb+" your "+adj+" "+noun+" "+adverb+"? That's hilarious!";
    }

    public void printOutput(String outputString) {
        System.out.print(outputString);
    }
}
