package LLinkWorkSLN;

public class LLWork {
    // LinkedList_TakeHome_Solution.java
// Full working solution for the take-home quiz

    class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    public class LinkedList {
        Node head;

        // Helper method to add node at end (students already know this)
        void insertAtEnd(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                return;
            }
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }

        // Display contents for testing
        void show() {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println();
        }

        /**
         * Returns the number of nodes that contain values that appear more than once.
         * Example: 4 -> 8 -> 4 -> 2 -> 8 -> null
         * Duplicate values: 4 and 8
         * Nodes counted: 4 (two 4s and two 8s) → returns 4
         */
        public int countDuplicateNodes() {
            int count = 0;
            Node curr = head;

            while (curr != null) {
                Node runner = curr.next;
                boolean duplicateFound = false;

                while (runner != null) {
                    if (runner.data == curr.data) {
                        duplicateFound = true;
                        break;
                    }
                    runner = runner.next;
                }

                if (duplicateFound) count++;
                curr = curr.next;
            }
            return count;
        }

        /**
         * Returns the value of the node *after* the first node containing 'value'.
         * If the value is not found or is the last node, returns -1.
         * Example: list = 4 -> 8 -> 2 -> 9
         * findNodeAfter(8) → 2
         * findNodeAfter(9) → -1
         * findNodeAfter(5) → -1
         */
        public int findNodeAfter(int value) {
            Node curr = head;
            while (curr != null) {
                if (curr.data == value) {
                    if (curr.next != null)
                        return curr.next.data;  // return value of next node
                    else
                        return -1;              // no node after
                }
                curr = curr.next;
            }
            return -1; // not found
        }

        // Main for testing
        public void main(String[] args) {
            LinkedList list = new LinkedList();

            list.insertAtEnd(4);
            list.insertAtEnd(8);
            list.insertAtEnd(4);
            list.insertAtEnd(2);
            list.insertAtEnd(8);
            list.insertAtEnd(9);

            list.show(); // 4 8 4 2 8 9

            System.out.println("Duplicate node count: " + list.countDuplicateNodes());
            // Expect 4 (two 4s + two 8s)

            System.out.println("Value after 8: " + list.findNodeAfter(8)); // Expect 4
            System.out.println("Value after 9: " + list.findNodeAfter(9)); // Expect -1
            System.out.println("Value after 5: " + list.findNodeAfter(5)); // Expect -1
        }
    }

}
