package Examples_for_Exam.Java;

public class Inharitance_Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Inharitance_Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("weeping...");
    }
}

class TestInheritance2 {
    public static void main(String args[]) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}
