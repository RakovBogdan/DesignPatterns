package org.bohdanrakov.designpatterns.behavioral.strategy;

public class SelectionSort implements Strategy {
    @Override
    public void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length; barrier++) {
            int min = arr[barrier];
            int minIndex = barrier;
            for (int i = barrier + 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    minIndex = i;
                }
            }
            int tmp = arr[barrier];
            arr[barrier] = min;
            arr[minIndex] = tmp;

        }
    }
}
