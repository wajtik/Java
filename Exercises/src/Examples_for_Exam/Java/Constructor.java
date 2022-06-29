package Examples_for_Exam.Java;

public class Constructor {
    static String name;
    static int age;

    public Constructor() {
        name = "FirstName";
        age = 5;
    }

    void disply() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Constructor student1 = new Constructor();
        student1.disply();
    }
}
