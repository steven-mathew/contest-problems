package DMOJ;

import java.io.*;
import java.util.*;

public class BronzeRecruits {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        int[] h = new int[n + 2];
        
        
        for(int i = 1; i <= n; i++){
            h[i] = Integer.parseInt(sc.nextLine());
        }
        
        int ugly = 0;
        
        for(int j = 1; j <= n; j++){
            if((h[j - 1] <= 41) && (h[j] <= 41) && (h[j + 1] <= 41)){
                ugly++;
            }
        }
        
        System.out.println(ugly);

    }
}
