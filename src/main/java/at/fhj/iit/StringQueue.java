package at.fhj.iit;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/** 
 * The queue is implemented as an array list with a defined maximum size.
 * The methods allow to add and remove elements from the queue (with or without deletion)
 * remove() and element() methods throw exceptions if the queue is empty. Some other methods return null in that case.
 */

public class StringQueue implements Queue {
	private static final Logger logger = LogManager.getLogger(StringQueue.class);
	
	private List<String> elements = new ArrayList<String>();
	private int maxSize = 5;

	
	/**
	 * The constructor of the String queue
	 * @param maxSize = the maximum number of elements
	 */
	
	public StringQueue(int maxSize){
		logger.info("Calling StringQueue constructor");
		this.maxSize = maxSize;
	}
	
	/**
	 * The method adds the element obj to the String queue
	 * @param obj = obj added to the String queue
	 * @return true = if addition is successful --> true, if not --> false
	 */
	
	@Override
	public boolean offer(String obj) {
		logger.info("Calling method 'offer'.");
		
		if(elements.size()!= maxSize)
			elements.add(obj);
		else
			return false;
		
		return true;
	}

	/**
	 * Returns the element that is going to delete
	 * @return element or null if it doesn't exist
	 */
	
	@Override
	public String poll() {
		logger.info("Calling method 'poll'.");
		
		String element = peek();
		
		if(elements.size() != 0){
			elements.remove(0);
		}
		
		return element;
	}

	/**
	 * Returns the element that is going to delete with NoSuchElementException --> if empty it throws the Exception
	 * @return element
	 */
	
	@Override
	public String remove() {
		logger.info("Calling method 'remove'.");
		
		String element = poll();		
		if(element == null)
			throw new NoSuchElementException("there's no element any more");
		
		return element;
	}
	
	/**
	 * Returns the element 
	 * @return elements or null
	 */

	@Override
	public String peek() {
		logger.info("Calling method 'peek'.");
		
		String element;
		if(elements.size() > 0)
			element = elements.get(0);
		else
			element = null;
		
		return element;
	}
	
	/**
	 * Returns element with NoSuchElementException --> if queue is empty it throws Exception
	 * @return element
	 */

	@Override
	public String element() {
		logger.info("Calling method 'element'.");
		
		String element = peek();
		if(element == null) {
			logger.error("...throwing NoSuchElementException");
			throw new NoSuchElementException("there's no element any more");
		}
		return element;
	}

}