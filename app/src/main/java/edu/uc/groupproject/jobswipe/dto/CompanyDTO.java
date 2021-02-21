package edu.uc.groupproject.jobswipe.dto;

import java.util.ArrayList;

public class CompanyDTO {
    private String CompanyName;
    private String DetailedDescription;
    private String jobTitle;
    private String [] Location;
    private ArrayList<String> RecommendedSkills;
    private int Salary;

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getDetailedDescription() {
        return DetailedDescription;
    }

    public void setDetailedDescription(String detailedDescription) {
        DetailedDescription = detailedDescription;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String[] getLocation() {
        return Location;
    }

    public void setLocation(String[] location) {
        Location = location;
    }

    public ArrayList<String> getRecommendedSkills() {
        return RecommendedSkills;
    }

    public void setRecommendedSkills(ArrayList<String> recommendedSkills) {
        RecommendedSkills = recommendedSkills;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
