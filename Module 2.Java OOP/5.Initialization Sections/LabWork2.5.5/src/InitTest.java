public class InitTest {
    private int id;
    private static int nextId;
    static {
        nextId = (int) (Math.random() * 1000 + 1);
    }

    {
        id = ++nextId;
    }

    public int getId() {
        return id;
    }
}
