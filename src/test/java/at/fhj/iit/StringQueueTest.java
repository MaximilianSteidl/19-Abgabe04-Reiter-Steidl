package at.fhj.iit;


import org.junit.*;
import java.util.NoSuchElementException;

/**
 * Test of String queue
 * Methods and variables are tested via JUnit tests.
 */

public class StringQueueTest {
    private StringQueue testQueue;

    /**
     * Builds a String queue with three elements
     */
    @Before
    public void setup()
    {
        testQueue = new StringQueue(3);
    }

    /**
     * Check if queue works according to FIFO principle
     */
    @Test
    public void testStoreOrder() {
        testQueue.offer("TestOne");
        Assert.assertEquals("TestOne", testQueue.remove());
        testQueue.offer("TestTwo");
        Assert.assertEquals("TestTwo", testQueue.remove());
    }

    /**
     * Tests if it is possible to add the maximum of elements and true returned.
     */
    @Test
    public void testOfferReturnValues() {
        testQueue.offer("First");
        testQueue.offer("Second");
        Assert.assertTrue(testQueue.offer("Last"));
    }

    /**
     * Tests whether false ist returned when offering more elements than allowed by maxSize
     */
    @Test
    public void testOfferOverflow() {
        testQueue.offer("good");
        testQueue.offer("goood");
        testQueue.offer("gooood");
        Assert.assertFalse(testQueue.offer("Overflow"));
    }

    /**
     * Test whether setting queue size works
     */
    @Test
    public void testMaxSizeSetting() {
        testQueue = new StringQueue(4);

        Assert.assertTrue(testQueue.offer("test"));
        Assert.assertTrue(testQueue.offer("test"));
        Assert.assertTrue(testQueue.offer("test"));
        Assert.assertTrue(testQueue.offer("test"));
        Assert.assertFalse(testQueue.offer("test"));
    }

    /**
     * Tests if two elements that are peeked after each other are the same
     */
    @Test
    public void doublePeek() {
    	testQueue.offer("right");
        testQueue.offer("wrong");
       

        Assert.assertEquals(testQueue.peek(), testQueue.peek(), "right");
    }

    /**
     * Tests if peek on empty queue gets null as result
     */
    @Test
    public void testPeekUnderflow() {
     
    Assert.assertNull(testQueue.peek());

    }

    /**
     * Add an element to queue, call element() 2x and check if both return values are equal
     */
    @Test
    public void testDoubleElement() {
        testQueue.offer("equal");
        Assert.assertEquals(testQueue.element(), testQueue.element());
    }

    /**
     * Try to retrieve an element from empty queue using element method
     */
    @Test (expected = NoSuchElementException.class)
    public void testElementUnderflow() {
        testQueue.element();
    }

    /**
     * Try to retrieve an element from empty queue using poll method
     */
    @Test
    public void testPollUnderflow() {
        Assert.assertNull(testQueue.poll());
    }

    /**
     * Try to retrieve an element from empty queue using remove method
     * @throws NoSuchElementException When trying to remove element from empty queue
     */
    @Test (expected = NoSuchElementException.class)
    public void testRemoveUnderflow() throws NoSuchElementException {
        testQueue.remove();
    }
}