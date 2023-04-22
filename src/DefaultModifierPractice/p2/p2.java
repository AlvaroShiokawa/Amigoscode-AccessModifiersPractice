package DefaultModifierPractice.p2;

//import DefaultModifierPractice.p1.P1;

// Because P1 is default, and is inside the p1 package, whereas our class here, P2, is from a separate package p2,
// this means p1 package is outside our p2 package, thus we cannot access the P1 default class.
//
// This happens because default classes cannot be accessed from outside its same package.
class p2 {
    public static void main(String[] args) {
//        P1 p1Obj = new P1();
//        p1Obj.display();
    }
}
