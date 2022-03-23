package home_work_1;

public class BitwiseOperations1 { // Побитовые операции Задача 1.2. Положительные вводные данные
    public static void main(String[] args) {
        int a = 42; // BIN 0010 1010
        int b = 15; // BIN 0000 1111
        int c = 0; // this variable is using for bitwise operations and showing the result

        c = a & b; // bitwise AND BIN 0000 1010 -> DEC 10
        System.out.println("Bitwise AND: " + a + " & " + b + " = " + c);

        c = a | b; // bitwise OR BIN 0010 1111 -> DEC 47
        System.out.println("Bitwise OR: " + a + " | " + b + " = " + c);

        c = a ^ b; // bitwise XOR BIN 0010 0101 -> DEC 37
        System.out.println("Bitwise XOR: " + a + " ^ " + b + " = " + c);

        c = ~ a; //BYTE bitwise NOT BIN 0010 1010 -> 1101 0101 (first digit - negative value, BIN 101 0101 = DEC 85) -> DEC -128 + 85 = -43;
        // use the same algorithm to work with int (32 bit)
        System.out.println("Bitwise NOT: ~ " + a + " = " + c);

        c = ~ b; //BYTE bitwise NOT BIN 0000 1111 -> 1111 0000 (first digit - negative value, BIN 111 0000 = DEC 112)
        // use the same algorithm to work with int (32 bit)
        System.out.println("Bitwise NOT: ~ " + b + " = " + c);

        c = a << 1; //bitwise shift to the left for 1 bit BIN 0010 1010 -> 0101 0100 -> DEC 84
        System.out.println("Bitwise shift to the left for 1 bit: " + a + " << " + "1" + " = " + c);

        c = b << 3; //bitwise shift to the left for 3 bit BIN 0000 1111 -> 0111 1000 -> DEC 120
        System.out.println("Bitwise shift to the left for 3 bits: " + b + " << " + "3" + " = " + c);

        c = a >> 1; //bitwise shift to the right for 1 bit BIN 0010 1010 -> 0001 0101 -> DEC 21
        System.out.println("Bitwise shift to the right for 1 bit: " + a + " >> " + "1" + " = " + c);

        c = b >> 3; //bitwise shift to the right for 3 bit BIN 0000 1111 -> 0000 0001 -> DEC 1
        System.out.println("Bitwise shift to the right for 3 bits: " + b + " >> " + "3" + " = " + c);

        c = a >>> 2; //bitwise shift to the right for 2 bit (inserting 0 to the left) BIN 0010 1010 -> 0000 1010 -> DEC 10
        System.out.println("Bitwise shift to the right for 2 bits (inserting 0 to the left): " + a + " >>> " + "2" + " = " + c);

        c = b >>> 1; //bitwise shift to the right for 2 bit (inserting 0 to the left) BIN 0000 1111 -> 0000 0111 -> DEC 7
        System.out.println("Bitwise shift to the right for 1 bit (inserting 0 to the left): " + b + " >>> " + "1" + " = " + c);
    }
}
