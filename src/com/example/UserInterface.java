package com.example;

import java.util.Scanner;

public class UserInterface {
    private IssueTracker issueTracker;
    private Scanner scanner;

    public UserInterface() {
        this.issueTracker = new IssueTracker();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("1. Report an issue");
            System.out.println("2. Resolve an issue");
            System.out.println("3. List all issues");
            System.out.println("4. Show issue details");
            System.out.println("5. Exit");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    reportIssue();
                    break;
                case 2:
                    resolveIssue();
                    break;
                case 3:
                    listIssues();
                    break;
                case 4:
                    showIssueDetails();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void reportIssue() {
        System.out.println("Enter issue description:");
        String description = scanner.nextLine();
        Issue issue = new Issue(description);
        issueTracker.reportIssue(issue);
    }

    private void resolveIssue() {
        System.out.println("Enter issue index to resolve:");
        int index = Integer.parseInt(scanner.nextLine()) - 1;
        System.out.println("Enter resolution:");
        String resolution = scanner.nextLine();
        issueTracker.resolveIssue(index, resolution);
    }

    private void listIssues() {
        issueTracker.listIssues();
    }

    private void showIssueDetails() {
        System.out.println("Enter issue index:");
        int index = Integer.parseInt(scanner.nextLine()) - 1;
        issueTracker.showIssueDetails(index);
    }
}
