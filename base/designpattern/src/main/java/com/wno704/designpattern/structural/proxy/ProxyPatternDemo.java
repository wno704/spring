package com.wno704.designpattern.structural.proxy;

import com.wno704.designpattern.structural.proxy.image.Image;
import com.wno704.designpattern.structural.proxy.image.impl.ProxyImage;

public class ProxyPatternDemo {

    public static void main(String[] args){
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
