package cn.wtzvae.decorator.demo1;

/**
 * Created by LiuJinan on 2017/7/1.
 */
//装饰者：奶盖
public class Whip implements CondimentDecorator {

    private Berverage berverage;

    public Whip(Berverage berverage) {
        this.berverage = berverage;
    }

    @Override
    public String getDescription() {
        return berverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return berverage.cost() + 3;    //Whip 3元
    }
}
