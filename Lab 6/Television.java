package application;

public class Television {
    private final String MANUFACTURER;
    private final int SCREEN_SIZE;
    private boolean powerOn;
    private int channel;
    private int volume;
    
    public Television(String brand, int size) {
        MANUFACTURER = brand;
        SCREEN_SIZE = size;
        powerOn = false;
        channel = 2;
        volume = 20;
    }
    
    public void power() {
        powerOn = !powerOn;
    }
    
    public void setChannel(int station) {
        channel = station;
    }
    
    public void increaseVolume() {
        volume++;
    }
    
    public void decreaseVolume() {
        volume--;
    }
    
    public int getChannel() {
        return channel;
    }
    
    public int getVolume() {
        return volume;
    }
    
    public String getManufacturer() {
        return MANUFACTURER;
    }
    
    public int getScreenSize() {
        return SCREEN_SIZE;
    }
}
