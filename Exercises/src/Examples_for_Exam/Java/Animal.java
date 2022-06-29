package Examples_for_Exam.Java;

class Animal {

    void eat() {
        System.out.println("eating...");
    }
}

class Dogi extends Animal {
    void haf() {
        System.out.println("dog...");
    }
}

class Tested{
    public static void main(String[] args) {
        Dogi d = new Dogi();
        d.haf();
        d.eat();
    }
}
