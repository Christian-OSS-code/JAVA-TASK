package MyArrayList.test;


import MyQueue.MyQueue;
import MyQueue.exceptions.QueueFullException;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyQueueTest {
    @Test
    public void TestThatMyQueueExists() {
        MyQueue myQueue = new MyQueue();

    }

    @Test
    public void TestThatMyQueueIsEmpty() {
        MyQueue myQueue = new MyQueue();
        assertEquals(0, myQueue.getSize());
    }

    @Test
    public void TestThatSizeOfQueueIsOneIfXIsAdded() {
        MyQueue myQueue = new MyQueue();
        myQueue.addElement("apple");
        assertEquals(1, myQueue.getSize());
    }


    @Test
    public void TestThat_QueueIsEmpty_IfElementIsRemoved() {
        MyQueue myQueue = new MyQueue();
        myQueue.removeElement("apple");
        assertEquals(0, myQueue.getSize());
    }

    @Test
    public void TestThat_XYZ_Can_Be_Added_To_Queue_List() {
        MyQueue myQueue = new MyQueue();
        myQueue.addElement("apple");
        myQueue.addElement("orange");
        myQueue.addElement("apple");

        assertEquals(3, myQueue.getSize());
    }

    @Test
    public void TestThat_X_Can_Be_Inserted_To_Queue_List() {
        MyQueue myQueue = new MyQueue();
        myQueue.addElement("apple");
        myQueue.addElement("orange");
        myQueue.addElement("Pear");

        boolean isOffer = myQueue.isOfferElement("Pear");
        assertTrue(isOffer);
    }
    @Test
    public void TestThat_QueueThrowsException_WhenItsFull() {
        MyQueue myQueue = new MyQueue();
        myQueue.addElement("apple");
        myQueue.addElement("Groundnut");
        myQueue.addElement("Banana");
        assertThrows(QueueFullException.class, ()-> myQueue.addElement("Pineapple"));

    }
    @Test
    public void InsertsXIntoFullListReturnsFalse(){
        MyQueue myQueue = new MyQueue();
        myQueue.addElement("apple");
        myQueue.addElement("Groundnut");
        myQueue.addElement("Banana");

        boolean isFalse = myQueue.listIsFull("Rice");
        assertFalse(isFalse);
        assertThrows(QueueFullException.class, ()-> myQueue.addElement("Rice"));
    }
    @Test
    public void TestThat_MyQueue_RemovesElementFromItsHead() {
        MyQueue myQueue = new MyQueue();
        myQueue.addElement("apple");
        myQueue.addElement("orange");
        myQueue.addElement("banana");

        myQueue.removeQueueElement("apple");

        String queueList = myQueue.toString();

        assertEquals(queueList, myQueue.toString());

    }
    @Test
    public void TestThat_MyQueue_RemovesX_From_XYZ_AndDisplayX() {
        MyQueue myQueue = new MyQueue();
        myQueue.addElement("apple");
        myQueue.addElement("orange");
        myQueue.addElement("banana");

        myQueue.removeQueueElement("apple");
        assertEquals("apple", myQueue.removedElement("apple"));
    }
    @Test
    public void TestThat_MyQueue_Polls_Element_AndReturns_Head_Or_Null() {
        MyQueue myQueue = new MyQueue();
        myQueue.addElement("apple");
        myQueue.addElement("orange");
        myQueue.addElement("banana");

        myQueue.removeQueueElement("apple");
        String itemList = myQueue.toString();

        assertEquals(itemList, myQueue.toString());
    }
    @Test
    public void TestThat_MyQueue_Peeks_RetrievesElement_AndReturns_Head_Or_Null() {
        MyQueue myQueue = new MyQueue();
        myQueue.addElement("apple");
        myQueue.addElement("orange");
        myQueue.addElement("banana");


        assertEquals("apple", myQueue.PeekElement());

    }
    @Test
    public void TestThat_Element_Is_Retrieved_From_Queue_List() {
        MyQueue myQueue = new MyQueue();
        myQueue.addElement("apple");
        myQueue.addElement("orange");
        myQueue.addElement("banana");


        assertEquals("apple", myQueue.elementRetrieval());


    }
}

