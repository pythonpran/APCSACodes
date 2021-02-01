package Unit5Fr;

public class APLine {
    private int a, b, c;

    public APLine(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSlope(){
        return - (double) a / (double) b;
    }

    public boolean isOnLine(int x, int y){
        return (x * a + y * b + c) == 0;
    }

    public boolean isParallel(APLine otherLine){
        return (this.a == otherLine.a) && (this.b == otherLine.b);
    }
}
