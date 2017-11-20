public class Computer {
    private String manufactures;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    public String getManufactures() {
        return manufactures;
    }

    public void setManufactures(String manufactures) {
        this.manufactures = manufactures;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    public void view() {

        System.out.println("Manufactures: " + getManufactures()
                + "Serial Number: " + getSerialNumber() + "\n"
                + "Price: " + getPrice() + "\n"
                + "Quantity CPU: " + getQuantityCPU() + "\n"
                + "Frequency CPU: " + getFrequencyCPU() + "\n");
    }

    public static void main(String[] args) {
        final Computer[] array = new Computer[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Computer();
            array[i].setManufactures("Intel ");
            array[i].setSerialNumber(i + 1);
            array[i].setFrequencyCPU(2600);
            array[i].setQuantityCPU(4);
            array[i].setPrice(350.5f);
        }

        for (Computer element : array) {
            element.setPrice(element.getPrice() + 0.1f * element.getPrice());
        }

        for (Computer element : array) {
            element.view();
        }
    }
}
