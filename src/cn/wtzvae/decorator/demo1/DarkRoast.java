package cn.wtzvae.decorator.demo1;

/**
 * Created by LiuJinan on 2017/7/1.
 */
//可被装饰的具体组件
public class DarkRoast implements Berverage {
    @Override
    public String getDescription() {
        return "DarkRoast ";
    }

    @Override
    public double cost() {
        return 9;
    }
}
