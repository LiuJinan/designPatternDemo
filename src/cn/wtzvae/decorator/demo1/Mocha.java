package cn.wtzvae.decorator.demo1;

/**
 * Created by LiuJinan on 2017/7/1.
 */
//装饰者：Mocha
public class Mocha implements CondimentDecorator {

    private Berverage berverage;

    public Mocha(Berverage berverage) {
        this.berverage = berverage;
    }

    @Override
    public String getDescription() {
        return berverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return berverage.cost() + 2;    //Mocha 2元
    }
}
