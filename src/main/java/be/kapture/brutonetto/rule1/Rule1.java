package be.kapture.brutonetto.rule1;

/**
 * Created by missika on 18/12/2017.
 */
public class Rule1 {
    private double selfEmployedTotal, employeetotal, publicTotal;

    public void setSelfEmployedTotal(double selfEmployedTotal) {
        this.selfEmployedTotal = selfEmployedTotal;
    }

    public void setEmployeetotal(double employeetotal) {
        this.employeetotal = employeetotal;
    }

    public void setPublicTotal(double publicTotal) {
        this.publicTotal = publicTotal;
    }

    public Double getTax(){
        return 533.12;
    }

    public void run() {
        throw new UnsupportedOperationException("implement me");
    }


}
