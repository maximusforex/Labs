public class Main {
    public static void main(String[] args) {
       Window w= new Window();
       w.printFields();

        Window[] myWindow = new Window[6];
        myWindow[0] = new Window();
        myWindow[1] = new Window(300);
        myWindow[2] = new Window(250, 400);
        myWindow[3] = new Window(200,200,3);
        myWindow[4] = new Window(370, 400, 2, "yellow");
        myWindow[5] = new Window(100, 150, 4, "green", true);

        for (Window myCurrentWindow : myWindow) {
            myCurrentWindow.printFields();
        }
    }
}

