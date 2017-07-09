package cn.wtzvae.factory.demo1;

/**
 * Created by LiuJinan on 2017/7/9.
 */
public class APizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ACheesePizza();
        } else if (type.equals("clam")) {
            return new AClamPizza();
        }
        return null;
    }
}
