/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
public class Series1 {
    
    
    private String seriesID;
    private String seriesName;
    private int ageRestriction;
    private int numberOfEpisodes;

    public Series1(String id, String name, int age, int episodes) {
        this.seriesID = id;
        this.seriesName = name;
        this.ageRestriction = age;
        this.numberOfEpisodes = episodes;
    }

    // Getters and setters
    public String getSeriesID() { return seriesID; }
    public String getSeriesName() { return seriesName; }
    public int getAgeRestriction() { return ageRestriction; }
    public int getNumberOfEpisodes() { return numberOfEpisodes; }

    public void setSeriesName(String seriesName) { this.seriesName = seriesName; }
    public void setAgeRestriction(int ageRestriction) { this.ageRestriction = ageRestriction; }
    public void setNumberOfEpisodes(int numberOfEpisodes) { this.numberOfEpisodes = numberOfEpisodes; }

    @Override
    public String toString() {
        return "Series ID: " + seriesID + "\n" +
               "Name: " + seriesName + "\n" +
               "Age Restriction: " + ageRestriction + "\n" +
               "Episodes: " + numberOfEpisodes;
    }
}

