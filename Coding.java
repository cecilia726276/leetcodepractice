import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @Author SYZ
 * @create 2019-08-11 14:59
 */
public class Coding {
    static class bill{
        int id;
        int inTime;
        int outTime;

        public bill(int id, int inTime, int outTime){
            this.id = id;
            this.inTime = inTime;
            this.outTime = outTime;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A = in.nextInt();

        int[] ids = new int[n];
        int[] inTimes = new int[n];
        int[] outTimes = new int[n];

        bill[] bills = new bill[n];



        for (int i = 0; i < n; i++) {
            bills[i] = new bill(0,0,0);
            bills[i].id = in.nextInt();
            bills[i].inTime = in.nextInt();
            bills[i].outTime = in.nextInt();
        }
        Arrays.sort(bills, (o1, o2) -> o1.inTime - o2.inTime);

        for (int i = 0; i < n; i++) {
            ids[i] = bills[i].id;
            inTimes[i] = bills[i].inTime;
            outTimes[i] = bills[i].outTime;
        }

        int res = BS (A, inTimes);
        boolean isNull = true;
        ArrayList<Integer> out = new ArrayList<>();
        for (int i = 0; i <= res; i++) {
            if (inTimes[res] <= A && outTimes[i] >= A) {
                //System.out.println(ids[i]);
                out.add(ids[i]);
                isNull = false;
            }
        }
        out.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        if (isNull) {
            System.out.println("null");
        } else {
            for (int i = 0; i < out.size(); i++) {
                System.out.println(out.get(i));
            }
        }

    }

    static int BS(int target, int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l + 1 < r) {
            int mid = l + ((r - l) >> 1);

            if (nums[mid] > target) {
                r = mid;
            } else if (nums[mid] <= target) {
                l = mid;
            }
        }

        if (nums[r] == target) {
            return r;
        }

        return l;
    }

}
