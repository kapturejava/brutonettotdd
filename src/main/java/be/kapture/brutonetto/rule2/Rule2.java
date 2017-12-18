package be.kapture.brutonetto.rule2;

/**
 * Created by missika on 18/12/2017.
 */
public class Rule2 {
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


    public void run() {
        throw new UnsupportedOperationException("implement me");
    }


    public Double getPublicRightTax() {
        return 324.43;
    }

    public Double getSelfEmployedTax() {
        return 123.45;

    }

    public Double getEmployeeTax() {
        return 54.23;
    }

    public void setPreviousTax(double tax1) {
        throw new UnsupportedOperationException("implement me");
    }
}
