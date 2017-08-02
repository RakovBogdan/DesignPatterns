package org.bohdanrakov.designpatterns.creational.abstractfactory;

public class EnMouse implements Mouse {

    public void click() {
        System.out.println("Mouse clicked");
    }

    public void doubleClick() {
        System.out.println("Mouse double-click");
    }

    public void scroll(int direction) {
        if (direction > 0) {
            System.out.println("Scroll up");
        } else if (direction < 0) {
            System.out.println("Scroll down");
        } else {
            System.out.println("Not scrolling");
        }
    }
}
