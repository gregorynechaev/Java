import static java.lang.Math.round;

public class FractionalNumber {

    public int digitsAfterDot;
    public double value;


    public void setValue(Object value) {
        this.value = (Double) value;
    }


    public void setDigitsAfterDot(int digitsAfterDot) {
        this.digitsAfterDot = digitsAfterDot;
    }



    public double getValue() {
        if (digitsAfterDot != 0) {
            double aaa = Math.pow(10, digitsAfterDot);
            return Math.round(value * aaa) / aaa;
        } else return value;
    }

    public void say() {
        System.out.println(this.value);
    }

    public FractionalNumber add(FractionalNumber other) {
        double res = this.value + other.getValue();
        FractionalNumber a = new FractionalNumber();
        a.setValue(res);
        return a;
    }

    public FractionalNumber subtract(FractionalNumber other) {
        double res = this.value - other.getValue();
        FractionalNumber a = new FractionalNumber();
        a.setValue(res);
        return a;
    }

    public FractionalNumber multiply(FractionalNumber other) {
        double res = this.value * other.getValue();
        FractionalNumber a = new FractionalNumber();
        a.setValue(res);
        return a;
    }

    public FractionalNumber divide(FractionalNumber other) {
        double res = this.value / other.getValue();
        FractionalNumber a = new FractionalNumber();
        a.setValue(res);
        return a;
    }


    public FractionalNumber rounding(int digitsAfterDot) {
        double aaa = Math.pow(10, digitsAfterDot);
        double res = Math.round(this.value * aaa) / aaa;
        FractionalNumber a = new FractionalNumber();
        a.setValue(res);
        return a;
    }


}

