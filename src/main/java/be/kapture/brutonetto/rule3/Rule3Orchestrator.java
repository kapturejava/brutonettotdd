package be.kapture.brutonetto.rule3;

import be.kapture.brutonetto.BrutoNettoInputs;

/**
 * Created by missika on 18/12/2017.
 */
public class Rule3Orchestrator {
    private final Rule3 rule3;
    private BrutoNettoInputs brutoNettoInputs;

    public Rule3Orchestrator(BrutoNettoInputs brutoNettoInputs, double tax1, double tax2Employee, double tax2SelfEmployed, double tax3public) {
        this.brutoNettoInputs = brutoNettoInputs;
        rule3 = new Rule3();
        rule3.setTax1(tax1);
        rule3.setTax2Employee(tax2Employee);
        rule3.setTax2SelfEmployed(tax2SelfEmployed);
        rule3.setTax3public(tax3public);

    }

    public void run(){
        rule3.run();
    }

    public Double getTax(){
        return rule3.getTax();
    }




}
