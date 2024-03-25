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

        do {
            x = JOptionPane.showInputDialog(null, "Locadora FIAP:\n1.Filme\n2.Locaçaõ\n3.Reserva");
            menu = Integer.parseInt(x);
            switch (menu) {
                case 1:
                    x = JOptionPane.showInputDialog(null, "1.Cadastrar\n2.Alterar\n3.Consultar\n4.Excluir");
                    int menu2 = Integer.parseInt(x);
                    if (menu2 == 1) {
                        code = JOptionPane.showInputDialog(null, "Digite o código do filme: ");
                        name = JOptionPane.showInputDialog(null, "Digite o nome do filme: ");
                        type = JOptionPane.showInputDialog(null, "Digite o tipo do filme: ");
                        duration = JOptionPane.showInputDialog(null, "Digite o tempo de duração do filme: ");
                        category = JOptionPane.showInputDialog(null, "Digite a categoria do filme: ");
                        rentValue = JOptionPane.showInputDialog(null, "Digite o valor da locação do filme: ");
                        boughtDate = JOptionPane.showInputDialog(null, "Digite a data de compra do filme: ");
                    }
                    break;
                case 2:
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
