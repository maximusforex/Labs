import java.util.Arrays;

public class ArrayOfObjects {
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

    public static void main(String[] args){
        int[] array = new int[2];

        ArrayOfObjects indexOfArray1 = new ArrayOfObjects();
        ArrayOfObjects indexOfArray2 = new ArrayOfObjects();
        ArrayOfObjects indexOfArray3 = new ArrayOfObjects();
        ArrayOfObjects indexOfArray4 = new ArrayOfObjects();
        ArrayOfObjects indexOfArray5=  new ArrayOfObjects();


        String manufactures1 = indexOfArray1.getManufactures();
        int serialNumber1 = indexOfArray2.getSerialNumber();
        float price1 = indexOfArray3.getPrice();
        int quantityCPU1 = indexOfArray4.getQuantityCPU();
        int frequencyQPU1 = indexOfArray5.getFrequencyCPU();

        for(int element: array){
            array[0] =;
            System.out.println(Arrays.toString(array));
        }



    }
}





