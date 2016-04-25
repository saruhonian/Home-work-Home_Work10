package ua.od.hillel.washing_machine;


public class WashingMachine {
    String name;

    int temp;
    int time;
    int speedSpin;

    int hours;
    int minutes;
    int seconds;

    int hoursDelay;
    int minutesDelay;
    int secondsDelay;

    public void setName(String name) {
        this.name = name;
        System.out.println("Name washing machine is: " + name);
    }

    public void setMode(int temp, int time, int speedSpin) { // Установка режима стирки
        this.temp = temp;           //Температура стирки
        this.time = time;           //Время стирки
        this.speedSpin = speedSpin; //Скорость вращения
        System.out.println("Mode wash is: " + temp + "C*; " + time + "min; " + speedSpin + "rpm.");
    }

    public void setCurrentTime(int hours, int minutes, int seconds) {   //Установка текущего времени на стиральной машине
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setDelay(int hoursDelay, int minutesDelay, int secondsDelay) {    //Время отстрочки стирки
        this.hoursDelay = hoursDelay;
        this.minutesDelay = minutesDelay;
        this.secondsDelay = secondsDelay;
    }

    public void printCurrentTime() {
        System.out.println("Current time: " + hours + ":" + minutes + ":" + seconds);
    }

    public void isTimeStartWash() {
        int h = hours + hoursDelay;
        int m = minutes + minutesDelay;
        int s = seconds + secondsDelay;
        System.out.println("Time start wash in: " + h + ":" + m + ":" + s);
    }

    public void isTimeOffWash() {
        int offH = hours + hoursDelay;
        int offM = minutes + time + minutesDelay;
        if (offM > 60) {
            offM = (minutes + time + minutesDelay) - 60;
            offH++;
        }
        int offS = seconds + secondsDelay;
        if (offS > 60) {
            offS = (seconds + secondsDelay) - 60;
            offM++;
        }
        System.out.println("Time off wash in: " + offH + ":" + offM + ":" + offS);

    }

}
