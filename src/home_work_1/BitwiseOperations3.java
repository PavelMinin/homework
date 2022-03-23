package home_work_1;

public class BitwiseOperations3 { // Побитовые операции Задача 1.5. Попытка выполнения побитовой операции с числом с плавающей точкой.
    public static void main(String[] args) {
        float a = 42.5F; // float value
        int b = -15; // BIN 1111 0001 (128 - 15 = 113 -> BIN 0111 0001)
        int c = 0; // this variable is using for bitwise operations and showing the result
        int d = 0; // special variable for trying to use bitwise operations with float value

        // c = a & b;
        // can't use operator & with float. First reduce a float type to an integer type

        d = (int) a; // reduce a float type to an integer type. We lose fractional part. 42.5 -> 42 -> BIN 0010 1010

        System.out.println("We can't use bitwise operators with a float type. We have to convert our value to the integer type.");
        System.out.println("Before converting float: " + a);
        System.out.println("After converting float to int: " + d + " -> BIN " + Integer.toBinaryString(d));

        c = d & b; // BIN 0010 1010 & 1111 0001 -> 0010 0000 -> DEC 32
        System.out.println("Bitwise AND: " + d + " & " + b + " = " + c);

        System.out.println("Work with other bitwise operators is described in BitwiseOperations1 and BitwiseOperations2.");
    }

}
