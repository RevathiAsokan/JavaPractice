package Basics;

public class ConversionDemo {
    public static void main(String[] args) {
        int a = 130; // greater than byte range (-128 to 127)

        // Explicit conversion (int → byte)
        byte b = (byte) a;
        System.out.println("Explicit conversion: a = " + a + ", b = " + b);

        // Implicit conversion (byte → int)
        byte b2 = 100;
        int a2 = b2; // widening conversion happens automatically
        System.out.println("Implicit conversion: b2 = " + b2 + ", a2 = " + a2);

        // Demonstrating modulus logic
        // When casting int to byte, Java applies: value % 256
        int large = 257;
        byte small = (byte) large;
        System.out.println("Casting 257 to byte: " + small);
        System.out.println("257 % 256 = " + (257 % 256));
    }
}

