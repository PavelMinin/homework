package home_work_1;

public class BitwiseOperations2 { // Побитовые операции Задача 1.3. Отрицательные вводные данные
    public static void main(String[] args) {
        int a = -42; // BIN 1101 0110 (128 - 42 = 86 -> BIN 0101 0110)
        int b = -15; // BIN 1111 0001 (128 - 15 = 113 -> BIN 0111 0001)
        //byte temp = (byte) 0b1101_0110;
        //byte temp2 = (byte) 0b1111_0001;
        int c = 0; // this variable is using for bitwise operations and showing the result
        int d = 0; // special variable for >>> operations

        c = a & b; // bitwise AND BIN 1101 0000 -> DEC -48
        System.out.println("Bitwise AND: " + a + " & " + b + " = " + c);

        c = a | b; // bitwise OR BIN 1111 0111 -> DEC -9
        System.out.println("Bitwise OR: " + a + " | " + b + " = " + c);

        c = a ^ b; // bitwise XOR BIN 0010 0111 -> DEC 39
        System.out.println("Bitwise XOR: " + a + " ^ " + b + " = " + c);

        c = ~ a; //BYTE bitwise NOT BIN 1101 0110 -> 0010 1001 -> DEC 41
        System.out.println("Bitwise NOT: ~ " + a + " = " + c);

        c = ~ b; //BYTE bitwise NOT BIN 1111 0001 -> 0000 1110 -> DEC 14
        System.out.println("Bitwise NOT: ~ " + b + " = " + c);

        c = (byte) a << 1; //BYTE bitwise shift to the left for 1 bit BIN 1101 0110 -> 1010 1100 -> DEC -84 (-128 + 44 = -84)
        System.out.println("Bitwise shift to the left for 1 bit: " + a + " << " + "1" + " = " + c);

        c = (byte) b << 2; //BYTE bitwise shift to the left for 2 bit BIN 1111 0001 -> 1100 0100 -> DEC -60 (-128 + 68 = -60)
        System.out.println("Bitwise shift to the left for 2 bits: " + b + " << " + "2" + " = " + c);

        c = a >> 2; //bitwise shift to the right for 2 bit BIN 1101 0110 -> 1111 0101 -> DEC -11 (-128 + 117)
        System.out.println("Bitwise shift to the right for 2 bits: " + a + " >> " + "2" + " = " + c);

        c = b >> 2; //bitwise shift to the right for 2 bit BIN 1111 0001 -> 1111 1100 -> DEC -4 (-128 + 124)
        System.out.println("Bitwise shift to the right for 2 bits: " + b + " >> " + "2" + " = " + c);

        d = a & 255; //cut 3 bytes from the left using bitwise AND and pattern BIN 0000 0000 0000 0000 0000 0000 1111 1111
        c = d >>> 2; //bitwise shift to the right for 2 bit (inserting 0 to the left) BIN 1101 0110 -> 0011 0101 -> DEC 53
        System.out.println("Bitwise shift to the right for 2 bits (inserting 0 to the left): " + a + " >>> " + "2" + " = " + c);

        d = b & 255; //cut 3 bytes from the left using bitwise AND and pattern BIN 0000 0000 0000 0000 0000 0000 1111 1111
        c = d >>> 2; //bitwise shift to the right for 2 bit (inserting 0 to the left) BIN 1111 0001 -> 0011 1100 -> DEC 60
        System.out.println("Bitwise shift to the right for 2 bits (inserting 0 to the left): " + b + " >>> " + "2" + " = " + c);
    }
}
