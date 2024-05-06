package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int initialValue = -1;
    public static final int tableLen = 12;
    public static final int variableFull = 11;
    private final int[] NUMBERS = new int[tableLen];

    public int total = initialValue;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == initialValue;
    }

    public boolean isFull() {
        return total == variableFull;
    }

    protected int peekaboo() {
        if (callCheck())
            return initialValue;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return initialValue;
        return NUMBERS[total--];
    }

}
