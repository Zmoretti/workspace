package com.zmo.FlashCard;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudySession {
    private TerminologyBank terminologyBank;
    private Scanner scanner;

    public StudySession(TerminologyBank terminologyBank) {
        this.terminologyBank = terminologyBank;
        this.scanner = new Scanner(System.in);
    }

    public void showWelcomeMessage() {
        System.out.println("****************************");
        System.out.println("***        WELCOME       ***");
        System.out.println("***   TO STUDY SESSION   ***");
        System.out.println("****************************");

    }

    public int displayMainMenu() {
        while (true) {
            System.out.println("(1) Chapter 1 Java ");
            System.out.println("(2) Chapter 2 SQL");
            System.out.println("(3) Chapter 3 FrontEnd");
            System.out.println("(0) To end the program");
            System.out.print("Enter your choice: ");
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter 1 or 2.");
            }
        }
    }

    // public void start() {
    public void runStudySession() {
        showWelcomeMessage(); // Show the welcome message first
        while (true) { // Loop to allow multiple choices until the user decides to exit
            int choice = displayMainMenu(); // Get the user's choice each time within the loop

            if (choice == 1) {
                // Handle Chapter 1 JAVA
                System.out.println("You've selected Chapter 1) JAVA.");
                handleChapter1();
            } else if (choice == 2) {
                // Handle Chapter 2 SQL
                System.out.println("You've selected Chapter 2) SQL.");
                handleChapter2();
            } else if (choice == 3) {
                // Handle Chapter 3 FrontEnd
                System.out.println("You've selected Chapter 3) FrontEnd.");
                // Assuming there should be a method to handle Chapter 3 like the others
                handleChapter3();
            } else if (choice == 0) { // Corrected syntax here
                // Exit the study session
                System.out.println("Exiting the study session. Goodbye!");
                break; // Exit the loop
            } else {
                // Handle invalid input
                System.out.println("Invalid choice. Please select 1, 2, 3, or 0 to exit.");
            }
        }
    }


    private void handleChapter1() {
        // Implement your logic for Chapter 1 here
        System.out.println("Chapter 1: Introduction to Java.");
        List<Terminology> chapter1Terms = terminologyBank.getTerminologiesByChapter("1");
        Collections.shuffle(chapter1Terms);
        for (Terminology term : chapter1Terms) {
            System.out.println("What is " + term.getTerm() + "?");
            String answer = scanner.nextLine(); // Read user input
            System.out.println("Definition: " + term.getDefinition());
            // For example, you might want to fetch terminology or questions for Chapter 1
        }
    }

    private void handleChapter2() {
        System.out.println("Chapter 2: Welcome to SQL.");
        List<Terminology> chapter2Terms = terminologyBank.getTerminologiesByChapter("2");
        Collections.shuffle(chapter2Terms);
        for (Terminology term : chapter2Terms) {
            System.out.println("What is " + term.getTerm() + "?");
            String answer = scanner.nextLine(); // Read user input
            System.out.println("Definition: " + term.getDefinition());
        }
    }

    private void handleChapter3() {
        System.out.println("Chapter 3: Welcome to Front-End.");
        List<Terminology> chapter2Terms = terminologyBank.getTerminologiesByChapter("3");
        Collections.shuffle(chapter2Terms);
        for (Terminology term : chapter2Terms) {
            System.out.println("What is " + term.getTerm() + "?");
            String answer = scanner.nextLine(); // Read user input
            System.out.println("Definition: " + term.getDefinition());
        }
    }
    public void startMultipleChoiceQuiz(MultipleChoiceQuestion question) {
        System.out.println("Question:");
        System.out.println(question.getDefinition());

        // Get user input
        System.out.print("Enter your choice: ");
        int selectedOptionIndex = scanner.nextInt();

        // Check answer
        if (question.getCorrectOptionIndex() == selectedOptionIndex) {
            System.out.println("Correct answer!");
        } else {
            System.out.println("Incorrect answer. The correct answer is: " + question.getOptions().get(question.getCorrectOptionIndex()));
        }
    }
}





