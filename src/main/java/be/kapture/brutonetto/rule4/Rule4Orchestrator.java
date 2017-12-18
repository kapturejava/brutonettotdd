package be.kapture.brutonetto.rule4;

import be.kapture.brutonetto.BrutoNettoInputs;

/**
 * Created by missika on 18/12/2017.
 */
public class Rule4Orchestrator {
    private final Rule4 rule;
    private BrutoNettoInputs brutoNettoInputs;

    public Rule4Orchestrator(BrutoNettoInputs brutoNettoInputs, double tax1, double tax2Employee, double tax2SelfEmployed, double tax2public, double tax3Public) {
        this.brutoNettoInputs = brutoNettoInputs;
        rule = new Rule4();
        rule.setTax1(tax1);
        rule.setTax2Employee(tax2Employee);
        rule.setTax2SelfEmployed(tax2SelfEmployed);
        rule.setTax2public(tax2public);
        rule.setTax3public(tax3Public);
    }

    public void run(){
        rule.run();
    }

    public Double getTax(){
        return rule.getTax();
    }

    public Double getEmployeeTax(){
        return rule.getEmployeeTax();
    }

    public Double getSelfEmployedTax(){
        return rule.getSelfEmployedTax();
    }

    public Double getpublicRightTax(){
        return rule.getPublicRightTax();
    }


}
