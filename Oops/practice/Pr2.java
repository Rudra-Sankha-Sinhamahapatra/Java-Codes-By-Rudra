public class Pr2 {
    public static void main(String[] args) {
        byte b;
int i=257; //byte ranges from -127 to 128 int value 257 so returns 1(if the value becomes 256 then it will result 0)
double d = 323.142;//accepts whole number only ..so 323%256=67
float f=323.142f;//same as double
char c='a';

System.out.println("\nConversion of int to byte.");

b = (byte) i;

System.out.println(b);

System.out.println("\nConversion of double to byte.");

b = (byte) d;

System.out.println(b);
b=(byte) f;
System.out.println("\nConversion of float to byte.");
System.out.println(b);

b=(byte) c;
System.out.println("\nConversion of char to byte.");
System.out.println(b);
    }
}
