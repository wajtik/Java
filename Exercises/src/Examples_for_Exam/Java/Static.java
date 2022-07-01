package Examples_for_Exam.Java;

// NON STATIC VARIABLE
public class Static {

    int count = 0;// will get memory each time when the instance is created

    public Static() {
        count++;// incrementing value
        System.out.println(count);
    }

    public static void main(String args[]) {
        // Creating objects
        Static c1 = new Static(); // 1
        Static c2 = new Static(); // 1
        Static c3 = new Static(); // 1

        System.out.println(c1 + " " + c2 + " " + c3);
    }
}

/************************************************************************************* */

// STATIC VARIABLE
class Counter2 {
    static int count = 0;// will get memory only once and retain its value

    Counter2() {
        count++;// incrementing the value of static variable
        System.out.println(count);
    }

    public static void main(String args[]) {
        // creating objects
        Counter2 c1 = new Counter2(); // 1
        Counter2 c2 = new Counter2(); // 2
        Counter2 c3 = new Counter2(); // 3

        System.out.println(c1 + " " + c2 + " " + c3);
    }
}
