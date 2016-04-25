package ua.od.hillel.lamp;

public class Lamp {
    String name;

    int battery;

    public Lamp() {
        name = "Default Mode";
        battery = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLight(String light) {
        switch (light) {
            case "whiteLight":
                battery++;
                System.out.println("Light is " + light + " and " + battery + " battery.");
                break;
            case "redLight":
                battery = battery + 2;
                System.out.println("Light is " + light + " and " + battery + " battery.");
                break;
            case "flickeringLight":
                battery = battery + 3;
                System.out.println("Light is " + light + " and " + battery + " battery.");
                break;
            case "offLight":
                battery = 0;
                System.out.println("Light is " + light + " and " + battery + " battery.");
                break;
        }
    }
}
