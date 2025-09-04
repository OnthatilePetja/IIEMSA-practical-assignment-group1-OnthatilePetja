/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
import javax.swing.*;
import java.util.*; 
public class SeriesManager {
    
    private ArrayList<Series1> seriesList = new ArrayList<>();

    public void showMenu() {
        while (true) {
            String input = JOptionPane.showInputDialog(
                    "Please select one of the following menu items:\n\n" +
                            "(1) Capture a new series\n" +
                            "(2) Search for a series\n" +
                            "(3) Update a series\n" +
                            "(4) Delete a series\n" +
                            "(5) Print series report\n" +
                            "(6) Exit"
            );

            if (input == null) break;

            switch (input) {
                case "1": captureSeries(); break;
                case "2": searchSeriesById(); break;
                case "3": updateSeries(); break;
                case "4": deleteSeries(); break;
                case "5": seriesReport(); break;
                case "6": JOptionPane.showMessageDialog(null,"Goodbye!"); return;
                default: JOptionPane.showMessageDialog(null,"Invalid choice. Try again.");
            }
        }
    }

    private void captureSeries() {
        String id = JOptionPane.showInputDialog("Enter series ID:");
        String name = JOptionPane.showInputDialog("Enter series name:");

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age restriction:"));
        int episodes = Integer.parseInt(JOptionPane.showInputDialog("Enter number of episodes:"));

        seriesList.add(new Series1(id, name, age, episodes));
        JOptionPane.showMessageDialog(null, "Series captured successfully!");
    }

    private void searchSeriesById() {
        String id = JOptionPane.showInputDialog("Enter series ID to search:");
        Series1 series = findSeriesById(id);

        if (series != null) {
            JOptionPane.showMessageDialog(null, "Series found:\n" + series);
        } else {
            JOptionPane.showMessageDialog(null, "Series ID not found!");
        }
    }

    private void updateSeries() {
        String id = JOptionPane.showInputDialog("Enter series ID to update:");
        Series1 series = findSeriesById(id);

        if (series != null) {
            String newName = JOptionPane.showInputDialog("Enter new series name:", series.getSeriesName());
            series.setSeriesName(newName);

            int newAge = Integer.parseInt(JOptionPane.showInputDialog("Enter new age restriction:", series.getAgeRestriction()));
            series.setAgeRestriction(newAge);

            int newEpisodes = Integer.parseInt(JOptionPane.showInputDialog("Enter new number of episodes:", series.getNumberOfEpisodes()));
            series.setNumberOfEpisodes(newEpisodes);

            JOptionPane.showMessageDialog(null, "Series updated successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Series ID not found!");
        }
    }

    private void deleteSeries() {
        String id = JOptionPane.showInputDialog("Enter series ID to delete:");
        Series1 series = findSeriesById(id);

        if (series != null) {
            int confirm = JOptionPane.showConfirmDialog(null, "Delete this series?\n" + series, "Confirm Delete", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                seriesList.remove(series);
                JOptionPane.showMessageDialog(null, "Series deleted successfully!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Series ID not found!");
        }
    }

    private void seriesReport() {
        if (seriesList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No series available.");
        } else {
            StringBuilder report = new StringBuilder("=== Series Report ===\n\n");
            for (Series1 s : seriesList) {
                report.append(s).append("\n------------------\n");
            }
            JOptionPane.showMessageDialog(null, report.toString());
        }
    }

    private Series1 findSeriesById(String id) {
        for (Series1 s : seriesList) {
            if (s.getSeriesID().equalsIgnoreCase(id)) {
                return s;
            }
        }
        return null;
    }
}

