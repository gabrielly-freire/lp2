package com.gabrielly.estudos.recursividade;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite N:");
        int n = scan.nextInt();

        System.out.println(fatorial(n));
      
        scan.close();
    }

    public static int fatorial(int n){
        if(n == 0){
            return 1;
        }
        return n * fatorial(n-1);
    }
}
