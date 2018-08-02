package test;

import java.util.Arrays;

public class second {
    //以最快速度找出数组中第二大的数
    public static void main(String[] args){
        int[] num = {1, 5, 9, 10, 17, 19, 21};
        System.out.println();
        Arrays.sort(num);
        System.out.println(num[num.length-2]);
    }
}

