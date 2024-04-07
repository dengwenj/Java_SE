package pm._oop2;

import java.util.Random;

public class Goods {
    // 商品的属性：商品 id，名字，价格，库存
    private String id;
    private String name;
    private double price;
    private int storage;

    public Goods() {

    }

    public Goods(String name, double price, int storage) {
        setId();
        this.name = name;
        this.price = price;
        this.storage = storage;
    }

    public void setId() {
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        this.id = num + "123321";
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setStorage(int storage) {
        this.storage= storage;
    }

    public int getStorage() {
        return this.storage;
    }
}
