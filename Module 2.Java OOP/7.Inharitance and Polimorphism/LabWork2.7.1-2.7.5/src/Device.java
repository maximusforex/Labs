public class Device {
    private String manufactures;
    private float price;
    private String serialNumber;

    public String getManufactures() {
        return manufactures;
    }

    public void setManufactures(String manufactures) {
        this.manufactures = manufactures;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Device(String manufactures, float price, String serialNumber) {
        this.manufactures = manufactures;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device{" +
                "manufactures='" + manufactures + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;

        Device device = (Device) o;

        if (Float.compare(device.getPrice(), getPrice()) != 0) return false;
        if (!getManufactures().equals(device.getManufactures())) return false;
        return getSerialNumber().equals(device.getSerialNumber());
    }

    @Override
    public int hashCode() {
        int result = getManufactures().hashCode();
        result = 31 * result + (getPrice() != +0.0f ? Float.floatToIntBits(getPrice()) : 0);
        result = 31 * result + getSerialNumber().hashCode();
        return result;
    }
}
