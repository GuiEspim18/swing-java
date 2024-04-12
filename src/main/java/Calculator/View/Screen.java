package Calculator.View;

import javax.swing.JOptionPane;

public class Screen {

	public static void show() {
		String message = "1. Soma\n2. Subtração\n3. Multiplicação\n4. Divisão";
		int option = Integer.parseInt(JOptionPane.showInputDialog(null, message));
		switch (option) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				break;
		
		}
	}
	
	private int[] getValues() {
		int[] values = new int[2];
		return values;
	}
	
}
