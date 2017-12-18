package be.kapture.brutonetto.rule5;

import be.kapture.brutonetto.BrutoNettoInputs;

/**
 * Created by missika on 18/12/2017.
 */
public class Rule5Orchestrator {
    private final Rule5 rule;
    private BrutoNettoInputs brutoNettoInputs;

    public Rule5Orchestrator(BrutoNettoInputs brutoNettoInputs, double tax1, double tax2Employee, double tax2SelfEmployed, double tax2public, double tax3Public, double tax4Employee, double tax4SelfEmployed, double tax4Public) {
        this.brutoNettoInputs = brutoNettoInputs;
        rule = new Rule5();
        rule.setTax1(tax1);
        rule.setTax2Employee(tax2Employee);
        rule.setTax2SelfEmployed(tax2SelfEmployed);
        rule.setTax2public(tax2public);
        rule.setTax3public(tax3Public);
        rule.setTax4Employee(tax4Employee);
        rule.setTax4SelfEmployed(tax4SelfEmployed);
        rule.setTax4public(tax4Public);

    }

    public void run(){
        rule.run();
    }

    public Double getTax(){
        return rule.getTax();
    }



}
