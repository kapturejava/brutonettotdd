package be.kapture.brutonetto.rule2;

import be.kapture.brutonetto.BrutoNettoInputs;

/**
 * Created by missika on 18/12/2017.
 */
public class Rule2Orchestrator {
    private final Rule2 rule;
    private BrutoNettoInputs brutoNettoInputs;

    public Rule2Orchestrator(BrutoNettoInputs brutoNettoInputs, double tax1) {
        this.brutoNettoInputs = brutoNettoInputs;
        rule = new Rule2();
        rule.setPreviousTax(tax1);

    }

    public void run(){
        rule.run();
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
