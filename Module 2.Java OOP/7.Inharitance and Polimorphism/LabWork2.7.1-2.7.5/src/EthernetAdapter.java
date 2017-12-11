public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public EthernetAdapter(String manufactures, float price, String serialNumber, int speed, String mac) {
        super(manufactures, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public String toString() {
        return "EthernetAdapter{" +
                " manufactures= " + super.getManufactures() +
                " price= " + super.getPrice() +
                " serialNumber= " + super.getSerialNumber() +
                " speed= " + speed +
                ", mac= '" + mac + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EthernetAdapter)) return false;
        if (!super.equals(o)) return false;

        EthernetAdapter that = (EthernetAdapter) o;

        if (getSpeed() != that.getSpeed()) return false;
        return getMac().equals(that.getMac());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getSpeed();
        result = 31 * result + getMac().hashCode();
        return result;
    }
}
