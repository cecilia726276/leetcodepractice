package SortAlgorithm;

import java.util.ArrayList;

public class HeapSort {


    private ArrayList<Integer> A;

    private int heapSize;

    public ArrayList<Integer> getA() {
        return A;
    }

    public void setA(ArrayList<Integer> a) {
        A = a;
    }

    public int getHeapSize() {
        return heapSize;
    }

    public void setHeapSize(int heapSize) {
        this.heapSize = heapSize;
    }

    public int left(int i) {
        return i * 2 + 1;
    }

    // 右节点下标
    public int right(int i) {
        return i * 2 + 2;
    }

    // 父节点下标
    public int parent(int i) {
        return (i - 1) / 2;
    }

    // Method 1
    public void MaxHeapify(HeapSort heap, int i) {
        int l = left(i);
        int r = right(i);
        int largest = i;
        if (l < heap.getHeapSize() && heap.getA().get(l) > heap.getA().get(i)) {
            largest = l;
        }
        if (r < heap.getHeapSize() && heap.getA().get(r) > heap.getA().get(largest)) {
            largest = r;
        }
        if (largest != i) {
            int temp = heap.getA().get(i);
            heap.getA().set(i, heap.getA().get(largest));
            heap.getA().set(largest, temp);
        } else {
            return;
        }
        MaxHeapify(heap, largest);
    }

    // Method 2
    public void MaxHeapifyNoRecursive(HeapSort heap, int i) {
        while (true) {
            int l = left(i);
            int r = right(i);
            int heapSize = heap.getHeapSize();
            ArrayList<Integer> A = heap.getA();
            int largest = i;
            if (l < heapSize && A.get(l) > A.get(i)) {
                largest = l;
            }
            if (r < heapSize && A.get(r) > A.get(largest)) {
                largest = r;
            }
            if (largest != i) {
                int temp = A.get(i);
                A.set(i, A.get(largest));
                A.set(largest, temp);
            } else{
                return;
            }
            i = largest;
        }
    }

    public void BuildMaxHeap(HeapSort heap) {
        int heapsize = heap.getHeapSize();
        for (int i = (heapsize - 1) / 2; i>= 0; i--) {
            MaxHeapify(heap, i);
        }
    }

    public void heapSort(HeapSort heap) {
        BuildMaxHeap(heap);
        int length = heap.getA().size(), heapSize = heap.getHeapSize();
        for (int i = length - 1; i > 0; i--) {
            int temp = heap.getA().get(i);
            heap.getA().set(i, heap.getA().get(0));
            heap.getA().set(0,temp);
            heap.setHeapSize(--heapSize);
            MaxHeapify(heap, 0);
        }
    }
}
