package Stage1.operator;

import java.util.Scanner;

public class ConditionDemo2 {
    public static void main(String[] args) {
        //例子：判断一个整数还是奇书还是偶数，并且将结果打印输出
        //定义一个变量存放数据
//        int n = 10;
//        从键盘接受数据
        System.out.println("请从键盘输入一个整数：");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n%2==0){
            System.out.println(n+"是偶数");
        }else {
            System.out.println(n+"是奇数");
        }
    }
}
