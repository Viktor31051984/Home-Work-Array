import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("task 1");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        double[] b = {1.57, 7.654, 9.986};
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        float[] c = {2.12f, 31.5f, 16.12f};
        System.out.println(c[0]);
        System.out.println(c[1]);
        System.out.println(c[2]);
        System.out.println("task 2");
        for (int i = 0; i < a.length; i++) {
            if (i != a.length - 1) {
                System.out.print(a[i] + ", ");
            } else {
                System.out.println(a[i]);
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (i != a.length - 1) {
                System.out.print(b[i] + ", ");
            } else {
                System.out.println(b[i]);
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (i != a.length - 1) {
                System.out.print(c[i] + ", ");
            } else {
                System.out.println(c[i]);
            }
        }
        System.out.println("Task 3");
        for (int i = a.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(a[i] + ", ");
            } else {
                System.out.println(a[i]);
            }
        }
        for (int i = b.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(b[i] + ", ");
            } else {
                System.out.println(b[i]);
            }
        }
        for (int i = c.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(c[i] + ", ");
            } else {
                System.out.println(c[i]);
            }
        }
        System.out.println("Task 4");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0);
            a[i]++;
        }
        System.out.println(Arrays.toString(a));
    }
    }
