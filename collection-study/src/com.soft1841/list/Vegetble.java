package com.soft1841.list;

/**
 * Created by 田震 on 2019/3/20 7:14
 */
public class Vegetble implements Comparable<Vegetble> {
    private String name;
    private  Integer price;

    public Vegetble (String name, Integer price) {
        this.name = name;
        this.price = price;
    }


    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Integer getPrice () {
        return price;
    }

    public void setPrice (Integer price) {
        this.price = price;
    }

    @Override
    public int compareTo (Vegetble vegetble) {
        return this.getPrice()-vegetble.getPrice();
    }
}
