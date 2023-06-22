import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Primitive Data Types
        System.out.println("Enter a byte value:");
        byte byteValue = scanner.nextByte();

        System.out.println("Enter a short value:");
        short shortValue = scanner.nextShort();

        System.out.println("Enter an int value:");
        int intValue = scanner.nextInt();

        System.out.println("Enter a long value:");
        long longValue = scanner.nextLong();

        System.out.println("Enter a float value:");
        float floatValue = scanner.nextFloat();

        System.out.println("Enter a double value:");
        double doubleValue = scanner.nextDouble();

        System.out.println("Enter a char value:");
        char charValue = scanner.next().charAt(0);

        System.out.println("Enter a boolean value (true or false):");
        boolean booleanValue = scanner.nextBoolean();

        // Array
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Class, Object, and Interface
        System.out.println("Enter a class name:");
        String className = scanner.next();

        System.out.println("Enter an object name:");
        String objectName = scanner.next();

        System.out.println("Enter an interface name:");
        String interfaceName = scanner.next();

        // Print the values
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);

        System.out.println("Array elements:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Class name: " + className);
        System.out.println("Object name: " + objectName);
        System.out.println("Interface name: " + interfaceName);

        scanner.close();
    }
}
