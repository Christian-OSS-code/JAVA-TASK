package MySet;


import java.util.Arrays;

public class MySet {
    private int[] setList;

    private int size = 0;
    public MySet() {
        this.size = 0;
        this.setList = new int[6];
    }

    public boolean setListIsEmpty() {

        return size == 0;
    }


    public void addElement(int element) {
        if (setContains(element)) {
            System.out.println("Element exists already");
            return;

        }
        setList[size] = element;
        size++;
        if (size == setList.length) {
            int[] newList = new int[setList.length * 2];
            System.arraycopy(setList, 0, newList, 0, size);
            setList = newList;

        }


    }

    public int getSetSize() {
        return size;
    }
    public int[] getSetList() {
        return setList;
    }

    public void removeElement(int element) {
        for (int i = 0; i < size; i++) {
            if (setList[i] == element) {
                setList[i] = setList[size - 1];
                setList[size - 1] = 0;
                size--;
                return;
            }
        }
    }

    public boolean setContains(int element) {
        boolean contains = false;
        for (int i = 0; i < size; i++) {
            if (setList[i] == element) {
                contains = true;

            }
        }
        return contains;
    }

    public boolean subsetCheck(int[] elementsList) {
        int count = 0;
        for (int element : elementsList) {
            if (setContains(element)) {
                count++;

            }
        }
        return count == elementsList.length;

    }
    public boolean unionChecker(int[] newLists) {

        boolean union = false;
        for (int element : newLists) {
            if (!setContains(element)) {
                setList[size - 1] = element;

            }

        }
        if (setList.length > size) return true;
        else return union;

    }
    public boolean isAllRemoved(int[] newSetLists, int[] anotherList){

        int initialLength = setList.length;
        for (int element : newSetLists) {
            if (setContains(element)) {
                removeElement(element);
                size --;
            }
        }
        if (size < initialLength) return true;
        else return false;


    }
    public int addSetList(int[] newSetLists) {

        if(size == setList.length) {
            int[] newList = new int[setList.length * 2];
            System.arraycopy(setList, 0, newList, 0, size);
            setList = newList;

        }

       for (int element : newSetLists) {
           if (!setContains(element)) {
           setList[size] = element;
           size++;
           }
       }

       return size;

   }


    public boolean isIntersect(int[] newSetLists, int[] anotherList) {
        for (int element : anotherList) {
            if (!setContains(element)) {
                removeElement(element);
                size --;
            }

        }
        return size < setList.length;

    }

    public void clearAll(int[] newSetLists) {
        for (int element : newSetLists) {
            removeElement(element);
            size --;
        }
        size = 0;
    }

    public int[] arrayDisplay() {
        return Arrays.copyOfRange(setList, 0, size);
    }


}

