package data;

public class DataImpl1 implements IData{

    @Override
    public double getData() {
        System.out.println("BaseDonné");
        return 10;
    }
}
