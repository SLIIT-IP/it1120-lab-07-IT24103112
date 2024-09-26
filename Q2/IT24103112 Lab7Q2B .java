public class It24103112 Lab7Q2B {
    public static void main(String[] args) {
        int i;
        int j = 0;

        for (i = 1; i <= 5; i = i + 1) {
            System.out.print(i + "-");
            for (j = 1; j <= i; j = j + 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}