package cpfValidator.Model;

import java.util.Random;

public class CPF_DAO {

    public static boolean validate(String cpf) {
        return false;
    }

    public static String generate() {
        int[] values = { 10, 9, 8, 7, 6, 5, 4, 3, 2 };
        int[] generated = new int[11];
        Random random = new Random();
        int total = 0;
        for (int i = 0; i < 9; i++) {
            int value = random.nextInt(9) * (values[i]);
            generated[i] = value;
            total += value;
        }
        int left = total % 11;
        if (left < 2) {
            generated[10] = 0;
        } else {
            generated[10]  = left - 11;
            if (generated[10] < 0) {
                generated[10]  = generated[10]  * -1;
            }
        }
        values[10] = 11;
        for (int i = 0; i < 10; i++) {

        }
//        System.out.println(digit2);
        return "";
    }

}
