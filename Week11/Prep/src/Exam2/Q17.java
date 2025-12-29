package Exam2;

public class Q17 {
    public static void main(String[] args) {
        fun(3);
    }

    private static void fun(int n) {
            if (n > 0) {
                fun(n - 1);
                System.out.print(n + " ");
                fun(n - 2);
            }
        }
    }

