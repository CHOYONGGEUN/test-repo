package collection.arraylist;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<String> arrayList = new ArrayList<>();

    public void push(String data) {
        arrayList.add(data);
    }

    public String pop() {
        int len = arrayList.size();
        if (len == 0) {
            System.out.println("스택이 비어있습니다.");
            return null;
        }
        return arrayList.remove(len - 1);
    }
}
