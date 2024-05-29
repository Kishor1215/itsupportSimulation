package com.example;

import java.util.ArrayList;
import java.util.List;

public class IssueTracker {
    private List<Issue> issues;

    public IssueTracker() {
        this.issues = new ArrayList<>();
    }

    public void reportIssue(Issue issue) {
        issues.add(issue);
        System.out.println("Issue reported: " + issue.getDescription());
    }

    public void resolveIssue(int index, String resolution) {
        if (index >= 0 && index < issues.size()) {
            Issue issue = issues.get(index);
            issue.resolve(resolution);
            System.out.println("Issue resolved: " + issue.getDescription());
        } else {
            System.out.println("Invalid issue index.");
        }
    }

    public void listIssues() {
        for (int i = 0; i < issues.size(); i++) {
            System.out.println((i + 1) + ". " + issues.get(i).getDescription());
        }
    }

    public void showIssueDetails(int index) {
        if (index >= 0 && index < issues.size()) {
            System.out.println(issues.get(index));
        } else {
            System.out.println("Invalid issue index.");
        }
    }
}
