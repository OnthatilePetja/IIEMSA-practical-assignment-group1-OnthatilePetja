/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
public class WaterSports extends FitnessExercises {
      private int laps; // number of laps

    public WaterSports(String date, int duration, int laps) {
        super(date, duration);
        this.laps = laps;
    }

    @Override
    public int calculateCaloriesBurned() {
        return laps * 15; //15 calories per lap
    }

    @Override
    public String getWorkoutType() {
        return "Swimming";

}
}
