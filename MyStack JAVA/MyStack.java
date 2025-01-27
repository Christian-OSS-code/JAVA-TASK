package MyArrayList.test;


import java.util.Arrays;

public class MyStack {
    private String[] stack;
    private int size = 0;

    public MyStack() {
        stack = new String[3];
    }
    public boolean stackListIsEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void addOneItem(String element) {
        stack[size] = element;
        size++;
    }

    public boolean stackListIsNotEmpty() {
        return size > 0;
    }


    public String pushStack(String element) {

        for (String item : stack) {
            if (item.equals(element)) {
                return element;

            }

        }
        throw new IllegalArgumentException("Item was never pushed to stack");

    }

    public String peekStack() {


        for (String item : stack) {
            stack[stack.length - 1] = item;
            break;
        }
        return stack[size];
    }

    public void addElement(String element) {


        for (int i = 0; i < stack.length; i++) {
            stack[i] = element;
        }

    }
    public String poppedStack(String element) {

        String item = "";
        for (int i = 0; i < size; i++) {
            if (stack[i].equals(element)){
                stack[i] = stack[size - 1];
                item = stack[i];
                stack[size - 1] = null;
                size--;
            }
        }
        return item;

    }


    public void removePeekedItem(String element) {
        for (int i = 0; i < size; i++) {
            if (stack[i].equals(element)) {
                stack[i] = stack[size - 1];
                stack[size - 1] = null;
                size--;
            }
        }
    }
        public String toString(){
            return Arrays.toString(Arrays.copyOf(stack, size));


    }
}

