package MyArrayList;

public class MyArrayList {
    private String[] listElement = new String[3];

    private int size = 0;


    public boolean listIsEmpty() {
        return size == 0;

    }

    public void addElement(String element) {
        listElement[size] = element;
        size ++;

        if (listElement.length - 1 == size) {
            String[] newListElement = new String[listElement.length * 2];
            for (int i = 0; i < size; i++) {
                newListElement[i] = listElement[i];
            }
            listElement = newListElement;

        }


    }

    public void removeElement(String element) {
        listElement[size] = element;
        size ++;

        for (int i = 0; i < size; i++) {
            if (listElement[i].equals(element)) {
                listElement[i] = listElement[size - 1];
                listElement[size - 1] = null;
                size--;
                return;
            }

        }

    }
    public int getSize() {
        return size;
    }

    public void insertElement(String element, int index) {
        for (int i = 0; i < index; i++) {
            listElement[index] = element;

        }

    }

    public String getElementAtIndex(String element, int index) {
        return listElement[index];
    }

    public int getIndex(int index) {
        return index;
    }

}





