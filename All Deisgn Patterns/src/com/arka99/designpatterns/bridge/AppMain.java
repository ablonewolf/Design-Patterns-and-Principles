package com.arka99.designpatterns.bridge;

public class AppMain {
    public static void main(String[] args) {
        RemoteController sharpRemote = new ACController(new SharpAC());
        RemoteController singerRemote = new ACController(new SingerAC());
        sharpRemote.switchOn();
        singerRemote.switchOn();
        sharpRemote.switchOff();
        singerRemote.switchOff();
    }
}
