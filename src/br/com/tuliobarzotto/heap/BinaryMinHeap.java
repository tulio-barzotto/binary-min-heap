package br.com.tuliobarzotto.heap;

public class BinaryMinHeap {
    private int[] data;

    private int heapSize;



    public BinaryMinHeap(int size) {

        data = new int[size];

        heapSize = 0;

    }



    public int getMinimum() {

        if (isEmpty())

            throw new HeapException("Heap is empty");

        else

            return data[0];

    }



    public boolean isEmpty() {

        return (heapSize == 0);

    }

    private int getLeftChildIndex(int nodeIndex) {

        return 2 * nodeIndex + 1;

    }



    private int getRightChildIndex(int nodeIndex) {

        return 2 * nodeIndex + 2;

    }



    private int getParentIndex(int nodeIndex) {

        return (nodeIndex - 1) / 2;

    }



    public class HeapException extends RuntimeException {

        public HeapException(String message) {

            super(message);

        }

    }
}
