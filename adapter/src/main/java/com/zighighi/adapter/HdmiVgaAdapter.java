package com.zighighi.adapter;

import com.zighighi.Hdmi;
import com.zighighi.Vga;

public class HdmiVgaAdapter implements Vga {
    private Hdmi hdmi;
    @Override
    public void print(String message) {
        System.out.println("--------Adapter-------");
        byte[] data=message.getBytes();
        hdmi.view(data);
        System.out.println("--------Adapter-------");
    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
