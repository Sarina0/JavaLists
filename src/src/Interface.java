package  src;

import src.Exceptinos.CapacityReachedListException;
import src.Exceptinos.EmptyListException;

public interface Interface<T>
 {
    

public int getCurrentSize();
public boolean isEmpty();

/** Adds a new entry to this set, avoiding duplicates.
 @param newEntry The object to be added as a new entry.
@return True if the addition is successful, or
false if the item already is in the set. */
//public boolean add(T newEntry);
// public void add(T element) throws CapacityReachedListException;


/** Removes a specific entry from this set, if possible.
@param anEntry The entry to be removed.
@return True if the removal was successful, or false if
not. */
//public boolean remove(T anEntry);

// public T get(int pos);

public void addFirst(T element);

public void addLast(T element);

public void removeFirst();

public void removeLast();

public void getFirst() throws EmptyListException;

public void getLast() throws EmptyListException;


} 


