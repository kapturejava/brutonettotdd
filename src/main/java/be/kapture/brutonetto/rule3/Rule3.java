package be.kapture.brutonetto.rule3;

/**
 * Created by missika on 18/12/2017.
 */
public class Rule3 {
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


    public void setTax1(double tax1) {
        throw new UnsupportedOperationException("implement me");
    }

    public void setTax2Employee(double tax2Employee) {
        throw new UnsupportedOperationException("implement me");
    }

    public void setTax2SelfEmployed(double tax2SelfEmployed) {
        throw new UnsupportedOperationException("implement me");
    }

    public void setTax3public(double tax3public) {
        throw new UnsupportedOperationException("implement me");
    }

    public Double getEmployeeTax() {
        throw new UnsupportedOperationException("implement me");
    }

    public Double getSelfEmployedTax() {
        throw new UnsupportedOperationException("implement me");
    }

    public Double getPublicRightTax() {
        throw new UnsupportedOperationException("implement me");
    }
}
