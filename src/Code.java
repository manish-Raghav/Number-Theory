import java.util.*;

import static java.util.Comparator.*;

public class Code {
    public static void main(String[] args) {
      int n =18;
        System.out.println(countPrimes(n));

    }


    public static int countPrimes(int n) {

        int ans =0;
        if(n==1 ||n==0)
            return 0;

        boolean[] prime = new boolean[n];
        Arrays.fill(prime,true);
        prime[0] =prime[1]= false;
        for(int i=2;i<n;i++)
        {
            if(prime[i] ==true)
            {
                for(int j =2*i;j<n;j +=i )
                {
                    prime[j] =false;
                }
            }
        }
        for(boolean l : prime)
        {
            if(l)
                ans++;
        }
        return ans;
    }
}
