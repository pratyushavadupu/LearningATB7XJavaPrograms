package ex_07222024;

import java.util.Scanner;

public class ScannerLab {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            scan.close();

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

        }
    }

