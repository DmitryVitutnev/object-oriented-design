package ru.omsu.imit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stack<T> implements Iterable<T> {

    private List<T> list;


    public Stack() {
        list = new ArrayList<T>();
    }

    public void push(T obj) {
        list.add(obj);
    }

    public T pop() {
        T ret = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return ret;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void clear() {
        list.clear();
    }

    public Iterator<T> iterator() {
        return new StackIterator(list);
    }

    private class StackIterator implements Iterator<T> {

        private List<T> list;
        private int index;

        public StackIterator(List<T> list) {
            this.list = list;
            index = list.size();
        }

        public boolean hasNext() {
            return index > 0;
        }

        public T next() {
            return list.get(--index);
        }

        public void remove() {

        }
    }

}
