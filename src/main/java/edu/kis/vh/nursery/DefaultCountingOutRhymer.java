package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INITIAL_VALUE = -1;
    public static final int TABLE_LEN = 12;
    private final int[] numbers = new int[TABLE_LEN];

    public int total = INITIAL_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INITIAL_VALUE;
    }

    public boolean isFull() {
        return total == TABLE_LEN - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return INITIAL_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return INITIAL_VALUE;
        return numbers[total--];
    }

}
