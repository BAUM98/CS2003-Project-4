package PriorityQueues;

import Heaps.Heap;
import Heaps.HeapException;
import java.util.Comparator;

// *********************************************************
// Assumes that Heap implementation is in package Heaps.
// PriorityQueue class implementation.
// *********************************************************

public class PriorityQueue<T>{
  private Heap<T> h;

  public PriorityQueue() {
    h = new Heap<T>();
  }  // end default constructor

  public PriorityQueue(Comparator<? super T> comparator) {
    h = new Heap<T>(comparator);
  }  // end default constructor

  // priority-queue operations:
  public boolean pqIsEmpty() {
    return h.heapIsEmpty();
  }  // end pqIsEmpty

  public void pqInsert(T newItem) throws PriorityQueueException {
    try {
      h.heapInsert(newItem);
    }  // end try
    catch (HeapException e) { 
      throw new PriorityQueueException(
                "PQueueException: Problem inserting to Priority Queue");
    }  // end catch
  }  // end pqInsert

  public T pqDelete() {
    return h.heapDelete();
  }  // end pqDelete
   
}  // end PriorityQueue
