package com.zighighi.adapter;

import com.zighighi.Hdmi;
import com.zighighi.TV;
import com.zighighi.Vga;

public class HdmiVgaAdapterH extends TV implements Vga{
    private Hdmi hdmi;
    @Override
    public void print(String message) {
        System.out.println("--------Adapter-------");
        byte[] data=message.getBytes();
        hdmi.view(data);
        System.out.println("--------Adapter-------");
    }


}
