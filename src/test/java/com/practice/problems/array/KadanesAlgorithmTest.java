package com.practice.problems.array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class KadanesAlgorithmTest {
    @Test
    public void testKadanesAlgo() {
        KadanesAlgorithm kadanesAlgorithm = new KadanesAlgorithm();
        Assert.assertEquals(7, kadanesAlgorithm.maxSubArraySum(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}));
    }
}
