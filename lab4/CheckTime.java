package ru.eltex.app.lab4;

import ru.eltex.app.lab2.Orders;

public class CheckTime extends ACheck {

    CheckTime(Orders orders){
        super(orders);
        this.pause = pause;
    }

    public void run(){
        while (fRun){
            getOrders().checkTime();
            try {
                Thread.sleep(pause);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
