package org.bohdanrakov.designpatterns.behavioral.strategy;

public class BubbleSort implements Strategy {


    @Override
    public void sort(int[] arr) {
        for (int barrier = arr.length - 1; barrier > 0; barrier--) {
            for (int index = 1; index < barrier; index++) {
                if (arr[index - 1] < arr[index]) {
                    int tmp = arr[index - 1];
                    arr[index - 1] = arr[index];
                    arr[index] = tmp;
                }
            }
        }
    }
}
