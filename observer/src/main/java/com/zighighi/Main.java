package com.zighighi;
import com.zighighi.push.ObservableImpl;
import com.zighighi.push.Observer;
import com.zighighi.push.ObserverImpl1;
import com.zighighi.push.ObserverImpl2;

public class Main {
    public static void main(String[] args) {
        ObservableImpl observable= new ObservableImpl();
        Observer o1= new ObserverImpl1();
        Observer o2= new ObserverImpl2();
        Observer o3= new ObserverImpl2();
        observable.subscribe(o1);
        observable.subscribe(o2);
        observable.subscribe(o3);
        observable.setState(54);
        observable.setState(33);
        observable.unsubscribe(o3);
        observable.subscribe( o ->
            System.out.println(" Anonymous observer ")
        );
        observable.setState(22);
    }
}