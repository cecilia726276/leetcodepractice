/**
 * @Author SYZ
 * @create 2019-08-04 19:40
 */
import java.util.*;

public class Dian {
    public static ArrayList<Integer> getContinuous(String a){
        ArrayList<Integer> record = new ArrayList<>();
        for(int i = 0; i< a.length();){
            int count = 1;
            for (int j = i+1; j < a.length(); j++){
                if (a.charAt(j) - a.charAt(i) == count){
                    System.out.println("连续的！"+ i + "&" + j);
                    count++;
                    if (j == a.length() -1){
                        record.add(i);
                        record.add(j);
                        i = j;
                    }
                    System.out.println("count:" + count);

                } else {
                    if (count >= 4){
                        record.add(i);
                        record.add(j-1);
                        System.out.println("i:" + i);
                        System.out.println("j:" + j);
                    }
                    i = j-1;
                    break;
                }
            }
            i++;
        }
        return record;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String str= in.nextLine();
            ArrayList<Integer> arrayList  = getContinuous(str);
            System.out.println(Arrays.toString(arrayList.toArray()));
            String newStr = "";
            for (int i = 0; i < arrayList.size(); i++){
                Integer pos = arrayList.get(i);
                if (i%2==0){
                    if (i == 0){
                        String tmp = str.substring(0,pos);
                        newStr = newStr + tmp;
                        System.out.println("1:"+newStr);
                    } else {
                        String tmp = str.substring(arrayList.get(i-1),pos);
                        if (tmp.length()== 1){
                            continue;
                        }
                        newStr = newStr + tmp;
                        System.out.println("2:"+ newStr);
                    }
                } else {
                    System.out.println("i-1:" + arrayList.get(i-1));
                    System.out.println("pos:" + pos);
                    String tmp = str.charAt(arrayList.get(i-1)) + "-"+ str.charAt(pos);
                    newStr = newStr + tmp;
                    System.out.println("3:"+ newStr);
                }
                if (i == arrayList.size()-1){
                    String tmp = str.substring(pos+1);
                    newStr = newStr + tmp;
                    System.out.println("4:"+ newStr);
                }
            }

            System.out.println(newStr);
        }
    }

}
