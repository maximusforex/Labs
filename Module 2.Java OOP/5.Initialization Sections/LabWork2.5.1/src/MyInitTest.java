
public class MyInitTest {
    private int testnumber;

    {
        System.out.println("Non-static block1");
    }
    {
        System.out.println("Non-static block2");
    }
    static{
        System.out.println("Static block1");
    }
    static{
        System.out.println("Static block2");
    }
    public MyInitTest(){
        this(10);
        System.out.println("Constructor1");
    }
    public MyInitTest(int testnumber){
        this.testnumber=testnumber;
        System.out.println("Constructor2");
    }
}
