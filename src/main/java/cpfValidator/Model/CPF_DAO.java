package cpfValidator.Model;

import java.util.Random;

public class CPF_DAO {

    private  static int [] digits;

    public static boolean validate(String cpf) {
        cpf = cpf.replace(".", "").replace("-", "");
        if (cpf.length() == 11) {
            int digit = Integer.parseInt(cpf.substring(9, 11));
            cpf = cpf.substring(0, 9);
            digits = new int[11];
            for (int i = 0; i < 9; i++) {
                digits[i] = Integer.parseInt(cpf.substring(i, i + 1));
            }
            getDigit(9, getTotal(9));
            getDigit(10, getTotal(10));
            int lastDigits = Integer.parseInt(digits[9] + "" + digits[10]);
            return lastDigits == digit;
        }
        return false;
    }

    public static String generate() {
        digits = new int[11];
        Random random = new Random();
        for (int i = 0; i < 9; i++) {
            digits[i] = random.nextInt(9);
        }
        getDigit(9, getTotal(9));
        getDigit(10, getTotal(10));
        return generateString(digits);
    }

    private static void getDigit(int index, int total) {
        int left = total % 11;
        if (left < 2) {
            digits[index] = 0;
        } else {
            digits[index] = left - 11;
            if (digits[index] < 0) {
                digits[index] = digits[index] * -1;
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

    private static int getTotal(int max) {
        int total = 0;
        int value = max + 1;
        for (int i = 0; i < max; i++) {
            total += digits[i] * value;
            value--;
        }
        return total;
    }

}
