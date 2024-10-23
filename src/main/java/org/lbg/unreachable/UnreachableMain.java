package org.lbg.unreachable;

public class UnreachableMain {
    public static void main(String[] args) {
        System.out.printf("UnreachableMain");
    }

    public void fooBar() {

        ClassB cb = new ClassB();

        cb.age = 44;
    }
}
