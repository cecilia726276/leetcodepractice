package InterviewTest;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @Author SYZ
 * @create 2019-08-11 15:54
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++){
            String s = sc.nextLine();
            // Start processing
            int maximum = 0;
            int previous = 0;
            for (int j = 0; j < s.length();j++){
                if (s.charAt(j) == 'N'){
                    previous++;
                    maximum = (previous > maximum ? previous: maximum);
                } else {
                    previous = 0;
                }
            }
            System.out.println(maximum+2);
        }
    }

}
//    static int currentMax;
//    static int currentMin;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        //sc.nextLine();
//        int[] heights = new int[n];
//        currentMax = 0;
//        currentMin = Integer.MAX_VALUE;
//        for (int i = 0; i < n; i++){
//            heights[i] = sc.nextInt();
//            currentMax = (heights[i] > currentMax ? heights[i] : currentMax);
//            currentMin = (heights[i] < currentMin ? heights[i] : currentMin);
//        }
//        int floodNumber = sc.nextInt();
//        for (int i = 0; i < floodNumber; i++){
//            int floodHeight = sc.nextInt();
//            int cluster = getClusternumber(heights,floodHeight);
//            System.out.println(cluster);
//        }
//    }
//
//    public static int getClusternumber(int[] heights, int floodHeight){
//        int counter = 0;
//        int cluster = 0;
//        if (floodHeight > currentMax){
//            return 0;
//        }
//        if (floodHeight < currentMin){
//            return 1;
//        }
//        for(int i = 0; i < heights.length; i++){
//            if (floodHeight >= heights[i]){
//                if (counter > 0){
//                    cluster++;
//                    counter = 0;
//                }
//            } else {
//                counter++;
//            }
//        }
//        if (counter > 0){
//            cluster++;
//        }
//        return cluster;
//    }
//}

//    static int m;
//    static int t;
//    static int m1;
//    static int t1;
//    static int m2;
//    static int t2;
//    static int volumn;
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for (int i = 0; i < N; i++) {
//            m = sc.nextInt();
//            t = sc.nextInt();
//            m1 = sc.nextInt();
//            t1 = sc.nextInt();
//            m2 = sc.nextInt();
//            t2 = sc.nextInt();
//            volumn = 0;
//            int outcome = getVolumn(t);
//            System.out.println(outcome);
//        }
//    }
//
//    public static int getVolumn(int t) {
//        int round = 1;
//        while (round <= t) {
//            volumn = volumn + (((round - 1) / t1) % 2 == 1 ? 0 : m1) + (((round - 1) / t2) % 2 == 1 ? 0 : -m2);
//            if (volumn < 0) {
//                volumn = 0;
//            }
//            if (volumn > m) {
//                volumn = m;
//            }
//            round++;
//        }
//        return volumn;
//    }
//}
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for (int i = 0; i < N; i++){
//            int n = sc.nextInt();
//            HashSet hs = new HashSet();
//
//            for(int j = 0; j < n; j++){
//                int num = sc.nextInt();
//                int temp = num;
//                int counter = 0;
//                while (temp > 0){
//                    if (temp % 2 == 1){
//                        counter++;
//                    }
//                    temp = temp >> 1;
//                }
//                hs.add(counter);
//            }
//            System.out.println(hs.size());
//        }
//
//
//    }

