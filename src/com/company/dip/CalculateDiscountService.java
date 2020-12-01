//package com.company.dip;
//
//import java.util.List;
//
///**
// * @author Jaedoo Lee
// */
//public class CalculateDiscountService {
//    private CustomerRepository customerRepository;
//    private RuleDiscounter ruleDiscounter;
//
//    public CalculateDiscountService(CustomerRepository customerRepository,
//                                    RuleDiscounter ruleDiscounter) {
//        this.customerRepository = customerRepository;
//        this.ruleDiscounter = ruleDiscounter;
//    }
//
//    public Money calculateDiscount(OrderLine orderLines, String customerId) {
//        Customer customer = findCustomer(customerId);
//        return ruleDiscounter.applyRules(customer, orderLines);
//    }
//
//    private Customer findCustomer(String customerId) {
//        Customer customer = customerRepository.findById(customerId);
//        if (customer == null) throw new NoCustomerException();
//        return customer;
//    }
//}
