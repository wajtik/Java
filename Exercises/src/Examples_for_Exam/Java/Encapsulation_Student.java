package Examples_for_Exam.Java;

public class Encapsulation_Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Test {
    public static void main(String[] args) {

        Encapsulation_Student s = new Encapsulation_Student();

        s.setName("rado");

        System.out.println(s.getName());
    }
}