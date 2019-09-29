package test;

public class TestAgent {
    public static void main(String[] args) {
        TestAgent ta = new TestAgent();
        ta.test();
        int num = ta.getNum();
        System.out.println(num);
    }

    public void test() {
        System.out.println("I'm TestAgent");
    }

    public int getNum() {
        return 1;
    }
}
