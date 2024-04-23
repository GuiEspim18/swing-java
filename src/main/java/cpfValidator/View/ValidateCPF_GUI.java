package cpfValidator.View;

import cpfValidator.Model.CPF_DAO;

import javax.swing.*;

public class ValidateCPF_GUI {

    public static void show() {
        String cpf = JOptionPane.showInputDialog(null, "Digite um cpf:");
        CPF_DAO.validate(cpf);
    }

}
