public class Auto implements Comparable<Auto> {
    private int numberOfWheels;
    private String model;
    private int mileage;
    private Color color;

    @Override
    public int compareTo(Auto o) {
        return this.model.compareTo(o.model);
    }

    public enum Color{GREEN,RED,BLUE,WHITE,BLACK,PERPLE,BROWN,ORANGE};

    public Auto(int numberOfWheels, String model, int mileage, Color color) {
        this.numberOfWheels = numberOfWheels;
        this.model = model;
        this.mileage = mileage;
        this.color = color;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Auto auto = (Auto) o;

        if (numberOfWheels != auto.numberOfWheels) return false;
        if (mileage != auto.mileage) return false;
        if (model != null ? !model.equals(auto.model) : auto.model != null) return false;
        return color == auto.color;
    }

    @Override
    public int hashCode() {
        int result = numberOfWheels;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + mileage;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "numberOfWheels=" + numberOfWheels +
                ", model='" + model + '\'' +
                ", mileage='" + mileage + '\'' +
                ", color=" + color +
                '}';
    }
}
