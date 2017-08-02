package org.bohdanrakov.designpatterns.creational.abstractfactory;

public class UkrMouse implements Mouse {

    public void click() {
        System.out.println("Клік мишею");
    }

    public void doubleClick() {
        System.out.println("Подвійний Клік мишею");
    }

    public void scroll(int direction) {
        if (direction > 0) {
            System.out.println("Переміщуюся вгору");
        } else if (direction < 0) {
            System.out.println("Переміщуюся вниз");
        } else {
            System.out.println("Не Переміщуюся");
        }
    }
}
