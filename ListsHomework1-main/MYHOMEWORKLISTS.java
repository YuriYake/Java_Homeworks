import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class MyArrayList<T> {
    private Object[] data;
    private int size = 0;

    public MyArrayList() {
        data = new Object[10];
    }

    public void add(T element) {
        if (size == data.length) {
            Object[] newData = new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        data[size++] = element;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) data[index];
    }

    public int size() {
        return size;
    }
}

class MyLinkedList<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;
    private int size = 0;

    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int size() {
        return size;
    }
}

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> customList = new MyArrayList<>();
        customList.add("Godot");
        customList.add("Reaper");
        System.out.println(customList.get(0));

        MyLinkedList<Integer> customLinkedList = new MyLinkedList<>();
        customLinkedList.add(10);
        customLinkedList.add(20);
        System.out.println(customLinkedList.get(1));

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(5);
        stack.push(3);
        stack.push(1);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        System.out.println(hashMap.get("One"));

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("B", 200);
        treeMap.put("A", 100);
        System.out.println(treeMap.get("A"));
    }
}
