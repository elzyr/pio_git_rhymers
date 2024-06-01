package edu.kis.vh.nursery;

/**
 * The DefaultCountingOutRhymer class provides a basic stack structure for managing integers.
 */
public class DefaultCountingOutRhymer {

    /**
     * Indicates an empty stack.
     */
    public static final int INITIAL_VALUE = -1;

    /**
     * Size of the stack.
     */
    public static final int TABLE_LEN = 12;

    /**
     * Array to store elements.
     */
    private final int[] numbers = new int[TABLE_LEN];

    /**
     * Index of the top element, initialized to INITIAL_VALUE.
     */
    private int total = INITIAL_VALUE;

    /**
     * Adds an integer to the stack if it's not full.
     *
     * @param in the integer to add.
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if empty, false otherwise.
     */
    public boolean callCheck() {
        return total == INITIAL_VALUE;
    }

    /**
     * Checks if the stack is full.
     *
     * @return true if full, false otherwise.
     */
    public boolean isFull() {
        return total == TABLE_LEN - 1;
    }

    /**
     * Returns the top element without removing it, or INITIAL_VALUE if the stack is empty.
     *
     * @return the top element or INITIAL_VALUE.
     */
    protected int peekaboo() {
        if (callCheck())
            return INITIAL_VALUE;
        return numbers[total];
    }

    /**
     * Removes and returns the top element, or INITIAL_VALUE if the stack is empty.
     *
     * @return the top element or INITIAL_VALUE.
     */
    public int countOut() {
        if (callCheck())
            return INITIAL_VALUE;
        return numbers[total--];
    }
}
