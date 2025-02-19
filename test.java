import java.lang.reflect.Array;
import java.util.*;

public class test {
    public static int checkNumber(int num ) {
        if (num>0) {
            return 1;  
        } else if (num<0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i=0; i<10; i++) {
            nums.add(i);
        }
        System.out.println(nums);
        for (int i=0; i<nums.size() ; i++) {
            if (i==5){
                continue;
            } 
            System.out.println(i);
        }
    }

}

// public class test {
//     public static void main(String[] args) {
//         int maxNum = 10;
//         print("look at this line \n and then this line");
//         for (int i=0; i<maxNum; i++) {
//             if (i==5) {
//                 continue;
//             }
//             print(i);
//         }
//     }
//     public static void print(Object text) {
//         System.out.println(text);
//     }
// }