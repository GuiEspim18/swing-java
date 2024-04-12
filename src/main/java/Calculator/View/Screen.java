package Calculator.View;

import javax.swing.JOptionPane;

public class Screen {

	public static void show() {
		boolean exit = false;
		while (!exit) {
			String message = "1. Soma\n2. Subtração\n3. Multiplicação\n4. Divisão\n5. Sair";
			int option = Integer.parseInt(JOptionPane.showInputDialog(null, message));
			switch (option) {
				case 1:
					sum(getValues());
					break;
				case 2:
					subtraction(getValues());
					break;
				case 3:
					multiplication(getValues());
					break;
				case 4:
					division(getValues());
					break;
				case 5:
					exit = true;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Erro, opção inválida!");
					break;
			}

		}
	}
	
	private static int[] getValues() {
		int[] values = new int[2];
		values[0] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor"));
		values[1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite mais um valor"));
		return values;
	}

	private static void sum(int[] values) {
		int result = values[0] + values[1];
		String message = values[0] + " + " + values[1] + " = " + result;
		JOptionPane.showMessageDialog(null, message);
	}

	private static void subtraction(int[] values) {
		int result = values[0] - values[1];
		String message = values[0] + " - " + values[1] + " = " + result;
		JOptionPane.showMessageDialog(null, message);
	}

	private static void multiplication(int[] values) {
		int result = values[0] * values[1];
		String message = values[0] + " x " + values[1] + " = " + result;
		JOptionPane.showMessageDialog(null, message);
	}

	private static void division(int[] values) {
		int result = values[0] / values[1];
		String message = values[0] + " / " + values[1] + " = " + result;
		JOptionPane.showMessageDialog(null, message);
	}
}
