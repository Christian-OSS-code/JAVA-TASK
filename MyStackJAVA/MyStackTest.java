package MyArrayList.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyStackTest {
    @Test
    public void TestThat_MyStackExists() {
        MyStack myStack = new MyStack();
    }
    @Test
    public void TestThat_MyStackIsEmpty() {
        MyStack myStack = new MyStack();

        boolean isEmpty = myStack.stackListIsEmpty();
        assertTrue(isEmpty);
    }
    @Test
    public void TestThat_MyStackIsNotEmpty() {
        MyStack myStack = new MyStack();
        myStack.addOneItem("marble");
        boolean isNotEmpty = myStack.stackListIsNotEmpty();
        assertTrue(isNotEmpty);
    }
    @Test
    public void TestThat_Item_Can_Be_Pushed_To_MyStack() {
        MyStack myStack = new MyStack();
        myStack.addOneItem("Marble");
        //myStack.addOneItem("Banana");
        //myStack.addOneItem("Cherry");

        assertEquals("Marble", myStack.pushStack("Marble"));
    }
    @Test
    public void TestThat_Item_Can_Be_Peeked_From_MyStack() {
        MyStack myStack = new MyStack();
        myStack.addElement("Marble");
        myStack.addElement("Gold");
        myStack.addElement("Emerald");

        assertEquals("Emerald", myStack.peekStack());


    }
    @Test
    public void TestThat_Item_Can_Be_Popped_From_MyStack() {
        MyStack myStack = new MyStack();
        myStack.addOneItem("Marble");
        myStack.addOneItem("Gold");
        myStack.addOneItem("Emerald");


        assertEquals("Emerald", myStack.poppedStack("Emerald"));
    }
    @Test
    public void TestThat_MyStackXYZ_PopsZ_ReturnsYX() {
        MyStack myStack = new MyStack();
        myStack.addOneItem("Marble");
        myStack.addOneItem("Gold");
        myStack.addOneItem("Emerald");

        myStack.removePeekedItem("Emerald");

        String listItems = myStack.toString();

        assertEquals(listItems, myStack.toString());

    }


}

