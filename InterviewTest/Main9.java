package InterviewTest;

/**
 * @Author SYZ
 * @create 2019-08-11 21:14
 */

import java.util.*;

public class Main9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            String str = sc.next();
            char[] arr = str.toCharArray();
            int res = 0;
            List<Integer> list = new ArrayList<>();
            int cur = 0;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == 'N'){
                    cur++;
                }
                else {
                    list.add(cur);
                    cur=0;
                }
            }
            list.add(cur);
            if(list.size()<=3) {
                for(Integer i:list) {
                    res+=i;
                    res++;
                }
                res--;
            }else {
                int max = 0;
                for(int i = 0; i < list.size()-2; i++) {
                    max = list.get(i)+list.get(i+1)+list.get(i+2);
                    res = Math.max(max, res);
                }
                res = res+2;
            }
            System.out.println(res);
        }
        sc.close();
    }

}
