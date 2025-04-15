package com.Test1;

public class SingltonCls {

    private static SingltonCls singltonCls= null;

     private SingltonCls(){

     }

    public static SingltonCls getInstance()
    {
        if(singltonCls == null)
        {
            singltonCls= new SingltonCls();
        }
        return singltonCls;
    }
}


