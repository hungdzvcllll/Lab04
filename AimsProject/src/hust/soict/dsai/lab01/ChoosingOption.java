package hust.soict.dsai.lab01;

import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String args[]) {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change your first class ticket");
        JOptionPane.showMessageDialog(null, "You've chosen:" + (option == JOptionPane.YES_OPTION ? "yes " : "No"));
        System.exit(0);
    }
}