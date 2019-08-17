package InterviewTest;

import org.junit.Assert;
import org.junit.Test;
import java.util.Scanner;
/**
 * @Author SYZ
 * @create 2019-08-04 18:55
 */
public class WangYiCoding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            if (a > 1000000 || a < 0){
                System.out.println("Illegal Input");
                continue;
            }
            a = a - 5000;
            if (a <= 0){
                System.out.println(0);
                continue;
            }
            if (a <= 3000) {
                a = (int) Math.round(a * 0.03);
                System.out.println(a);
                continue;
            }
            if (a <= 12000){
                a = (int) Math.round(3000 * 0.03 + (a-3000) * 0.10);
                System.out.println(a);
                continue;
            }
            if (a <= 25000){
                a = (int) Math.round(3000 * 0.03 + 9000 * 0.10 + (a-12000) * 0.20);
                System.out.println(a);
                continue;
            }
            if (a <= 35000){
                a = (int) Math.round(3000 * 0.03 + 9000 * 0.10 + 13000 * 0.20 + (a-25000) * 0.25);
                System.out.println(a);
                continue;
            }
            if (a < 55000){
                a = (int) Math.round(3000 * 0.03 + 9000 * 0.10 + 13000 * 0.20 + 10000 * 0.25 + (a-35000)*0.30);
                System.out.println(a);
                continue;
            }
            if (a < 80000) {
                a = (int) Math.round(3000 * 0.03 + 9000 * 0.10 + 13000 * 0.20 + 10000 * 0.25 + 20000 * 0.30 + (a - 55000) * 0.35);
                System.out.println(a);
                continue;
            }
            a = (int) Math.round(3000 * 0.03 + 9000 * 0.10 + 13000 * 0.20 + 10000 * 0.25 + 20000*0.30 + 25000 *0.35 + (a-80000)*0.45);
            System.out.println(a);
            continue;
        }
    }

}
