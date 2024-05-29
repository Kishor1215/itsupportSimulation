package com.example;

import java.util.Date;

public class Issue {
    private String description;
    private String resolution;
    private Date reportedDate;
    private Date resolvedDate;

    public Issue(String description) {
        this.description = description;
        this.reportedDate = new Date();
    }

    public String getDescription() {
        return description;
    }

    public String getResolution() {
        return resolution;
    }

    public Date getReportedDate() {
        return reportedDate;
    }

    public Date getResolvedDate() {
        return resolvedDate;
    }

    public void resolve(String resolution) {
        this.resolution = resolution;
        this.resolvedDate = new Date();
    }

    @Override
    public String toString() {
        return "Issue{" +
                "description='" + description + '\'' +
                ", resolution='" + resolution + '\'' +
                ", reportedDate=" + reportedDate +
                ", resolvedDate=" + resolvedDate +
                '}';
    }
}
