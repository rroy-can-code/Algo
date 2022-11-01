package com.practice.problems.string;

import com.practice.ds.array.MaxLengthSubstring;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MaxLengthSubstringTest {
    MaxLengthSubstring maxLengthSubstring;
    @Before
    public void setUp(){
        maxLengthSubstring = new MaxLengthSubstring();
    }
    @Test
    public void testSentence(){

        Assert.assertEquals(7,maxLengthSubstring.longestLengthSubstring("Abcad pqr"));
    }

    @Test
    public void testWord(){
        Assert.assertEquals(4,maxLengthSubstring.longestLengthSubstring("Abcad "));
    }

    @Test
    public void testStringWord(){
        Assert.assertEquals("abc",maxLengthSubstring.longestSubstringWithoutRepeatingChars("Abcaad"));
    }
}
