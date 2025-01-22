
import org.junit.jupiter.api.Test;

import MyArrayList.MyArrayList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyArrayListTest {
    @Test
    public void TestThat_MyArrayList_Exists() {
        MyArrayList myList = new MyArrayList();

    }

    @Test
    public void TestThat_MyList_IsEmpty() {

        MyArrayList myList = new MyArrayList();

        boolean isEmpty = myList.listIsEmpty();

        assertTrue(isEmpty);

    }
    @Test
    public void TestThat_LengthIsOne_If_An_Element_Is_Added() {

        MyArrayList myList = new MyArrayList();
        myList.addElement("Mango");

        assertEquals(1, myList.getSize());
    }
    @Test
    public void TestThat_ListIsEmpty_If_An_ElementIsRemoved() {
        MyArrayList myList = new MyArrayList();
        myList.removeElement("Mango");
        assertEquals(0, myList.getSize());
    }
    @Test
    public void TestThat_ListIsFull_If_Three_Elements_Are_Added() {
        MyArrayList myList = new MyArrayList();
        myList.addElement("Mango");
        myList.addElement("Cashew");
        myList.addElement("Guava");
        assertEquals(3, myList.getSize());

    }
    @Test
    public void TestThat_Array_List_Takes_More_Value_If_Size_Exceeded(){
        MyArrayList myList = new MyArrayList();
        myList.addElement("Mango");
        myList.addElement("Cashew");
        myList.addElement("Guava");
        myList.addElement("Cherry");
        myList.addElement("Grape");
        assertEquals(5, myList.getSize());

    }
    @Test
    public void TestThatABCDE_If_F_Inserted_AtIndex3_F_Is_FoundAt_Index1(){
        MyArrayList myList = new MyArrayList();
        myList.insertElement("Orange", 1);
        assertEquals("Orange", myList.getElementAtIndex("Orange", 1));
    }



}

