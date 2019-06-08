package at.fhj.iit;


import org.junit.*;
import java.util.NoSuchElementException;

/**
 * Testing the String queue with JUnit tests
 */

public class StringQueueTest {
    private StringQueue testQueue;

    /**
     * Setups a queue with 3 elements
     */
    @Before
    public void setup()
    {
        testQueue = new StringQueue(3);
    }

    /**
     * Check if the queue works
     */
    @Test
    public void testStoreOrder() {
        testQueue.offer("TestOne");
        Assert.assertEquals("TestOne", testQueue.remove());
        testQueue.offer("TestTwo");
        Assert.assertEquals("TestTwo", testQueue.remove());
    }

    /**
     * Testing if it is possible to add 3 elements and get true returned
     */
    @Test
    public void testOfferReturnValues() {
        testQueue.offer("First");
        testQueue.offer("Second");
        Assert.assertTrue(testQueue.offer("Last"));
    }

    /**
     * Testing if the method returns false, if there are more elements than the maxSize
     */
    @Test
    public void testOfferOverflow() {
        testQueue.offer("good");
        testQueue.offer("goood");
        testQueue.offer("gooood");
        Assert.assertFalse(testQueue.offer("Overflow"));
    }

    /**
     * Testing if the maxSize works
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
     * Testing if 2 elements that are peeked are the same
     */
    @Test
    public void doublePeek() {
    	testQueue.offer("right");
        testQueue.offer("wrong");
       

        Assert.assertEquals(testQueue.peek(), testQueue.peek(), "right");
    }

    /**
     * Testing if peek could be null in an empty queue
     */
    @Test
    public void testPeekUnderflow() {
     
    Assert.assertNull(testQueue.peek());

    }

    /**
     * Testinf if the element that got called 2 times will have euqual return values
     */
    @Test
    public void testDoubleElement() {
        testQueue.offer("equal");
        Assert.assertEquals(testQueue.element(), testQueue.element());
    }

    /**
     * Testing to get an element from an empty queue by element method
     */
    @Test (expected = NoSuchElementException.class)
    public void testElementUnderflow() {
        testQueue.element();
    }

    /**
     * Testing to get an element from an empty queue by poll method
     */
    @Test
    public void testPollUnderflow() {
        Assert.assertNull(testQueue.poll());
    }

    /**
     * Testing to get an element from an empty queue by remove method
     * @throws NoSuchElementException if there's no element in the queue
     */
    @Test (expected = NoSuchElementException.class)
    public void testRemoveUnderflow() throws NoSuchElementException {
        testQueue.remove();
    }
}