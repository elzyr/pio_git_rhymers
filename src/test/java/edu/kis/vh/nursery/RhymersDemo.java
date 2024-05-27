package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

    public static final int loopInitVariable = 1;
    public static final int loopFinalVariable = 15;
    public static final int secondLoopInitVariable = 0;
    public static final int rhymesLimit = 3;
    public static final int bound = 20;

    public static void main(String[] args) {
        Rhymersfactory factory = new DefaultRhymersFactory();

        testRhymers(factory);

    }

    private static void testRhymers(Rhymersfactory factory) {
        final DefaultCountingOutRhymer[] rhymers = { factory.GetStandardRhymer(), factory.GetFalseRhymer(),
                factory.GetFIFORhymer(), factory.GetHanoiRhymer()};

        for (int i = loopInitVariable; i < loopFinalVariable; i++)
            for (int j = secondLoopInitVariable; j < rhymesLimit; j++)
                rhymers[j].countIn(i);

        final java.util.Random rn = new java.util.Random();
        for (int i = loopInitVariable; i < loopFinalVariable; i++)
            rhymers[rhymesLimit].countIn(rn.nextInt(bound));

        for (int i = secondLoopInitVariable; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[rhymesLimit]).reportRejected());
    }

}