package MyArrayList.test;

import MySet.MySet;
import org.junit.Test;

import static org.junit.Assert.*;

public class MySetTest {
    @Test
    public void TestThat_MySetExists() {
        MySet mySet = new MySet();

    }

    @Test
    public void TestThat_MySetIsEmpty() {
        MySet mySet = new MySet();
        boolean isEmpty = mySet.setListIsEmpty();
        assertTrue(isEmpty);
    }

    @Test
    public void TestThat_MySetSizeIsOne_IfOneElementIsAdded() {
        MySet mySet = new MySet();
        mySet.addElement(5);
        assertEquals(1, mySet.getSetSize());
    }

    @Test
    public void TestThat_MySet_Is_Empty_WhenX_IsAddedAnd_Then_Removed() {
        MySet mySet = new MySet();
        mySet.addElement(6);
        mySet.removeElement(6);
        assertEquals(0, mySet.getSetSize());
    }

    @Test
    public void TestThat_List_ContainsElement() {
        MySet mySet = new MySet();
        mySet.addElement(5);
        mySet.addElement(6);
        mySet.addElement(7);
        mySet.addElement(8);

        boolean isContained = mySet.setContains(6);
        assertTrue(isContained);

    }

    @Test
    public void TestThat_List_Accpets_No_Dupilcate_Element() {
        MySet mySet = new MySet();
        mySet.addElement(5);
        mySet.addElement(6);
        mySet.addElement(7);
        mySet.addElement(5);
        mySet.addElement(6);

        assertEquals(3, mySet.getSetSize());
    }

    @Test
    public void TestThat_List_Extends() {
        MySet mySet = new MySet();
        mySet.addElement(5);
        mySet.addElement(6);
        mySet.addElement(7);
        mySet.addElement(8);
        mySet.addElement(9);
        mySet.addElement(10);
        mySet.addElement(11);
        mySet.addElement(12);
        assertEquals(8, mySet.getSetSize());
    }

    @Test
    public void TestThat_Set_List_ContainsAllElementsAdded() {
        MySet mySet = new MySet();
        mySet.addElement(5);
        mySet.addElement(6);
        mySet.addElement(7);
        mySet.addElement(8);

        int[] elementsList = {5, 6, 7};
        assertTrue(mySet.subsetCheck(elementsList));

    }

    @Test
    public void TestThat_Set_List_AddAllElements() {
        MySet mySet = new MySet();
        mySet.addElement(5);
        mySet.addElement(6);
        mySet.addElement(7);
        mySet.addElement(8);

        int[] newLists = {1, 2, 3};
        assertTrue(mySet.unionChecker(newLists));

    }

    @Test
    public void Test_That_SetX_Equals_SetY() {
        MySet mySet = new MySet();
        mySet.addElement(5);
        mySet.addElement(6);
        mySet.addElement(7);

        int[] equalSet = {6, 7, 5};
        assertTrue(mySet.subsetCheck(equalSet));

    }

    @Test
    public void TestThat_EmptySet_Can_Allow_Addition_of_Non_Empty_SetX() {
        MySet mySet = new MySet();
        int[] newSetLists = {5, 6, 7, 8};
        mySet.addSetList(newSetLists);
        assertEquals(4, mySet.getSetSize());

    }
    @Test
    public void TestThat_All_ElementIn_XYZ_Can_Be_Removed_From_SetXYZAB() {
        MySet mySet = new MySet();
        int[] newSetLists = {5, 6, 7, 8, 9};
        mySet.addSetList(newSetLists);
        int[] anotherList = {5, 6, 7};
        assertTrue(mySet.isAllRemoved(newSetLists, anotherList));

    }
    @Test
    public void TestThat_Common_Element_Between_SetXAnd_SetY_Are_Retained() {
        MySet mySet = new MySet();
        int[] newSetLists = {5, 6, 7, 8, 9};
        mySet.addSetList(newSetLists);
        int[] anotherList = {5, 6, 7};
        assertTrue(mySet.isIntersect(newSetLists, anotherList));
    }
    @Test
    public void TestThat_AllElement_Of_SetX_Can_Be_Cleared(){
        MySet mySet = new MySet();
        int[] newSetLists = {5, 6, 7, 8, 9};
        mySet.addSetList(newSetLists);
        mySet.clearAll(newSetLists);

        assertEquals(0, mySet.getSetSize());
    }
    @Test
    public void TestThat_Int_SetList_Can_Be_Displayed_As_Int_Array(){
        MySet mySet = new MySet();
        int[] newSetLists = {5, 6, 7, 8, 9};
        mySet.addSetList(newSetLists);
        assertArrayEquals(newSetLists, mySet.arrayDisplay());
    }


}

