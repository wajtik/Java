package Examples_for_Exam.Java;

public class StaticCounter {
    static int count = 0;
    int sum = 0;

    public static void counter() {
        count++;
        System.out.println("Static: " + count);
    }

    public void counter2() {
        count++;
        sum++;
        System.out.println("Static: " + count + " <--> Non Static: " + sum);
    }

    public static void main(String[] args) {
        System.out.println("Static field + method");
        for (int i = 0; i < 5; i++) {
            StaticCounter.counter();
        }
        System.out.println("");

        System.out.println("Static field vs. non Static field");
        for (int i = 0; i < 5; i++) {
            StaticCounter s1 = new StaticCounter();
            s1.counter2();
        }

    }
}
