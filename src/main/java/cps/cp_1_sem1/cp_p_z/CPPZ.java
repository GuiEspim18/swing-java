package cps.cp_1_sem1.cp_p_z;

import javax.swing.*;

public class CPPZ {
    public static void main(String[] args) {

        int menu = 0;
        String x = "";
        String code = "";
        String name = "";
        String type = "";
        String duration = "";
        String category = "";
        String rentValue = "";
        String boughtDate = "";

        String movieCode = "";
        String movieValue = "";
        String clientCode = "";
        String status = "";
        String withdrawnDate = "";
        String bringDate = "";

        do {
            x = JOptionPane.showInputDialog(null, "Locadora FIAP:\n1.Filme\n2.Locaçaõ\n3.Reserva");
            menu = Integer.parseInt(x);
            String options = "";
            int choose = 0;
            switch (menu) {
                case 1:
                    options = JOptionPane.showInputDialog(null, "1.Cadastrar\n2.Alterar\n3.Consultar\n4.Excluir");
                    choose = Integer.parseInt(options);
                    if (choose == 1) {
                        code = JOptionPane.showInputDialog(null, "Digite o código do filme: ");
                        name = JOptionPane.showInputDialog(null, "Digite o nome do filme: ");
                        type = JOptionPane.showInputDialog(null, "Digite o tipo do filme: ");
                        duration = JOptionPane.showInputDialog(null, "Digite o tempo de duração do filme: ");
                        category = JOptionPane.showInputDialog(null, "Digite a categoria do filme: ");
                        rentValue = JOptionPane.showInputDialog(null, "Digite o valor da locação do filme: ");
                        boughtDate = JOptionPane.showInputDialog(null, "Digite a data de compra do filme: ");
                    }
                    if (choose == 2) {
                        code = JOptionPane.showInputDialog(null, "Digite o código do filme: ");
                        name = JOptionPane.showInputDialog(null, "Digite o nome do filme: ");
                        type = JOptionPane.showInputDialog(null, "Digite o tipo do filme: ");
                        duration = JOptionPane.showInputDialog(null, "Digite o tempo de duração do filme: ");
                        category = JOptionPane.showInputDialog(null, "Digite a categoria do filme: ");
                        rentValue = JOptionPane.showInputDialog(null, "Digite o valor da locação do filme: ");
                        boughtDate = JOptionPane.showInputDialog(null, "Digite a data de compra do filme: ");
                    }
                    if (choose == 3) {
                        String message = "Codigo: " + code + "\nNome: " + name + "\nGenero: " + type + " \nDuração: " + duration + "\nCategoria: " + category + "\nValor de locação" + rentValue + "\nData de compra: " + boughtDate;
                        JOptionPane.showMessageDialog(null, message);
                    }
                    if (choose == 4) {
                        code = "";
                        name = "";
                        type = "";
                        duration = "";
                        category = "";
                        rentValue = "";
                        boughtDate = "";

                    }
                    if (choose > 4) {
                        JOptionPane.showMessageDialog(null, "Oplção inválida");
                    }
                    break;
                case 2:
                    options = JOptionPane.showInputDialog(null, "1.Cadastrar\n2.Alterar\n3.Consultar\n4.Excluir");
                    choose = Integer.parseInt(options);
                    if (choose == 1) {
                        movieCode = JOptionPane.showInputDialog(null, "Digite o código do filme: ");
                        movieValue = JOptionPane.showInputDialog(null, "Digite o valor do filme: ");
                        clientCode = JOptionPane.showInputDialog(null, "Digite o código do cliente: ");
                        status = JOptionPane.showInputDialog(null, "Digite o status da locação: ");
                        withdrawnDate = JOptionPane.showInputDialog(null, "Digite a data de retirada: ");
                        bringDate = JOptionPane.showInputDialog(null, "Digite a data de devolução: ");
                    }
                    break;
                case 3:
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Até mais!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida!");
                    break;

            }
        } while (menu != 4);

    }
}
