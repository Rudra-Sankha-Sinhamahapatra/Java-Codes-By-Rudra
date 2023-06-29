public class Scope {
    public static void main(String[] args) {
        int a = 10;
        String name = "Rudra";
        {
            a = 100; // Reassign the original reference variable with some other value
            name = "Raghav";
            System.out.println(name);
            System.out.println(a);
        }
        System.out.println(name);
        System.out.println(a);
        for (int i = 0; i < 6; i++) {
            a = 1000;
        }
        System.out.println(a);
    }

    static void random(int marks) {
        System.out.println(marks);
    }
}
