package algorithm.sort.heap;


/**
 * @author LiuHanxu
 * @Classname HeapSort
 * @Description TODO 堆排序
 * @Date 2022/5/29 14:57
 */
public class HeapSort {
    private static boolean less(Comparable[] heap, int i, int j) {
        return heap[i].compareTo(heap[j]) < 0;
    }

    private static void exchange(Comparable[] heap, int i, int j) {
        Comparable<?> temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    //根据原数组source构造堆heap
    private static void createHeap(Comparable[] source, Comparable[] heap) {
        System.arraycopy(source, 0, heap, 1, source.length);
        for (int i = heap.length / 2; i > 0; i--) {
            sink(heap, i, heap.length - 1);
        }
    }

    //对source从小到大排序
    public static void sort(Comparable[] source) {
        Comparable[] heap = new Comparable[source.length + 1];
        createHeap(source, heap);
        int N = heap.length - 1;
        while (N != 1) {
            exchange(heap, 1, N);
            N--;
            sink(heap, 1, N);
        }
        System.arraycopy(heap, 1, source, 0, source.length);
    }

    //在heap堆中堆target处的元素作下沉，范围使0~range
    private static void sink(Comparable[] heap, int target, int range) {
        while (2 * target <= range) {
            int max;
            if (2 * target + 1 <= range) {
                if (less(heap, 2 * target, 2 * target + 1)) {
                    max = 2 * target + 1;
                } else {
                    max = 2 * target;
                }
            } else {
                max = 2 * target;
            }
            if (less(heap, target, max)) {
                exchange(heap, target, max);
                target = max;
            } else {
                break;
            }
        }
    }
}
