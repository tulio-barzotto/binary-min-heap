package br.com.tuliobarzotto.heap;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryMinHeapTest {
    private BinaryMinHeap binaryMinHeap;

    @Before
    public void setUp() throws Exception {
        binaryMinHeap = new BinaryMinHeap(10);
    }

    @Test
    public void testMinValue(){
        binaryMinHeap.insert(7);
        binaryMinHeap.insert(3);
        binaryMinHeap.insert(6);
        binaryMinHeap.insert(84);
        binaryMinHeap.insert(12);
        binaryMinHeap.insert(20);
        binaryMinHeap.insert(15);
        binaryMinHeap.insert(1);
        binaryMinHeap.insert(91);
        binaryMinHeap.insert(-8);
        Assert.assertEquals(binaryMinHeap.getMinimum(), -8);
    }
}
