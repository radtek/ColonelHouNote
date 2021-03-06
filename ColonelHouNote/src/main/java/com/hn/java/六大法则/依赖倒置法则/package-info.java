/**
 * 
 */
/**
 * @author Colonel.Hou
 * 
 * 核心：面向接口编程
 * 
 * 定义：高层模块不应该依赖于底层模块， 都应该依赖于抽象；抽象不应该依赖于细节， 细节应该依赖于抽象。
 * 
 * 问题由来：妈妈讲故事， 给了报纸就不会讲故事了。
 * 解决方案：将读物定义为抽象
 * 
 * 
 * EG:Swing组件中 布局管理器， 设置布局管理器时参数为父类，使用时可以随便传入子类，具体怎么实现布局
 *    开车的故事， 使用给一辆什么车都可以开
 *
 */
package com.hn.java.六大法则.依赖倒置法则;