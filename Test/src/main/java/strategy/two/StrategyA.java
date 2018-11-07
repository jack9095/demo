package strategy.two;

import strategy.one.Strategy;

/**
 * 定义具体的策略角色：每个节日具体的促销活动
 *
 * 为春节准备的促销活动A
 */
public class StrategyA extends Strategy{
    public void show() {
        System.out.println("为春节准备的促销活动A");
    }
}