package Unit5Fr;

public class APLineClient {
    public static void main(String[]args){
        APLine line1 = new APLine(5, 4, -17);    // 5x + 4y -17 = 0
        double slope1 = line1.getSlope();        // slope1 is assigned -1.25
        boolean onLine1 = line1.isOnLine(5, -2); // true: 5(5) + 4(-2) - 17 = 0

        APLine line2 = new APLine(-25, 40, 30);  // -25x + 40y + 30 = 0
        double slope2 = line2.getSlope();        // slope2 is assigned 0.625
        boolean onLine2 = line2.isOnLine(5, -2); // false: -25(5) + 40(-2) + 30 != 0

        APLine line3 = new APLine(10, 8, 15);    // 10x + 8y + 15 = 0
        double slope3 = line3.getSlope();        // slope3 is assigned -1.25
        boolean onLine3 = line3.isOnLine(5, -2); // false: 10(5) + 8(-2) + 15 != 0

        boolean line1AndLine2Parallel = line1.isParallel(line2); // False
        boolean line1AndLine3Parallel = line1.isParallel(line3); // True

        System.out.println("OneLine1: " + onLine1);
        System.out.println("OneLine2: " + onLine2);
        System.out.println("Line1AndLine2Parallel: " + line1AndLine2Parallel);

    }
}
