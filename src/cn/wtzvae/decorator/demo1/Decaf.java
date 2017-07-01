package cn.wtzvae.decorator.demo1;

/**
 * Created by LiuJinan on 2017/7/1.
 */
//可被装饰的具体组件
public class Decaf implements Berverage {
    @Override
    public String getDescription() {
        return "Decaf ";
    }

    @Override
    public double cost() {
        return 11;
    }
}
