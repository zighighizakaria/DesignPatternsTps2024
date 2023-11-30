package com.zighighi.push;

public interface Observable{
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();
}
