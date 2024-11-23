package Adapter;

public class USBAdapter implements ICable {
    private final SDCard sdCard;

    public USBAdapter(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    @Override
    public void connect() {
        sdCard.connect();
    }
}
