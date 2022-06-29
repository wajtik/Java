package Examples_for_Exam.Java;

interface Interfaces {
    void print();
}

class A6 implements Interfaces {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        A6 obj = new A6();
        obj.print();
    }
}
