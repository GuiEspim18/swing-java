package cpfValidator.View;

import cpfValidator.Model.CPF_DAO;

import javax.swing.*;

public class GenerateCPF_GUI {

    public static void show() {
        JOptionPane.showMessageDialog(null, CPF_DAO.generate());
    }

}
