package APCSAQuestions;

public class FindAverage {
    public static void main(String[]args){

    }

    public static int findAvg(int[][] list){
        int sum = 0;
        for(int i = 0;i < list.length;i++){
            for(int j = 0;j < list[0].length;j++){
                sum += list[i][j];
            }
        }
        return sum/(list.length * list[0].length);
    }
}
