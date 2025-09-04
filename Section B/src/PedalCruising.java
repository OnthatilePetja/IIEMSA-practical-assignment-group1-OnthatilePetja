/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
public class PedalCruising extends FitnessExercises {
     private int distance; 

    public PedalCruising(String date, int duration, int distance) {
        super(date, duration);
        this.distance = distance;
    }

    @Override
    public int calculateCaloriesBurned() {
        return distance * 40; // ~40 calories per km
    }

    @Override
    public String getWorkoutType() {
        return "Cycling";

}
}
