package edu.uc.groupproject.jobswipe.dto;

import java.util.ArrayList;

public class CompanyDTO {
    private String companyName;
    private String detailedDescription;
    private String jobTitle;
    private String [] location;
    private ArrayList<String> recommendedSkills;
    private int Salary;
    private String fieldOfStudy;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDetailedDescription() {
        return detailedDescription;
    }

    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String[] getLocation() {
        return location;
    }

    public void setLocation(String[] location) {
        this.location = location;
    }

    public ArrayList<String> getRecommendedSkills() {
        return recommendedSkills;
    }

    public void setRecommendedSkills(ArrayList<String> recommendedSkills) {
        this.recommendedSkills = recommendedSkills;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }
}
