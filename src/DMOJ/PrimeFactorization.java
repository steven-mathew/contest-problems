package DMOJ;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactorization {
    public static ArrayList<Integer> primeFactors(int n){
        ArrayList<Integer> fact = new ArrayList<>();
        for(int i = 2; i <= n; i++){
            while(n % i == 0){
                fact.add(i);
                n = n/i;
            }
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dummy = sc.nextInt();

        while(sc.hasNextLine()){
            int n = sc.nextInt();
            for(int num : primeFactors(n))
                System.out.print(num + " ");
            
            System.out.println();
        }
    }
}
