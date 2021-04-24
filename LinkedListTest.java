// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Quinn Sullivan (quinnsullivan)
// -- Daniel Petrenko (danielp18)
// -- Kirti Shukla (kshukla01)
package prj5;

import java.util.Iterator;

/**
 * Tests the linked list class
 *
 * @author <Quinn Sullivan> <quinnsullivan>
 * @author Daniel Petrenko <danielp18>
 * @author Kirti Shukla <kshukla01>
 * @version <4/24/2021>
 */
public class LinkedListTest extends student.TestCase {

    private LinkedList<String> list;
    private Iterator<String> iter;

    /**
     * sets up test classes
     */
    public void setUp() {
        list = new LinkedList<String>();
        iter = list.iterator();
    }


    /**
     * testing add() two param method w/ null
     */
    public void testAdd2Null() {
        Exception e = null;
        try {
            list.add(0, null);
        }
        catch (Exception exception) {
            e = exception;
        }
        assertTrue(e instanceof IllegalArgumentException);
    }


    /**
     * testing add() with index out of bounds
     */
    public void testAddIOOB() {
        Exception e = null;
        try {
            list.add(2, "A");
        }
        catch (Exception exception) {
            e = exception;
        }
        assertTrue(e instanceof IndexOutOfBoundsException);
        e = null;
        try {
            list.add(-1, "A");
        }
        catch (Exception exception) {
            e = exception;
        }
        assertTrue(e instanceof IndexOutOfBoundsException);
    }


    /**
     * testing add() with two param
     */
    public void testAdd2Param() {
        list.add(0, "A");
        assertEquals("A", list.get(0));
        list.add(0, "B");
        assertEquals("B", list.get(0));
        assertEquals("A", list.get(1));
        list.add(2, "D");
        assertEquals("D", list.get(2));
        list.add(2, "C");
        assertEquals("C", list.get(2));
        assertEquals(4, list.size());
    }


    /**
     * testing() add with one param
     */
    public void testAdd() {
        list.add("A");
        list.add("B");
        assertEquals(2, list.size());
        assertEquals("B", list.get(1));

    }


    /**
     * testing add() one param method with null
     */
    public void testAddNull() {
        Exception e = null;
        try {
            list.add(null);
        }
        catch (Exception exception) {
            e = exception;
        }
        assertTrue(e instanceof IllegalArgumentException);
    }


    /**
     * testing isEmpty()
     */
    public void testIsEmpty() {
        assertTrue(list.isEmpty());
        list.add("test");
        assertFalse(list.isEmpty());
    }


    /**
     * testing remove(object)
     */
    public void testRemoveObj() {
        assertFalse(list.remove(null));
        list.add("A");
        list.add("B");
        assertTrue(list.remove("A"));
        assertEquals("B", list.get(0));
        assertEquals(1, list.size());
        list.add("C");
        assertTrue(list.remove("C"));
        assertEquals("B", list.get(0));
    }


    /**
     * testing remove(index)
     */
    public void testRemoveIndex() {
        Exception e = null;
        try {
            list.remove(2);
        }
        catch (Exception exception) {
            e = exception;
        }
        assertTrue(e instanceof IndexOutOfBoundsException);
        e = null;
        try {
            list.remove(-1);
        }
        catch (Exception exception) {
            e = exception;
        }
        assertTrue(e instanceof IndexOutOfBoundsException);

        list.add("A");
        list.add("B");
        assertTrue(list.remove(1));
        assertEquals(1, list.size());
        list.add("B");
        assertTrue(list.remove(1));
        assertEquals(1, list.size());
        e = null;
        try {
            list.remove(2);
        }
        catch (Exception exception) {
            e = exception;
        }
        assertTrue(e instanceof IndexOutOfBoundsException);

    }


    /**
     * testing get()
     */
    public void testGet() {
        Exception exception = null;
        list.add("A");
        try {
            list.get(1);
        }
        catch (IndexOutOfBoundsException e) {
            exception = e;
        }
        assertTrue(exception instanceof IndexOutOfBoundsException);
    }


    /**
     * testing contains()
     */
    public void testContains() {
        assertFalse(list.contains("Atest"));
        list.add("A");
        assertTrue(list.contains("A"));
        assertFalse(list.contains("B"));
        list.add("B");
        list.add("C");
        assertTrue(list.contains("C"));
    }


    /**
     * testing clear()
     */
    public void testClear() {
        list.add("test");
        list.clear();
        assertFalse(list.contains("test"));
        assertEquals(0, list.size());

    }


    /**
     * testing lastIndexOf()
     */
    public void testLastIndexOf() {
        assertEquals(-1, list.lastIndexOf("test"));
        list.add("A");
        assertEquals(0, list.lastIndexOf("A"));
        list.add("A");
        assertEquals(1, list.lastIndexOf("A"));
        list.add("B");
        assertEquals(2, list.lastIndexOf("B"));
        list.add("A");
        assertEquals(3, list.lastIndexOf("A"));
    }


    /**
     * testing toString()
     */
    public void testToString() {
        String test1 = "{A, B, C}";
        assertEquals("{}", list.toString());
        list.add("A");
        list.add("B");
        list.add("C");
        assertEquals(test1, list.toString());
    }


    /**
     * Testing toArray() method
     */
    public void testToArray() {
        list.add("A");
        list.add("B");
        list.add("C");
        assertEquals("A", list.toArray()[0]);
        assertEquals("B", list.toArray()[1]);
        assertEquals("C", list.toArray()[2]);
    }


    /**
     * Testing equals() method
     */
    public void testEquals() {
        LinkedList<String> test1 = list;
        LinkedList<String> test2 = null;
        String test3 = "";
        LinkedList<String> test4 = new LinkedList<String>();
        LinkedList<String> test5 = new LinkedList<String>();
        LinkedList<String> test6 = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        test4.add("A");
        test4.add("B");
        test4.add("C");

        test5.add("A");
        test5.add("wrong");
        test5.add("C");

        test6.add("A");
        test6.add("B");

        assertTrue(list.equals(test1));
        assertFalse(list.equals(test2));
        assertFalse(list.equals(test3));
        assertTrue(list.equals(test4));
        assertFalse(list.equals(test5));
        assertFalse(list.equals(test6));
    }


    /**
     * tests the iterator methods
     */
    public void testIterator() {
        assertFalse(iter.hasNext());
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        iter = list.iterator();
        assertTrue(iter.hasNext());
        assertEquals("A", iter.next());

    }
}
