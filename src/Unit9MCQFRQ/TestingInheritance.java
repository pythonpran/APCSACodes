package Unit9MCQFRQ;

import java.util.ArrayList;

public class TestingInheritance {
    private static ArrayList<BaseClass> g = new ArrayList<BaseClass>();
//  Line below this causes a compiler issue
//    private static ArrayList<BaseClass> h = new ArrayList<Subclass>();
    public static void main(String[]args){
        // Subclass works, polymorphism embedded, no error created
        g.add(new Subclass());

        // Polymorphism, no need for casting
        BaseClass b = new Subclass();

    }
}

class BaseClass{

}

class Subclass extends BaseClass{

}
