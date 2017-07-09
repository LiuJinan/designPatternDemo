package cn.wtzvae.factory.demo1;

/**
 * Created by LiuJinan on 2017/7/9.
 */
public class BCheesePizza extends Pizza {

    public BCheesePizza() {
        name = "B area style Cheese Pizza"; //B地区风味的Cheese Pizza
        dough = "xxx";
        sauce = "yyy";
    }
    @Override
    public void bake() {
        System.out.println("Bake for 20 minutes"); //烤20分钟
    }
}
