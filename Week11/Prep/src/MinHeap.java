    import java.util.Arrays;

    public class MinHeap {
        private int[] heap;
        private int size;
        private int capacity;

        public MinHeap(int capacity) {
            this.capacity = capacity;
            heap = new int[capacity];
            size = 0;
        }

        public void insert(int key) {
            if (size == capacity) {
                throw new IllegalStateException("Heap is full");
            }
            heap[size] = key;  // Insert the new key at the end
            size++;
            bubbleUp(size - 1);  // Restore heap property
        }

        private void bubbleUp(int index) {
            while (index > 0) {
                int parentIndex = (index - 1) / 2;
                if (heap[index] < heap[parentIndex]) {
                    // Swap
                    int temp = heap[index];
                    heap[index] = heap[parentIndex];
                    heap[parentIndex] = temp;
                    index = parentIndex;  // Move up to parent's index
                } else {
                    break;
                }
            }
        }

        public int removeMin() {
            if (size == 0) {
                throw new IllegalStateException("Heap is empty");
            }
            int min = heap[0];  // The minimum value
            heap[0] = heap[size - 1];  // Move the last element to the root
            size--;
            bubbleDown(0);  // Restore heap property
            return min;
        }

        private void bubbleDown(int index) {
            while (true) {
                int leftChildIndex = 2 * index + 1;
                int rightChildIndex = 2 * index + 2;
                int smallestIndex = index;

                if (leftChildIndex < size && heap[leftChildIndex] < heap[smallestIndex]) {
                    smallestIndex = leftChildIndex;
                }
                if (rightChildIndex < size && heap[rightChildIndex] < heap[smallestIndex]) {
                    smallestIndex = rightChildIndex;
                }
                if (smallestIndex != index) {
                    // Swap
                    int temp = heap[index];
                    heap[index] = heap[smallestIndex];
                    heap[smallestIndex] = temp;
                    index = smallestIndex;  // Move down to the smallest child's index
                } else {
                    break;
                }
            }
        }

        @Override
        public String toString() {
            return Arrays.toString(Arrays.copyOf(heap, size));
        }

        public static void main(String[] args) {
            MinHeap minHeap = new MinHeap(10);
            minHeap.insert(10);
            minHeap.insert(5);
            minHeap.insert(3);
            minHeap.insert(2);
            System.out.println(minHeap); // Output the heap
            System.out.println("Removed min: " + minHeap.removeMin()); // Remove the minimum
            System.out.println(minHeap); // Output the heap after removal
        }
    }

