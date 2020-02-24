package com.zeroten.common.util.test.fanxingAndenum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ZhnagZifan on 2020/2/24
 */
public class demoFanXing {
    public static void main(String[] args) {
        //加了泛型，当前集合只能添加泛型规定的类型
        List<A> list1 = new ArrayList<A>();
        list1.add(new B());

        List<C> list2 = new ArrayList<C>();
        list2.add(new D());
        C c = list2.get(0);//多态，父类声明，指向子类对象
        if (c instanceof D) {
            D d = (D)c;
        }

        testExtends(new ArrayList<Double>());
        testSuper(new ArrayList<Number>());
    }
    //泛型边界，往上，往下都行(使用泛型实参)
    public static void testExtends(List<? extends Number> list){

    }
    // super定义了下限，extends定义了上限
    public static void testSuper(List<? super Integer> list){

    }

}
//实际开发中，不要这么去做，你的项目经理会不高兴
interface A {}
class B implements A{}
abstract class C {}
class D extends C{}
// 泛型接口
interface MyMap<P,E>{
    public void put(P p, E e);
    public E get(P p);
}
//泛型类
class MyHashMap<P,E> implements MyMap<P,E>{
    private Map m = new HashMap();
    @Override
    //这里是在申明泛型（形参）
    public void put(P p, E e) {//这个不是泛型方法，只是把泛型作为参数
        // TODO Auto-generated method stub
        m.put(p, e);
    }
    @Override
    public E get(P p) {
        // TODO Auto-generated method stub
        return (E)m.get(p);
    }
}
class Demo<T>{
    public static void main(String[] args) {
        Demo<String> demo = new Demo<String>();
        String b = demo.change("1","2");
        System.out.println(b);
    }
    public  <A> A change(T t, A a) {
        return a;
    }
}