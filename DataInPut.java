import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public final class DataInPut {

    public static DecimalFormat df = new DecimalFormat("#.##");

    private static void writeText(java.lang.String wr) {
        if (wr == null)
            System.out.print("Enter data: ");
        else
            System.out.print(wr);
    }

    public static Long getLong(java.lang.String message) throws IOException {
        java.lang.String s = getString(message);
        return Long.valueOf(s);
    }

    public static char getChar(java.lang.String message) throws IOException {
        java.lang.String s = getString(message);
        return s.charAt(0);
    }

    public static int getInt(java.lang.String message) {
        java.lang.String s = "";
        int res;

        while (true) {
            try {
                s = getString(message);
                res = Integer.parseInt(s);
                break;
            } catch (Exception e) {
                System.out.println("Error");
            }
        }

        return res;
    }

    public static double getDouble(java.lang.String message) {
        java.lang.String s;
        double res;

        while (true) {
            try {
                s = getString(message);
                res = Double.parseDouble(s);
                break;
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        return res;
    }

    public static java.lang.String getString(java.lang.String message) {
        System.out.print(message);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        java.lang.String name;
        while (true) {
            try {
                name = br.readLine();
                break;
            } catch (Exception e) {
                System.out.print("Error.Try again: ");
            }
        }

        return name;
    }

    public static char getLetter(java.lang.String message) {
        char letter;
        while (true) {
            try {
                java.lang.String s = getString(message);
                letter = s.toLowerCase().charAt(0);
                if ((letter >= 'a' && letter <= 'z') || (letter >= 'а' && letter <= 'я') && s.length() == 1) {
                    break;
                } else {
                    System.out.println("Error. Enter a letter of the Ukrainian, Russian or English alphabet");
                }
            } catch (Exception e) {
                System.out.println("Error. Enter a letter of the Ukrainian, Russian or English alphabet");
            }
        }

        return letter;
    }
}