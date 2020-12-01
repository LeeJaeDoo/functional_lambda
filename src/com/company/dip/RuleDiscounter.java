package com.company.dip;

import java.util.List;

/**
 * @author Jaedoo Lee
 */
public interface RuleDiscounter {
    public Money applyRules(Customer customer, List<OrderLine> orderLines);
}
