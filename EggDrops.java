import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author SYZ
 * @create 2019-07-27 20:49
 */
public class EggDrops {
    /***
     *  动态规划
     * 	你将获得 K 个鸡蛋，并可以使用一栋从 1 到 N  共有 N 层楼的建筑。
     * 	每个蛋的功能都是一样的，如果一个蛋碎了，你就不能再把它掉下去。
     * 	你知道存在楼层 F ，满足 0 <= F <= N 任何从高于 F 的楼层落下的鸡蛋都会碎，从 F 楼层或比它低的楼层落下的鸡蛋都不会破。
     * 	每次移动，你可以取一个鸡蛋（如果你有完整的鸡蛋）并把它从任一楼层 X 扔下（满足 1 <= X <= N）。
     * 	你的目标是确切地知道 F 的值是多少。
     * 	无论 F 的初始值如何，你确定 F 的值的最小移动次数是多少？小猪猪🐷
     * 	 
     * 	示例 1：
     * 	输入：K = 1, N = 2
     * 输出：2
     * 解释：
     * 鸡蛋从 1 楼掉落。如果它碎了，我们肯定知道 F = 0 。
     * 否则，鸡蛋从 2 楼掉落。如果它碎了，我们肯定知道 F = 1 。
     * 如果它没碎，那么我们肯定知道 F = 2 。
     * 因此，在最坏的情况下我们需要移动 2 次以确定 F 是多少。
     * 	示例 2：
     * 	输入：K = 2, N = 6
     * 输出：3
     * 	示例 3：
     * 	输入：K = 3, N = 14
     * 输出：4
     * 	 
     * 	提示：
     * 		1. 1 <= K <= 100
     * 		2. 1 <= N <= 10000
     */
    @Test
    public void test(){
        Assert.assertEquals(4, superEggDrop(3,14));
    }

    public int superEggDrop(int K, int N) {
        return dp(K, N);
    }

    Map<Integer, Integer> memo = new HashMap();
    public int dp(int K, int N) {
      if (!memo.containsKey(100*N+K)){
          int ans;
          if (N == 1){
              ans = 1;
          }else if (K == 1){
              ans = N;
          }else{
              int lo = 1;
              int hi = N;
              while (lo < hi){
                  int mi = (1+N)/2;
                  int t1 = dp(K-1, mi-1);
                  int t2 = dp(K,N-mi);
                  if (t1 < t2){
                      lo = mi;
                  } else if (t1 > t2){
                      hi = mi;
                  } else{
                      lo = hi = mi;
                  }
              }
              ans = 1 + Math.min(Math.max(dp(K, N-lo), dp(K-1, lo-1)), Math.max(dp(K, N-hi), dp(K-1, hi -1)));

          }
          memo.put(100*N+K, ans);
      }
      return memo.get(100*N+K);
    }
//    public int superEggDrop(int K, int N) {
//        int lo = 1;
//        int hi = N;
//        while (lo < hi) {
//            int middle = (lo + hi) / 2;
//            if (f(middle, K, N) < N) {
//                lo = middle + 1;
//            }
//            else {
//                hi = middle;
//            }
//        }
//        return lo;
//    }
//
//    public int f(int m, int K, int N) {
//        int ans = 0;
//        int r = 1;
//        for (int i = 1; i<=K; ++i){
//            r *= m-i+1;
//            r /= i;
//            ans += r;
//            if (ans >= N) {
//                break;
//            }
//        }
//        return ans;
//    }

}
