public class Main {
    public static void main(String[] args) {
        InitTest[] initTest = new InitTest[5];

        for (int i = 0; i < initTest.length; i++) {
            initTest[i] = new InitTest();
        }

        for (InitTest el : initTest) {
            System.out.println(el.getId());
        }
    }
}
