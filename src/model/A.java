package model;

public class A extends B {

    public void m() {
        System.out.println("A m");
    }

    public static void main(String[] args) {
        A a1 = new A();
        a1.m();
        a1.n();
        
        B b1 = new B();
        b1.n();
        // b1.m();
        
        B a2 = new A();
        a2.n();
//        a2.m();

        B x = new A();
//        A y = x;
        A y = (A)x;
        y.m();
        
    }

}
