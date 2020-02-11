package com.library;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LibraryQueue implements Queue {
    private Register[] queue = new Register[3];
    private int size;
    private int head;
    private int tail;


    @Override
    public int enqueue(Register data) {
        for(int i=0; i < size; i++){
            Register checkQueue = queue[i];
            if(data.getName().equals(checkQueue.getName())){
                return -1;
            }
        }
        if(!isFull()){
            queue[tail] = data;
            tail = (tail+1) % 3;
            size++;
            return 0;
        }
        else {
            throw new IllegalStateException("Queue is currently full, please attend to Users");
        }
    }
    public void show(){
        for(int i = 0; i<size; i++){
            System.out.println(queue[i].toString() + " ");
        }
    }

    @Override
    public Register dequeue() {
        if(!isEmpty()){
            Register data = queue[head];
            System.out.println(data + " and has been removed from the queue");
            head = (head + 1) % 3;
            size --;
            return data;
        }
        throw new NoSuchElementException("Queue is empty, you can add more borrowers to the queue");
    }
//    public Borrower dequeue() {
//        if(!isEmpty()){
//            Borrower data = bookQueue[head];
//            System.out.println(data + " was deleted from the queue");
//            head = (head + 1) % 3;
//            size --;
//            return data;
//        }
//        throw new NoSuchElementException("Queue is empty, you can add more borrowers to the queue");
//    }
    public int getSize() {
        return size;
    }

    private boolean isFull() {
        return getSize() == 3;
    }

    @Override
    public Object peek() {
        if (size == 0) {
            throw new NoSuchElementException("Cannot peek into empty queue");
        }
        return queue[size - 1];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return getSize() == 0;
    }
}