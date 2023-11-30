package com.zighighi.pop;

public interface Observable{
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();
}
