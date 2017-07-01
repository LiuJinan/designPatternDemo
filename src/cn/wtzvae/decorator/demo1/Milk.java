package cn.wtzvae.decorator.demo1;

/**
 * Created by LiuJinan on 2017/7/1.
 */
//装饰者：牛奶
public class Milk implements CondimentDecorator {

    private Berverage berverage;

    public Milk(Berverage berverage) {
        this.berverage = berverage;
    }

    @Override
    public String getDescription() {
        return berverage.getDescription() + ", milk";
    }

    @Override
    public double cost() {
        return berverage.cost() + 1.5; //milk  1.5元
    }
}
