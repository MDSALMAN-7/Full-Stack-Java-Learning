package com.inheritance.daimond;

class A {

    public void show() {
        // Parent A provides its own implementation
        System.out.println("A class show()...");
    }
}

class B extends A {

    @Override
    public void show() {
        // B overrides the show() method of A
        System.out.println("B class show()...");
    }
}

class C extends A {

    @Override
    public void show() {
        // C also overrides the show() method of A
        System.out.println("C class show()...");
    }
}

// This is hypothetical code, not valid Java
// Java does not allow extending two classes simultaneously
class D extends B, C {
    // D inherits show() from both B and C
    // Which show() method should D execute?
}

public class DaimondProblem {

    public static void main(String[] args) {

        D obj = new D();

        // Ambiguity:
        // Should B's show() execute or C's show()?
        obj.show();
    }
}
