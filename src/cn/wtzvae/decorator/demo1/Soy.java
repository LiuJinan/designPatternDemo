package cn.wtzvae.decorator.demo1;

/**
 * Created by LiuJinan on 2017/7/1.
 */
//装饰者：豆浆
public class Soy implements CondimentDecorator {

    private Berverage berverage;

    public Soy(Berverage berverage) {
        this.berverage = berverage;
    }

    @Override
    public String getDescription() {
        return berverage.getDescription() + ", soy";
    }

    @Override
    public double cost() {
        return berverage.cost() + 1;    //豆浆 1元
    }
}
