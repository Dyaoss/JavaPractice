package ch15;

public class Customer implements Buy,Sell{

    @Override
    public void buy() {
        System.out.println("Customer buy.");
    }

    @Override
    public void sell() {
        System.out.println("Customer sell.");
    }

    public void sayHello(){
        System.out.println("Hello");
    }
}
