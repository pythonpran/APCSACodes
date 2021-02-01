package UberDriver;

public class UberDriverClient {
    public static void main(String[]args){
        UberDriver Carl = new UberDriver("Carl", 5, 0.05, 30, 50,30, 50, 3.0);
        System.out.println(Carl);
        Carl.dropOff(10,3);
        System.out.println(Carl);
        Carl.getGas(10);
        System.out.println(Carl);
        Carl.pickUp(100,7);
    }
}
