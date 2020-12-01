//package com.company.dip;
//
///**
// * @author Jaedoo Lee
// */
//public class DroolsRuleDiscounter implements RuleDiscounter {
//
//    private KieContainer kContainer;
//
//    public DroolsRuleDiscounter() {
//        KieContainer ks = KieServices.Factory.get();
//        kContainer = ks.getKieClasspathContainer();
//    }
//
//    @Override
//    public Money applyRules(Customer customer, List<OrderLine> orderLines) {
//        KieSession kSession = kContainer.newKieSession("discountSession");
//        try {
//            //...
//            kSession.fireAllRules();
//        } finally {
//            kSession.dispose();
//        }
//        return money.toImmutableMoney();
//    }
//}
