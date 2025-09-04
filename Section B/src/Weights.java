/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
public class Weights extends FitnessExercises {
    private int sets; // the number of setsthe user will do 

    public Weights(String date, int duration, int sets) {
        super(date, duration);
        this.sets = sets;
    }

    @Override
    public int calculateCaloriesBurned() {
        return sets * 50; //50 calories per set
    }

    @Override
    public String getWorkoutType() {
        return "Weight Lifting";

}
}
