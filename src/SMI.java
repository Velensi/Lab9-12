import java.util.Scanner;
public class SMI {
    private String name;
    private int count;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String nazv) {
        name = nazv;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int kol) {
        count = kol;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String mesto) {
        location = mesto;
    }
    public SMI(){
        name = "Без названия";
        count = 0;
        location = "Без места";
    }
    public SMI(String nazv, int kol, String mesto) {
        name = nazv;
        count = kol;
        location = mesto;
    }
}
