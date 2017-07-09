package cn.wtzvae.factory.demo1;

/**
 * Created by LiuJinan on 2017/7/9.
 */
public class Pizza {

    protected String name;
    protected String dough;   //面粉类型
    protected String sauce;   //调味酱汁

    public void prepare() {
        //做pizza的一些事前准备
    }
    public void bake() {
        System.out.println("Bake for 25 minutes");
    }
    public void cut() {
        System.out.println("Cutting the pizza");
    }
    public void box() {
        System.out.println("Place pizza in box");
    }
    public String getName() {
        return name;
    }
}
