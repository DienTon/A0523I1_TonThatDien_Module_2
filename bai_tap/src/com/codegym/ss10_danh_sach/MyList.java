package com.codegym.ss10_danh_sach;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            this.element = new Object[capacity];
        } else {
            throw new IndexOutOfBoundsException("khong hop le");
        }
    }

    private void ensureCapa() {
        int newSize = element.length * 2+1;
        element = Arrays.copyOf(element, newSize);
    }

    public void add(int index, E e) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("mang loi vi " + index + "nho hon size");
        } else {
            ensureCapa();
            for (int i = this.size; i > index; i--) {
                element[i] = element[i - 1];
            }
            element[index] = e;
        }
        size++;
    }

    public boolean add(E e) {
        for (int i = 0; i <= this.size; i++) {
            if (element[i] == null) {
                element[i] = e;
                break;
            }
        }
        size++;
        return true;
    }
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.element[i].equals(element)) {
                return i;
            }
        }
        return index;
    }
    public boolean conntains(E element) {
        return this.indexOf(element) >= 0;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) element[i];
    }

    public E remove(int index) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("mang loi vi " + index + "nho hon size");
        } else {
            E e = (E) element[index];
            for (int j = index; j < size - 1; j++)
                element[j] = element[j + 1];
            element[size - 1] = null;
            size--;
            return e;
        }
    }
    public int size(){
        return this.element.length;
    }
    public void clear(){
        size = 0;
        for (int i = 0; i < element.length; i++) {
            element[i] = null;
        }
    }
}
