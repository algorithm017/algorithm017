/**
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 */
public class IsPowerOf2 {
    //一直取余2 若有余数 则不是
    //利用位运算

    /**
     *  x:00000100 -x:11111100 00001110,11110010
     *  所有位取反再加一 所以x与-x是只有最右一位1不同 &相同 保留 不同留1 与x本身=
     * @param n
     * @return
     */
    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        long x = (long) n;
        return (x & (-x)) == x;
    }

}
