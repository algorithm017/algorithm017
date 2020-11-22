/**
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
 */

public class HammingWeight {


    public int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            //&=n-1最后一位1变成0 100 011 -> 000
            n &= (n - 1);
        }
        return sum;
    }

}
