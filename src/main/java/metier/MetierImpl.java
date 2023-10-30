package metier;

import data.IData;

public class MetierImpl implements IMetier{
    private IData data;
    @Override
    public double calcul() {
        double dat= data.getData();
        double t=dat*15.6;
        return t;
    }

    public void setData(IData data) {
        this.data = data;
    }
}
