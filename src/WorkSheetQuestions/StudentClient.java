package WorkSheetQuestions;

public class StudentClient{
    public static void main(String[]args){
        UndergraduateStudent bill = new UndergraduateStudent("Bill");
        bill.setAge(21);
        Student tom = new Student("Tom",21);

        System.out.println(tom.equals(bill));

    }
}

class Student {
    private String name;
    private int age;

    public Student(String n, int a){
        name = n;
        age = a;
    }

    public void setAge(int ag){
        age = ag;
    }

    public boolean equals(Object o){
        if(o instanceof Student){
                Student other = (Student) o;
                return (this.age == other.age);
        }else{
            return false;
        }
    }
}

class UndergraduateStudent extends Student{
    private int year;

    public UndergraduateStudent(String name) {
        super(name, 18);
        this.year = 0;
    }

    @Override
    public void setAge(int ag) {
        super.setAge(ag);
        year = ag - 18;
    }
}

