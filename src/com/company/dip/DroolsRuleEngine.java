//package com.company.dip;
//
//import java.util.List;
//
///**
// * @author Jaedoo Lee
// */
//public class DroolsRuleEngine {
//    private KieContainer kContainer;
//
//    public DroolsRuleEngine() {
//        KieServices ks = KieServices.Factory.get();
//        KContainer = ks.getKieClasspathContainer();
//    }
//
//    public void evaluate(String sessionName, List<?> facts) {
//        KieSession kSession = KContainer.newKieSession(sessionName);
//        try {
//            facts.forEach(x -> kSession.insert(x));
//            kSession.fireAllRules();
//        } finally {
//            kSession.dispose();
//        }
//    }
//}
