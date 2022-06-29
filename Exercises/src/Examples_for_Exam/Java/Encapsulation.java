package Examples_for_Exam.Java;

class Encapsulation {

    private long acc_no;

    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }
}

class Test {
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setAcc_no(5);
        // System.out.println(e.acc_no); Error
        System.out.println(e.getAcc_no());
    }
}