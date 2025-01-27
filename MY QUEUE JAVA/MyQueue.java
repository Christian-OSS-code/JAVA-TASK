package MyQueue;

import MyArrayList.src.MyArrayList;
import MyQueue.exceptions.QueueFullException;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyQueue extends MyArrayList {
    private String[] queueList;
    private int size = 0;

    public MyQueue() {
        super();
        queueList = new String[3];
    }

    @Override
    public int getSize() {

        return size;
    }

    @Override
    public void addElement(String element) {

        if (size == queueList.length) {
            throw new QueueFullException("Queue is full");
        }
        queueList[size] = element;
        size += 1;
    }

    public boolean isOfferElement(String element) {
        boolean checkElement = false;
        for (String fruit : queueList) {
            if (fruit.equals(element)) {
                checkElement = true;
                return checkElement;
            }
        }
        return checkElement;
    }


    public boolean listIsFull(String element) {
        boolean checkElement = true;
        if (size == queueList.length) {
            checkElement = false;
        }
        return checkElement;

    }

    public void removeQueueElement(String element) {

        // if (listIsEmpty()) throw new NoSuchElementException("Queue is empty");

        if (!listIsEmpty()) {

            for (int i = 0; i < size; i++) {

                if (queueList[i].equals(element)) {

                    queueList[i] = queueList[i + 1];

                    queueList[i + 1] = null;

                    size--;
                }


            }
        }

    }

    public String toString() {
        if (listIsEmpty()) return null;
        else return Arrays.toString(Arrays.copyOf(queueList, size));
    }

    public String removedElement(String element) {
        String item = "";
        for (int i = 0; i < size; i++) {

            if (queueList[i].equals(element)) {

                queueList[i + 1] = queueList[i];
                item = queueList[i];
                queueList[size - 1] = null;

                size--;
            }
        }
        return item;
    }

    public String PeekElement() {
        String headElement = "";
        for (int i = 0; i < size; i++) {
            headElement = queueList[0];
        }
        return headElement;
    }

    public String elementRetrieval() {

        if (size == 0) return null;
        else {

            String headElement = "";
            for (int i = 0; i < size; i++) {
                headElement = queueList[0];
            }
            return headElement;
        }
    }
}


