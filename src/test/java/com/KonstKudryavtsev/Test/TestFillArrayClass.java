package com.KonstKudryavtsev.Test;

import com.KonstKudryavtsev.FillArrayClass;

import org.junit.Assert;


public class TestFillArrayClass {

    @org.junit.Test
    public void testSimple() {
        long []testArr = new long[15];
        for (int i = 0; i < 15; i++) {
            testArr[i] = i+999;
        }
        try {
            testArr = FillArrayClass.fillArray(testArr);
        }catch (Exception e) {
            System.out.println("Exception caught");
            throw new AssertionError();
        }


        for (int i = 0; i < 15; i++) {
            Assert.assertEquals(i, testArr[i]);
        }
    }

    @org.junit.Test
    public void testSimple2() {
        long []testArr = new long[15];
        long j = 27;
        for (int i = 0; i < 15; i++) {
            testArr[i] = j--;
        }
        try {
            testArr = FillArrayClass.fillArray(testArr);
        }catch (Exception e) {
            System.out.println("Exception caught");
            throw new AssertionError();
        }

        for (int i = 0; i < 15; i++) {
            Assert.assertEquals(i, testArr[i]);
        }
    }

    @org.junit.Test
    public void testShuffled() {
        long []testArr = new long[15];
        int i = 0;

        testArr[i++] = 56;
        testArr[i++] = 20;
        testArr[i++] = 53;
        testArr[i++] = 60;
        testArr[i++] = 61;
        testArr[i++] = 59;
        testArr[i++] = 58;
        testArr[i++] = 62;
        testArr[i++] = 51;
        testArr[i++] = 52;
        testArr[i++] = 54;
        testArr[i++] = 55;
        testArr[i++] = 57;
        testArr[i++] = 64;
        testArr[i] = 63;

        try {
            testArr = FillArrayClass.fillArray(testArr);
        }catch (Exception e) {
            System.out.println("Exception caught");
            throw new AssertionError();
        }

        for (int j = 0; j < 15; j++) {
            Assert.assertEquals(j, testArr[j]);
        }
    }

}
