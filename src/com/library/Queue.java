package com.library;

public interface Queue {

    int enqueue(Register data);

    /**
     * Removes the front item from the queue and returns it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    Object dequeue();

    /**
     * Returns the front item from the queue without popping it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    Object peek();

    /**
     * Returns the number of items currently in the queue.
     */
    int size();

    /**
     * Returns whether the queue is empty or not.
     */
    boolean isEmpty();
}