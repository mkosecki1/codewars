package com.codewars.kyu8.SwapValues;

public class Swapper {
    public Object[] arguments;

    public Swapper(final Object[] args){
        arguments=args;
    }

    public void swapValues() {
        Object[] args = new Object[]{arguments[0],arguments[1]};
        Object temp = args[0];
        args[0] = args[1];
        args[1] = temp;
    }
}
