public class Window {
    private double height, weight;
    private int glassCounter;
    private String color;
    private boolean closeOrOpen;

    public Window() {
        this(13.5, 13.5, 5, "Blue", true);
    }

    public Window(double height) {
        this(height, 12.5, 4, "Yellow", false);
    }

    public Window(double height, double weight) {
        this(height, weight, 3, "Red", true);
    }

    public Window(double height, double weight, int glassCounter) {
        this(height, weight, glassCounter, "Green", false);

    }

    public Window(double height, double weight, int glassCounter, String color) {
        this(height, weight, glassCounter, color, true);
    }

    public Window(double height, double weight, int glassCounter, String color, boolean closeOrOpen) {
        this.height = height;
        this.weight = weight;
        this.glassCounter = glassCounter;
        this.color = color;
        this.closeOrOpen = closeOrOpen;
    }

    void printFields() {
        System.out.println("width = " + this.weight +
                ", height = " + this.height +
                ", numberOfGlass = " + this.glassCounter +
                ", color = " + this.color +
                ", isOpen = " + this.closeOrOpen);
    }
}
