package collection.arraylist;

import java.util.Queue;
import java.util.ArrayList;

public class MyQueue {
    private ArrayList<String> arrayQueue = new ArrayList<>();

    public void enQueue(String data) {
        arrayQueue.add(data);
    }
    public String deQueue(){
        int len = arrayQueue.size();
        if (len == 0) {
            System.out.println("큐가 비어 있습니다.");
            return null;
        }
        return (arrayQueue.remove(0));
    }
}
