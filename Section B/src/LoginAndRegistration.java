/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
import javax.swing.*; 
public class LoginAndRegistration {
    private String username;//i used private so that the variables are used only in this class
    private String password;
    private String firstname;
    private String surname;
    private String cellphone;
    private boolean loginStatus = false;


    public boolean checkUsername(String username) {
        return username.contains("_") && username.length() <= 5;//restrictions for username
    }

    public boolean checkPasswordComplexity(String password) {
        if (password.length() < 8) return false;//pw less than 8, return as false
//reason for boolean data type is that a boolean's default is false as it contains nothing hence it has to check the info given then it can be true
//system sees boolean as wrong/default until a condition has been met then it changes the if statement to true
        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isDigit(c)) hasNumber = true;
            else if (!Character.isLetterOrDigit(c)) hasSpecial = true;//if not a letter or number then it has to be a special character
        }

        return hasUpper && hasNumber && hasSpecial;//returns to the person 
    }

    public boolean checkCellphoneNumber(String number) {//declared variable in the parameters
        return number.startsWith("+") && number.substring(1).matches("\\d{11}");//remove (1), make it 3, add 27 in the +, change the 11 to 9
    }
    //+ needed as international code
//number.substring(1) removes the + to check if there are 11 digits including the "27" because a number with 27 is 9 digits long
   

    public String registerUser() {
        firstname = JOptionPane.showInputDialog(null, "Enter your first name:");
        surname = JOptionPane.showInputDialog(null, "Enter your surname:");

        while (true) {
            username = JOptionPane.showInputDialog(null, "Create a username");
            if (checkUsername(username)) break;//break checks is username requirements are met and if not then else statement is shown 
            else JOptionPane.showMessageDialog(null, "Username is not correctly formated, please ensure that your username contains an underscore and is no more than five characters long");
        }

        while (true) {
            password = JOptionPane.showInputDialog(null, "Create a password");
            if (checkPasswordComplexity(password)) break;
            else JOptionPane.showMessageDialog(null, "Password is not correctly formated, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character");
        }

        while (true) {
            cellphone = JOptionPane.showInputDialog(null, "Enter cellphone number with country code");
            if (checkCellphoneNumber(cellphone)) break;
            else JOptionPane.showMessageDialog(null, "Invalid cellphone number. Make sure it: Starts with a '+' followed by your country code, has only numbers after the '+' and is no more than 10 digits long after the '+'");
        }

        return "Registration successful!";
    }

 
    public String loginUser() {
        JOptionPane.showMessageDialog(null, "Please log into the same account you created.");
        while (true) {
            String inputUsername = JOptionPane.showInputDialog(null, "Enter your username:");
            String inputPassword = JOptionPane.showInputDialog(null, "Enter your password:");

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                loginStatus = true;
                return "Login successful!";
            } else {
                JOptionPane.showMessageDialog(null, "Login failed. Try again.");
            }
        }
    }

    public String returnLoginStatus() {
        if (loginStatus) {
            return "Welcome " + firstname + " " + surname + ", it's great to see you again!";
        } else {
            return "You are not logged in.";
        }
    }
    
}

