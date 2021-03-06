package com.hnanet.策略模式和工厂模式;

public interface EntStrategy {

    String getStuff();

    /**
     * // 根据不同的企业编号，我们能够快速找到对应的策略实现类去执行发送报文的操作
     */
    void send();
}