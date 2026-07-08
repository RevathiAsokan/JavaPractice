package Basics;

public class LiteralsProgram {
    public static void main(String[] args) {
        // Binary literal (prefix 0b)
        int num1 = 0b101;   // binary 101 = decimal 5
        System.out.println("Binary literal num1 = " + num1);

        // Hexadecimal literal (prefix 0x)
        int num2 = 0x1A;    // hexadecimal 1A = decimal 26
        System.out.println("Hexadecimal literal num2 = " + num2);

        // Numeric literal with underscores for readability
        int num3 = 1_000_000; // one million
        System.out.println("Numeric literal with underscores num3 = " + num3);

        //double
        double num4 = 56;
        System.out.println("Double set with integer = " + num4);

        //double
        double num5 = 1e10;
        System.out.println("Double set with integer = " + num5);
    }

}
