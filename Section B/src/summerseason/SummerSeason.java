/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package summerseason;

/**
 *
 * @author lab_services_student
 */
import javax.swing.*; 
public class SummerSeason {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SummerSeason login = new SummerSeason();

        String registerMessage = login.registerUser();
        JOptionPane.showMessageDialog(null, registerMessage);
        
        String loginMessage = login.loginUser();
        JOptionPane.showMessageDialog(null, loginMessage);

        String status = login.returnLoginStatus();
        JOptionPane.showMessageDialog(null, status);
        
        FitnessExercises[] Fitnessexercises = new FitnessExercises[10]; 
        int count = 0;
        int choice;
        
        do {
            String menu = """
                    --- Fitness Tracker Menu ---
                    1. Add Running
                    2. Add Cycling
                    3. Add Swimming
                    4. Add Weight Lifting
                    5. View Report
                    0. Exit
                    """;

            String input = JOptionPane.showInputDialog(null, menu, "Fitness Tracker", JOptionPane.QUESTION_MESSAGE);
            
    
            if (input == null) break;
            
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
                choice = -1;
            }
            
                        switch (choice) {
                case 1: // Running
                    String rDate = JOptionPane.showInputDialog("Enter date (yyyy-mm-dd):");
                    int rDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter duration (minutes):"));
                    int distance = Integer.parseInt(JOptionPane.showInputDialog("Enter distance (km):"));
                    FitnessExercises[count++] = new Treadmill(rDate, rDuration, distance);
                    break;

                case 2: // Cycling
                    String cDate = JOptionPane.showInputDialog("Enter date (yyyy-mm-dd):");
                    int cDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter duration (minutes):"));
                    int cDistance = Integer.parseInt(JOptionPane.showInputDialog("Enter distance (km):"));
                    FitnessExercises[count++] = new PedalCruising(cDate, cDuration, cDistance);
                    break;

                      case 3: // Swimming
                    String sDate = JOptionPane.showInputDialog("Enter date (yyyy-mm-dd):");
                    int sDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter duration (minutes):"));
                    int laps = Integer.parseInt(JOptionPane.showInputDialog("Enter number of laps:"));
                    FitnessExercises[count++] = new WaterSports(sDate, sDuration, laps);
                    break;

                case 4: // Weight Lifting
                    String wDate = JOptionPane.showInputDialog("Enter date (yyyy-mm-dd):");
                    int wDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter duration (minutes):"));
                    int sets = Integer.parseInt(JOptionPane.showInputDialog("Enter number of sets:"));
                    FitnessExercises[count++] = new Weights(wDate, wDuration, sets);
                    break;

 case 5: // Report
                    int totalCalories = 0;
                    StringBuilder report = new StringBuilder("--- Workout Report ---\n");
                    for (int i = 0; i < count; i++) {
                        report.append(FitnessExercises[i]).append("\n");
                        totalCalories += FitnessExercises[i].calculateCaloriesBurned();
                    }
                    report.append("\nTotal Workouts: ").append(count);
                    report.append("\nTotal Calories Burned: ").append(totalCalories);

                    JOptionPane.showMessageDialog(null, report.toString(), "Workout Report", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Exiting Fitness Tracker. Goodbye!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid option. Try again.");
            }





    
       





