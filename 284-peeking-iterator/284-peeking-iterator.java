// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> arr = null;
    Integer nextVal = null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    arr = iterator;
        if(arr.hasNext()) nextVal = arr.next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return nextVal;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer val = nextVal;
        if(arr.hasNext()) nextVal = arr.next();
        else nextVal = null;
        return val;
	}
	
	@Override
	public boolean hasNext() {
	    return nextVal != null || arr.hasNext();
	}
}