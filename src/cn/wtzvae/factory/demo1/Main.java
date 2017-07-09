package cn.wtzvae.factory.demo1;

/**
 * Created by LiuJinan on 2017/7/9.
 */
public class Main {

    public static void main(String[] args) {
        PizzaStore aPizzaStore = new APizzaStore();
        PizzaStore bPizzaStore = new BPizzaStore();

        Pizza aCheesePizza = aPizzaStore.orderPizza("clam");
        System.out.println("name : " + aCheesePizza.getName() + "\n");

        Pizza bClamPizza = bPizzaStore.orderPizza("cheese");
        System.out.println("name : "+ bClamPizza.getName() + "\n");
    }
}
