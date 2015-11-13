/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fullhouse;

import javax.swing.JOptionPane;


/**
 *
 * @author Dave
 */
public class FullHouse {

    private static MainWindow window;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        window = new MainWindow();
        window.setLocation(100,50);
        window.setVisible(true);
    }
    
    /**
     * Shows an error message dialog and logs the error
     * @param e the error that occured
     */
    public static void showDBError (Exception e) {
        JOptionPane.showMessageDialog(window, "<html>Er is een fout opgetreden bij de communicatie met de database.<br>"
                        + "Controleer of U verbinding met het internet heeft.<br>"
                        + "Contacteer uw beheerder als deze fout zich blijft voordoen", "Database error", JOptionPane.ERROR_MESSAGE);
        System.out.println(e);
    }
    
    public static boolean checkPostcode (String postcode) {
        if (postcode.length() != 6) {
            return false;
        }
        else {
            for (int i = 0; i < postcode.length(); i++) {
                char c = postcode.charAt(i);
                if (i <= 3) {
                    if (c < '0' || c > '9') {
                        return false;
                    }
                }
                else {
                    if (c < 'A' || c > 'Z') {
                        return false;
                    }
                }
            }
            return true;
        }
    }
    
    public static String addZeroes (String s, int length) {
        while (s.length() < length) {
            s = "0" + s;
        }
        return s;
    }
}
