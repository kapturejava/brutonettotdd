package be.kapture.brutonetto.rule1;

import be.kapture.brutonetto.BrutoNettoInputs;

/**
 * Created by missika on 18/12/2017.
 */
public class Rule1Orchestrator {
    private final Rule1 rule1;
    private BrutoNettoInputs brutoNettoInputs;

    public Rule1Orchestrator(BrutoNettoInputs brutoNettoInputs) {
        this.brutoNettoInputs = brutoNettoInputs;
        rule1 = new Rule1();
    }

    public void run(){
        rule1.run();
    }

    public Double getTax(){
        return rule1.getTax();
    }


}
