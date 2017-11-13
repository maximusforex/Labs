public class Computer {
    private String manufactures;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    public String getManufactures(){
        return manufactures;
    }
    public void setManufactures(String manufactures){
        this.manufactures=manufactures;
    }

    public int getSerialNumber(){
        return serialNumber;
    }
    public void setSerialNumber(int serialNumber){
        this.serialNumber=serialNumber;
    }

    public float getPrice(){
        return price;
    }
    public void setPrice(float price){
        this.price=price;
    }

    public int getQuantityCPU(){
        return quantityCPU;
    }
    public void setQuantityCPU(int quantityCPU){
        this.quantityCPU=quantityCPU;
    }

    public int getFrequencyCPU(){
        return frequencyCPU;
    }
    public void setFrequencyCPU(int frequencyCPU){
        this.frequencyCPU=frequencyCPU;
    }
}
