package string_problem;

/**
 * @Author SYZ
 * @create 2019-08-05 11:57
 */
public class isPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
//        String newStr = s.toLowerCase();
//        System.out.println(newStr);
//        int j = newStr.length()-1;
//        for (int i = 0; i < newStr.length()/2; i++){
//            int ascii = (int) newStr.charAt(i);
//            if ((ascii >= 48 && ascii <= 57) || (ascii >= 97 && ascii <= 122)){
//                int ascij = (int) newStr.charAt(j);
//                while (!((ascij >= 48 && ascij <= 57) || (ascij >= 97 && ascij <= 122))){
//                    j--;
//                    ascij = (int) newStr.charAt(j);
//                }
//                if (newStr.charAt(i) == newStr.charAt(j)){
//                    j--;
//                } else {
//                    System.out.println("i:" + i + newStr.charAt(i));
//                    System.out.println("j:" + j + newStr.charAt(j));
//                    return false;
//                }
//            } else {
//                continue;
//            }
//        }
//        return true;
        int j = s.length()-1;
        for (int i = 0; i < s.length(); i++){
            int ascii = (int) s.charAt(i);
            if ((ascii >= 48 && ascii <= 57) ||(ascii >= 65 && ascii <= 90)|| (ascii >= 97 && ascii <= 122)){
                int ascij = (int) s.charAt(j);
                while (!((ascij >= 48 && ascij <= 57) ||(ascij >= 65 && ascij <= 90) ||(ascij >= 97 && ascij <= 122))){
                    j--;
                    ascij = (int) s.charAt(j);
                }
                if (s.charAt(i) == s.charAt(j) || ((ascii >=65) && (ascij>=65) && Math.abs(ascii - ascij) == 32)){
                    j--;
                } else {
                    System.out.println("i:" + i + s.charAt(i));
                    System.out.println("j:" + j + s.charAt(j));
                    return false;
                }
            } else {
                continue;
            }
        }
        return true;
    }
}
