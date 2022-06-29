package Examples_for_Exam.Java;

class Exo {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Test {
    public static void main(String[] args) {
        Exo e = new Exo();
        e.setAge(15);
        System.out.println(e.getAge());
    }
}