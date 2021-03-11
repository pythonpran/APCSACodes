package Unit9MCQFRQ;

public class PictureBook extends Book{
    private String illustrator;
    public PictureBook(String t, String a, String illustrator){
        super(t,a);
        this.illustrator = illustrator;
    }

    @Override
    public void printBookInfo() {
        super.printBookInfo();
        System.out.print(" and illustrated by " + illustrator);
    }
}
