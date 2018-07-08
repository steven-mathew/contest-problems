import java.math.*;

import java.util.*;

public class ModInverse {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        String[] t = s.split(" ");
        
        BigInteger bi1, bi2;

        bi1 = new BigInteger(t[0]);
        bi2 = new BigInteger(t[1]);

        System.out.println(bi1.modInverse(bi2));
    }
}