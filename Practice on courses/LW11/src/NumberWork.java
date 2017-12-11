import java.lang.Number;

public class NumberWork<T extends Number>{
    private T number;

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }
}
