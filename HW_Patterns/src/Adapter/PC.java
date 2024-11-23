package Adapter;

public class PC {
    public void setConnection(ICable iCable) {
        iCable.connect();
        System.out.println("Подключено новое устройство");
    }
}
