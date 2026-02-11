import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
// 1- Write a program that takes three integers from the user and determines whether the object with given three edges is a triangle or not.
        System.out.println("enter a : ");
        int a = sc.nextInt();
        System.out.println("enter b : ");
        int b = sc.nextInt();
        System.out.println("enter c : ");
        int c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a && a - b < c && a - c < b && b - c < a) {
            System.out.println("it is a Triangle ");
        } else {
            System.out.println("it is not a Triangle");
        }

// 2- Write a java program that prints the following shape by using nested loops.
        for (int i = 0; i < 6; i++) {
            for (int j = i; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

// 3- Write a java program that determines a given matrix is a signature matrix or not.
        int[][] matrix = {
                {1, 0, 0, 0, 0},
                {0, -1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, -1}
        };
        boolean flag = true;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix.length != matrix[i].length) {
                flag = false;
                break;
            }
        }
        if (flag) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {

                    if (i == j) {
                        if (matrix[i][j] != 1 && matrix[i][j] != -1) {
                            flag = false;
                            break;
                        }
                    } else {
                        if (matrix[i][j] != 0) {
                            flag = false;
                            break;
                        }
                    }
                }
                if (!flag) break;
            }
        }
        if (flag)
            System.out.println("It is a signature matrix.");
        else
            System.out.println("It is NOT a signature matrix.");
    }

// 4- Write a cube(x) function that calculates x*x*x.
    static int cube(int x)
    {
        return x * x * x;
    }
    static int sumOfCubes(int n)
    {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + cube(i);
        }
        return sum;
    }
}