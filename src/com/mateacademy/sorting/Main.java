package com.mateacademy.sorting;

public class Main {
    public static void main(String[] args) {

        Sorting sorting = new Sorting();

        sorting.initArray();
        System.out.println("Вихідний масив.");
        sorting.printArray();
        sorting.bubbleSort();
        System.out.println("Сортуємо методом бульбашок.");
        sorting.printArray();

        sorting.initArray();
        System.out.println("Вихідний масив.");
        sorting.printArray();
        sorting.selectionSort();
        System.out.println("Сортуємо методом сортування вибором.");
        sorting.printArray();

        sorting.initArray();
        System.out.println("Вихідний масив.");
        sorting.printArray();
        sorting.quickSort(0,9);
        System.out.println("Сортуємо методом швидкого сортування.");
        sorting.printArray();

        sorting.initArray();
        System.out.println("Вихідний масив.");
        sorting.printArray();
        sorting.insertionSort();
        System.out.println("Сортуємо методом сортування вставками.");
        sorting.printArray();

        sorting.initArray();
        System.out.println("Вихідний масив.");
        sorting.printArray();
        sorting.shuttleSort();
        System.out.println("Сортуємо методом сортування човником.");
        sorting.printArray();
    }
}
