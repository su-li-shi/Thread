package com.ren;

/**
 * @author : renwenhao
 * @date : 14:08 2020/12/24
 */
/**
 * ren(Context)
 */
public class ren {

    private IncreaseFansStrategy strategy;

    public ren(IncreaseFansStrategy strategy){
        this.strategy = strategy;
    }
    // ren要发文章了(买水军了、送书了、写知乎引流了...)。
    // 具体执行哪个，看ren选哪个
    public void exec(){
        strategy.action();
    }
}
