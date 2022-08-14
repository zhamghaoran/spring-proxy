package test;

import com.zhr.spring.proxy.Calculator;
import com.zhr.spring.proxy.CalculatorImpl;
import com.zhr.spring.proxy.CalculatorStaticProxy;
import com.zhr.spring.proxy.ProxyFactory;
import org.junit.Test;

public class test {
    /**
     * 动态代理有两种：
     * 1.JDK动态代理 要求必须要有接口，最终生成的代理类在com.sun.proxy包下，类名$proxy2
     * 2.cglib动态代理,最终生成的代理类会继承目标类并且和目标类在相同的包下
     *
     */
    @Test
    public void te() {
//        CalculatorStaticProxy calculatorStaticProxy = new CalculatorStaticProxy();
//        CalculatorImpl calculator = new CalculatorImpl();
//        calculatorStaticProxy.setTarget(calculator);
//        int add = calculatorStaticProxy.add(1, 2);
//        System.out.println(add);
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();  //不知道动态代理类的名字，但是我们知道动态代理类实现的接口的名字，所以我们使用向上转型的方式来定义这个动态代理类
        System.out.printf(String.valueOf(proxy.add(1, 0)));
    }
}
