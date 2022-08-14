package com.zhr.spring.proxy;

public class CalculatorStaticProxy implements Calculator{
    private CalculatorImpl target;

    public void setTarget(CalculatorImpl target) {
        this.target = target;
    }

    @Override
    public int add(int i, int j) {
        System.out.println("日志 方法名:add 参数:" + i+ " " + j);
        int res = target.add(i,j);
        System.out.println("日志，方法:add,结果:" + res);
        return res;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("日志 方法名:sub 参数:" + i+ " " + j);
        int res = target.sub(i,j);
        System.out.println("日志，方法:sub,结果:" + res);
        return res;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("日志 方法名:mul 参数:" + i+ " " + j);
        int res = target.mul(i,j);
        System.out.println("日志，方法:mul,结果:" + res);
        return res;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("日志 方法名:div 参数:" + i+ " " + j);
        int res = target.div(i,j);
        System.out.println("日志，方法:div ,结果:" + res);
        return res;
    }
}
