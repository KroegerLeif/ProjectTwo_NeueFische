package org.example.codeWars;

public class NumberFun {
    public static long findNextSquare(long sq) {
        long sqrt = (long) Math.sqrt(sq);
        if (sqrt * sqrt == sq) {
            return ((sqrt +1)  * (sqrt +1));
        }
        return -1;
    }
}
