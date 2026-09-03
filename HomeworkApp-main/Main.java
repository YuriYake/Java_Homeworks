import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.Stack;
import java.util.Queue;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(58);
        list.add(0);
        list.add(58);
        list.add(75);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("First: " + list.get(0));
        System.out.println("Third: " + list.get(2));
        System.out.println("Last: " + list.get(list.size() - 1));

        list.set(1, -50);

        System.out.println("Size: " + list.size());
        System.out.println(list);

        list.remove(2);
        System.out.println("Size after remove: " + list.size());

        System.out.println("Contains 15: " + list.contains(15));

        int maxArrayList = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > maxArrayList) {
                maxArrayList = list.get(i);
            }
        }
        System.out.println("Max: " + maxArrayList);

        int sumArrayList = 0;
        for (int i = 0; i < list.size(); i++) {
            sumArrayList += list.get(i);
        }
        System.out.println("Sum: " + sumArrayList);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }

        System.out.print("Duplicates: ");
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    System.out.print(list.get(i) + " ");
                    break;
                }
            }
        }
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sorted ArrayList: " + list);



        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(58);
        linkedList.add(0);
        linkedList.add(58);
        linkedList.add(75);

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println("First: " + linkedList.get(0));
        System.out.println("Third: " + linkedList.get(2));
        System.out.println("Last: " + linkedList.get(linkedList.size() - 1));

        linkedList.addFirst(5);
        linkedList.addLast(40);

        linkedList.removeFirst();
        linkedList.removeLast();

        linkedList.set(1, -50);

        System.out.println("Size: " + linkedList.size());

        linkedList.remove(2);
        System.out.println("Size after remove: " + linkedList.size());

        System.out.println("Contains 15: " + linkedList.contains(15));

        int maxLinkedList = linkedList.get(0);
        for (int i = 1; i < linkedList.size(); i++) {
            if (linkedList.get(i) > maxLinkedList) {
                maxLinkedList = linkedList.get(i);
            }
        }
        System.out.println("Max: " + maxLinkedList);

        int sumLinkedList = 0;
        for (int i = 0; i < linkedList.size(); i++) {
            sumLinkedList += linkedList.get(i);
        }
        System.out.println("Sum: " + sumLinkedList);

        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) % 2 == 0) {
                linkedList.remove(i);
                i--;
            }
        }

        System.out.print("Duplicates: ");
        for (int i = 0; i < linkedList.size(); i++) {
            for (int j = i + 1; j < linkedList.size(); j++) {
                if (linkedList.get(i).equals(linkedList.get(j))) {
                    System.out.print(linkedList.get(i) + " ");
                    break;
                }
            }
        }
        System.out.println();

        for (int i = 0; i < linkedList.size(); i++) {
            for (int j = 0; j < linkedList.size() - 1; j++) {
                if (linkedList.get(j) > linkedList.get(j + 1)) {
                    int temp = linkedList.get(j);
                    linkedList.set(j, linkedList.get(j + 1));
                    linkedList.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sorted LinkedList: " + linkedList);


        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(5);
        pq.add(58);
        pq.add(0);
        pq.add(58);
        pq.add(75);

        System.out.println("PriorityQueue: " + pq);
        System.out.println("Peek: " + pq.peek());

        pq.offer(5);
        pq.add(40);

        pq.poll();
        System.out.println("New peek: " + pq.peek());
        System.out.println("Size: " + pq.size());

        System.out.println("Contains 58: " + pq.contains(58));
        System.out.println("Contains 15: " + pq.contains(15));

        pq.remove(58);

        int minPQ = Integer.MAX_VALUE;
        for (int val : pq) {
            if (val < minPQ) {
                minPQ = val;
            }
        }
        System.out.println("Min: " + minPQ);

        int sumPQ = 0;
        for (int val : pq) {
            sumPQ += val;
        }
        System.out.println("Sum: " + sumPQ);

        PriorityQueue<Integer> pqTemp = new PriorityQueue<>();
        for (int val : pq) {
            if (val % 2 != 0) {
                pqTemp.add(val);
            }
        }
        pq = pqTemp;

        System.out.print("Poll in priority order: ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();



        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(5);
        stack.push(58);
        stack.push(0);
        stack.push(58);
        stack.push(75);

        System.out.println("Collection: " + stack);

        stack.push(40);
        System.out.println("Top element: " + stack.peek());

        stack.pop();
        System.out.println("Size: " + stack.size());
        System.out.println("Contains 58: " + stack.contains(58));

        int sumStack = 0;
        int maxStack = Integer.MIN_VALUE;
        for (int val : stack) {
            sumStack += val;
            if (val > maxStack) {
                maxStack = val;
            }
        }
        System.out.println("Sum: " + sumStack);
        System.out.println("Max: " + maxStack);

        ArrayDeque<Integer> stackNoEven = new ArrayDeque<>();
        for (int val : stack) {
            if (val % 2 != 0) {
                stackNoEven.add(val);
            }
        }
        stack = stackNoEven;

        System.out.print("LIFO order: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        ArrayDeque<Integer> revStack = new ArrayDeque<>();
        revStack.push(10);
        revStack.push(20);
        revStack.push(30);
        revStack.push(40);
        System.out.print("Reverse order: ");
        while (!revStack.isEmpty()) {
            System.out.print(revStack.pop() + " ");
        }
        System.out.println();

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.add(20);
        deque.addFirst(5);
        deque.addLast(100);

        System.out.println("First: " + deque.getFirst());
        System.out.println("Last: " + deque.getLast());

        deque.removeFirst();
        deque.removeLast();

        ArrayDeque<Integer> fifoQueue = new ArrayDeque<>();
        fifoQueue.add(10);
        fifoQueue.add(20);
        fifoQueue.add(30);
        fifoQueue.add(40);
        System.out.print("FIFO order: ");
        while (!fifoQueue.isEmpty()) {
            System.out.print(fifoQueue.poll() + " ");
        }
        System.out.println();

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("New peek: " + queue.peek());
        System.out.println("Size: " + queue.size());
        System.out.println("Contains 30: " + queue.contains(30));

        queue.offer(60);

        System.out.print("Poll all: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println();


        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");
        map.put(4, "Mango");

        System.out.println("HashMap: " + map);
        System.out.println("Key 2: " + map.get(2));

        map.put(5, "Grape");
        map.put(3, "Kiwi");

        System.out.println("Size: " + map.size());
        System.out.println("Contains key 4: " + map.containsKey(4));
        System.out.println("Contains value Banana: " + map.containsValue("Banana"));

        map.remove(1);

        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entries: " + map.entrySet());


        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Orange");
        treeMap.put(1, "Apple");
        treeMap.put(4, "Mango");
        treeMap.put(2, "Banana");

        System.out.println("TreeMap: " + treeMap);
        System.out.println("Key 2: " + treeMap.get(2));

        treeMap.put(5, "Grape");
        treeMap.put(3, "Kiwi");

        System.out.println("Size: " + treeMap.size());
        System.out.println("Contains key 4: " + treeMap.containsKey(4));

        treeMap.remove(1);

        System.out.println("Entries: " + treeMap.entrySet());
        System.out.println("Smallest key: " + treeMap.firstKey());
        System.out.println("Largest key: " + treeMap.lastKey());
        System.out.println("Smallest entry: " + treeMap.firstEntry());
        System.out.println("Largest entry: " + treeMap.lastEntry());



        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(5);
        set.add(58);
        set.add(0);
        set.add(58);
        set.add(75);

        System.out.println("HashSet: " + set);

        set.add(40);
        set.add(58);

        System.out.println("Size: " + set.size());
        System.out.println("Contains 75: " + set.contains(75));
        System.out.println("Contains 15: " + set.contains(15));

        set.remove(5);

        for (int val : set) {
            System.out.println(val);
        }

        int maxHashSet = Integer.MIN_VALUE;
        int minHashSet = Integer.MAX_VALUE;
        int sumHashSet = 0;
        int countGreaterThan20 = 0;

        for (int val : set) {
            if (val > maxHashSet) {
                maxHashSet = val;
            }
            if (val < minHashSet) {
                minHashSet = val;
            }
            sumHashSet += val;
            if (val > 20) {
                countGreaterThan20++;
            }
        }

        System.out.println("Max: " + maxHashSet);
        System.out.println("Min: " + minHashSet);
        System.out.println("Sum: " + sumHashSet);

        HashSet<Integer> setNoEven = new HashSet<>();
        for (int val : set) {
            if (val % 2 != 0) {
                setNoEven.add(val);
            }
        }
        set = setNoEven;

        System.out.println("Numbers > 20: " + countGreaterThan20);



        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(5);
        treeSet.add(15);

        System.out.println("TreeSet: " + treeSet);

        treeSet.add(10);
        System.out.println("TreeSet after adding 10 again: " + treeSet);

        System.out.println("Size: " + treeSet.size());
        System.out.println("Contains 20: " + treeSet.contains(20));

        treeSet.remove(15);

        System.out.println("Smallest: " + treeSet.first());
        System.out.println("Largest: " + treeSet.last());

        System.out.println("Lower than 18: " + treeSet.lower(18));
        System.out.println("Higher than 18: " + treeSet.higher(18));

        System.out.println("Floor 20: " + treeSet.floor(20));
        System.out.println("Ceiling 20: " + treeSet.ceiling(20));
        System.out.println("Lower 20: " + treeSet.lower(20));
        System.out.println("Higher 20: " + treeSet.higher(20));

        System.out.println("Poll first: " + treeSet.pollFirst());
        System.out.println("Poll last: " + treeSet.pollLast());

        int sumTreeSet = 0;
        for (int val : treeSet) {
            sumTreeSet += val;
        }
        System.out.println("Sum: " + sumTreeSet);
    }
}