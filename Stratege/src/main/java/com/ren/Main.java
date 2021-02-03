package com.ren;

/**
 * @author : renwenhao
 * @date : 14:16 2020/12/24
 */
public class Main {
    public static void main(String[] args) {
        ren ren = new ren(new WaterArmy());
        ren.exec();

        ren ren1 = new ren(new OriginalArticle());
        ren1.exec();
    }
}
