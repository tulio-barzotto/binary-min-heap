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

    public void insert(int value) {
        if (heapSize == data.length) {
            throw new HeapException("Heap está cheia!");
        } else {
            heapSize++;
            data[heapSize - 1] = value;
            siftUp(heapSize - 1);
        }
    }

    private void siftUp(int nodeIndex) {

        int parentIndex;
        int tmp;

        if (nodeIndex != 0) {
            parentIndex = getParentIndex(nodeIndex);
            if (data[parentIndex] > data[nodeIndex]) {
                tmp = data[parentIndex];
                data[parentIndex] = data[nodeIndex];
                data[nodeIndex] = tmp;
                siftUp(parentIndex);
            }
        }
    }



    public class HeapException extends RuntimeException {

        public HeapException(String message) {

            super(message);

        }

    }
}
