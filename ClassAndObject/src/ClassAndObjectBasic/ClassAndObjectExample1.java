package ClassAndObjectBasic;

public class ClassAndObjectExample1 {
    public static void display(){
        Lamp l1 = new Lamp();
        Lamp l2 = new Lamp();

        l1.turnOn();
        l2.turnOff();
    }
}


class Lamp {                 // if we create a new class inside another class, the new class access modifiers must be default.
    boolean isOn;

    void turnOn() {
        isOn = true;
        System.out.println("Light on? " + isOn);

    }

    void turnOff() {
        isOn = false;
        System.out.println("Light on? " + isOn);
    }
}
