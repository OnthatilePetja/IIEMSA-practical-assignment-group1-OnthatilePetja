/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
public abstract class FitnessExercises {
    private String date;
    private int duration; //mins

    public FitnessExercises(String date, int duration) {
        this.date = date;
        this.duration = duration;
    }

    public String getDate() {
        return date;
    }

    public int getDuration() {
        return duration;
    }

   
    public abstract int calculateCaloriesBurned();

   
    public abstract String getWorkoutType();

    @Override
    public String toString() {
        return getWorkoutType() + " | Date: " + date + " | Duration: " + duration 
               + " mins | Calories Burned: " + calculateCaloriesBurned();
}
}
