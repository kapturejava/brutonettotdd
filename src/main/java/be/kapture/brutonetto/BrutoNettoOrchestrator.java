package be.kapture.brutonetto;

import be.kapture.brutonetto.rule1.Rule1Orchestrator;
import be.kapture.brutonetto.rule2.Rule2Orchestrator;
import be.kapture.brutonetto.rule3.Rule3Orchestrator;
import be.kapture.brutonetto.rule4.Rule4Orchestrator;
import be.kapture.brutonetto.rule5.Rule5Orchestrator;

/**
 * Created by missika on 18/12/2017.
 */
public class BrutoNettoOrchestrator {
    private BrutoNettoInputs brutoNettoInputs;
    private Double lastTax;

    public BrutoNettoOrchestrator(BrutoNettoInputs brutoNettoInputs) {
        this.brutoNettoInputs = brutoNettoInputs;
    }

    public void run(){
        Rule1Orchestrator rule1Orchestrator = new Rule1Orchestrator(brutoNettoInputs);
        rule1Orchestrator.run();
        Double rule1Tax = rule1Orchestrator.getTax();

        Rule2Orchestrator rule2Orchestrator = new Rule2Orchestrator(brutoNettoInputs, rule1Tax);
        rule1Orchestrator.run();
        Double rule2EmployeeTax = rule2Orchestrator.getEmployeeTax();
        Double rule2SelfEmployedTax = rule2Orchestrator.getSelfEmployedTax();
        Double rule2PublicRightTax = rule2Orchestrator.getpublicRightTax();

        Rule3Orchestrator rule3Orchestrator = new Rule3Orchestrator(brutoNettoInputs, rule1Tax, rule2EmployeeTax, rule2SelfEmployedTax, rule2PublicRightTax);
        rule3Orchestrator.run();
        Double rule3PublicRightTax = rule3Orchestrator.getTax();

        Rule4Orchestrator rule4Orchestrator = new Rule4Orchestrator(brutoNettoInputs, rule1Tax, rule2EmployeeTax, rule2SelfEmployedTax, rule2PublicRightTax, rule3PublicRightTax);
        rule4Orchestrator.run();
        Double rule4EmployeeTax = rule4Orchestrator.getEmployeeTax();
        Double rule4SelfEmployedTax = rule4Orchestrator.getSelfEmployedTax();
        Double rule4PublicRightTax = rule4Orchestrator.getpublicRightTax();

        Rule5Orchestrator rule5Orchestrator = new Rule5Orchestrator(brutoNettoInputs, rule1Tax, rule2EmployeeTax, rule2SelfEmployedTax, rule2PublicRightTax, rule3PublicRightTax, rule4EmployeeTax, rule4SelfEmployedTax, rule4PublicRightTax);
        rule4Orchestrator.run();

        lastTax = rule5Orchestrator.getTax();
    }

    public Double getLastTax() {
        return lastTax;
    }
}
