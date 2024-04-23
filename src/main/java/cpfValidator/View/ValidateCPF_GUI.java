package cpfValidator.View;

import cpfValidator.Model.CPF_DAO;

import javax.swing.*;

public class ValidateCPF_GUI {

    public static void show() {
        String cpf = JOptionPane.showInputDialog(null, "Digite um cpf:");
        boolean isValid = CPF_DAO.validate(cpf);
        if (isValid) {
            JOptionPane.showMessageDialog(null, "Este CPF é verdadeiro!");
        } else {
            JOptionPane.showMessageDialog(null, "Este CPF é falso!");
        }
    }

}
