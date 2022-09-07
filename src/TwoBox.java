import java.util.Scanner;

public class TwoBox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a1 = scan.nextInt();
        int b1 = scan.nextInt();
        int c1 = scan.nextInt();

        int a2 = scan.nextInt();
        int b2 = scan.nextInt();
        int c2 = scan.nextInt();

        {
            int x = 0;
            if (a1 > b1) {
                x = a1;
                a1 = b1;
                b1 = x;
            }
            if (b1 > c1) {
                x = b1;
                b1 = c1;
                c1 = x;
            }
            if (a1 > b1) {
                x = a1;
                a1 = b1;
                b1 = x;
            }
            if (a2 > b2) {
                x = a2;
                a2 = b2;
                b2 = x;
            }
            if (b2 > c2) {
                x = b2;
                b2 = c2;
                c2 = x;
            }
            if (a2 > b2) {
                x = a2;
                a2 = b2;
                b2 = x;
            }
        }
        if (a1 == a2 && b1 == b2 && c1 == c2) {
            System.out.println("Boxes are equal");
        } else if (a1 >= a2 && b1 >= b2 && c1 >= c2) {
            System.out.println("The first box is larger than the second one");
        } else if (a1 <= a2 && b1 <= b2 && c1 <= c2) {
            System.out.println("The first box is smaller than the second one");
        } else {
            System.out.println("Boxes are incomparable");
        }
    }
}