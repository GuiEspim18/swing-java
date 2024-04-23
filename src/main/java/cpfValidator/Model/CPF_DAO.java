package cpfValidator.Model;

import java.util.Random;

public class CPF_DAO {

    public static boolean validate(String cpf) {
        return false;
    }

    public static String generate() {
        int[] digits = new int[11];
        Random random = new Random();
        int total = 0;
        int value = 10;
        for (int i = 0; i < 9; i++) {
            digits[i] = random.nextInt(9);
            total += digits[i] * value;
            value--;
        }
        getDigit(9, digits, total);
        total = 0;
        value = 11;
        for (int i = 0; i < 10; i++) {
            total += digits[i] * value;
            value--;
        }
        getDigit(10, digits, total);
        return generateString(digits);
    }

    private static void getDigit(int index, int[] generated, int total) {
        int left = total % 11;
        if (left < 2) {
            generated[index] = 0;
        } else {
            generated[index] = left - 11;
            if (generated[index] < 0) {
                generated[index] = generated[index] * -1;
            }
        }
    }

    private static String generateString(int[] values) {
        String result = "";
        int dots = 0;
        for (int i = 0; i < 11; i++) {
            if (i > 0 && (i % 3 == 0)) {
                if (dots < 2) {
                    result += ".";
                    dots++;
                } else {
                    result += "-";
                }
            }
            result += values[i];
        }
        return result;
    }

}
