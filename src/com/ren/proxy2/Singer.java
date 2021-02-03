package com.ren.proxy2;

public class Singer implements ISinger {
    @Override
    public void sing() {
        System.out.println("----------唱了一首歌----------");
    }
}
