package PrivateModifierPractice.p2;

//import PrivateModifierPractice.p1.P1;

// PRivate classes only access elements in the same class to by  accessed by the class..

// P2 class is in p2 package, which is a separate package the p1, where lies P1 class, but even
// if P2 and P1 where of the same package, we still wouldn´t be able to access P1 class´s display()
// method from P2 class.
class p2 {
    public static void main(String[] args) {
        //P1 p1Obj = new P1();
        //p1Obj.display();
    }
}
