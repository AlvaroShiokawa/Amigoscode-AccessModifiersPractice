package PrivateModifierPractice.p1;

public class P1 {
    private void display() {
        System.out.println("Sup, world!");
    }
    public void printDisplay() { display(); }} // We are inside the same class, therefore I can access the private method display()!