package cn.wtzvae.decorator.demo1;

/**
 * Created by LiuJinan on 2017/7/1.
 */
public class Main {

    public static void main(String[] args) {

        //1.买一杯加了奶盖的混合咖啡
        Berverage houseBlend = new HouseBlend();
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " " + houseBlend.cost());

        //2.买一杯加了摩卡和豆浆的深度烘焙
        Berverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Soy(darkRoast);
        System.out.println(darkRoast.getDescription() + " "+darkRoast.cost());
    }
}
