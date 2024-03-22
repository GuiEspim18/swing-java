package cps.cp_1_sem1;

import javax.swing.*;

public class CPJava {

    public static void main(String[] args) {
        // Agency
        String[] agencyCodes = new String[2];
        String[] agencyName = new String[2];
        String[] agencyAddress =  new String[2];
        int agencies = 0;

        // Client / Account
        String[] clientNames = new String[2];
        String[] clientCPF = new String[2];
        String[] clientAddress = new String[2];

        String[] accountNumber = new String[2];
        String[] digit = new String[2];
        double[] movimentation = new double[2];
        int[] agency = new int[2];
        int[] balance = new int[2];
        int accounts = 0;

        String[] menu = {"Ver contas", "Ver movimentações", "Cadastrar conta", "Cadastrar agencia", "Sair"};
        int limit = 5;

        String menuMessage  = "";
        for (int index = 0; index < limit; index++) {
            menuMessage += (index + 1) + ". " + menu[index] + "\n";
        }

        boolean end =  false;
        while (end == false) {
            int chooseOption  = Integer.parseInt(JOptionPane.showInputDialog(null, menuMessage, "Menu", -1));

            if (chooseOption == 1) {
                if (accounts == 0) {
                    JOptionPane.showMessageDialog(null, "<Erro>: Nenhuma conta cadastrada!", "Error", -1);
                } else {
                    String message = "";
                    for (int count = 0; count < accounts; count++) {
                        message += clientNames[count] + " | " + clientAddress[count] + " | " + clientCPF[count] + " | " + agencyCodes[agency[count] - 1] + "-" + accountNumber[count] + "-" + digit[count];
                    }
                    JOptionPane.showMessageDialog(null, message, "Accounts", -1);
                }
            }

            if (chooseOption == 2) {
                if (accounts == 0) {
                    JOptionPane.showMessageDialog(null, "<Erro>: Nenhuma conta cadastrada!", "Error", -1);
                } else {
                    String message = "";
                    for (int count = 0; count < accounts; count++) {
                        message += clientNames[count] + " | " + clientAddress[count] + " | " + clientCPF[count] + " | " + agencyCodes[agency[count] - 1] + "-" + accountNumber[count] + "-" + digit[count] + " | saldo: " + balance[count] + " | movimentação " + movimentation[count] + "\n";
                    }
                    JOptionPane.showMessageDialog(null, message, "Movimentation", -1);
                }
            }

            if (chooseOption == 3) {
                if (agencies == 0) {
                    JOptionPane.showMessageDialog(null, "<Erro>: Cadastre primeiro uma agencia pois a agencia não foi cadastrada!", "Error", -1);
                } else {
                    if (accounts < 2) {
                        clientNames[accounts] =  JOptionPane.showInputDialog(null, "Digite o nome do cliente", "Name", -1);
                        clientCPF[accounts] = JOptionPane.showInputDialog(null, "Digite o CPF do cliente", "CPF", -1);
                        clientAddress[accounts] = JOptionPane.showInputDialog(null, "Digite o endereço do cliente", "Address", -1);

                        String message = "";
                        for (int count = 0; count < agencies; count++) {
                            message += (count + 1) + ". " + agencyCodes[count] + " | " + agencyName[count] + " | " + agencyAddress[count] + "\n";
                        }
                        agency[accounts] = Integer.parseInt(JOptionPane.showInputDialog(null, message + "Digite a agencia da conta", "Address", -1));
                        accountNumber[accounts] =  JOptionPane.showInputDialog(null, "Digite o número da conta", "Number", -1);
                        digit[accounts] = JOptionPane.showInputDialog(null, "Digite o dígito da conta", "Digit", -1);
                        balance[accounts] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o saldo da conta", "Address", -1));
                        movimentation[accounts] = (balance[accounts] - (balance[accounts] * 0.35));
                        accounts++;
                    } else {
                        JOptionPane.showMessageDialog(null, "<Erro>: Limites de contas cadastradas excedido!", "Error", -1);
                    }

                }
            }

            if (chooseOption == 4) {
                if (agencies < 2) {
                    agencyCodes[agencies] =  JOptionPane.showInputDialog(null, "Digite o código da agência", "Code", -1);
                    agencyName[agencies] = JOptionPane.showInputDialog(null, "Digite o nome da agência", "Name", -1);
                    agencyAddress[agencies] = JOptionPane.showInputDialog(null, "Digite o endereço da agência", "Address", -1);
                    agencies++;
                } else {
                    JOptionPane.showMessageDialog(null, "<Erro>: Limites de agencias cadastradas excedido!", "Error", -1);
                }
            }
            if (chooseOption == 5) {
                JOptionPane.showMessageDialog(null, "Adeus! Até logo!", "Exit", -1);
                end=true;
            }
            if (chooseOption > limit) {
                JOptionPane.showMessageDialog(null, "<Erro>: Opção inválida!", "Error", -1);
                end = true;
            }
        }

    }

}
