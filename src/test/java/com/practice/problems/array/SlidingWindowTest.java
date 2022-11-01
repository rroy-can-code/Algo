package com.practice.problems.array;

import com.practice.ds.array.SlidingWindow;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SlidingWindowTest {


    @Test
    public void testMaxSum(){
        int arr[] = new int[]{100,200,300,400};
        SlidingWindow slidingWindow = new SlidingWindow();
        Assert.assertEquals(900, slidingWindow.maxSumKConsecutiveElts(arr,3));
        Assert.assertEquals(-1, slidingWindow.maxSumKConsecutiveElts(arr,7));

    }

}
