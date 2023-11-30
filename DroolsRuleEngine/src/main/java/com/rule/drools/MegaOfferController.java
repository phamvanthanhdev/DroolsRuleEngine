package com.rule.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MegaOfferController {
    //@Autowired
    //private KieSession session;

    @Autowired
    private KieContainer kieContainer;

    @PostMapping("/order")
    public Order orderNow(@RequestBody Order order) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(order);
        int number = 400;
        kieSession.insert(number);
        kieSession.fireAllRules();
        return order;
    }

    @PostMapping("/smartphone")
    public VirtualSmartPhone smartphoneConvert(@RequestBody Customer customer) {
        KieSession kieSession = kieContainer.newKieSession();

        VirtualSmartPhone smartPhone = new VirtualSmartPhone();
        kieSession.setGlobal("virtualObject", smartPhone);

        kieSession.insert(customer);
        kieSession.fireAllRules();
        kieSession.dispose();

        return smartPhone;

    }

}
