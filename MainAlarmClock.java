package ua.od.hillel.home_work;


import java.util.Calendar;

public class MainAlarmClock {


    public static void main(String[] args) throws InterruptedException {

        AlarmClock clock = new AlarmClock();
        clock.setName("Chinese Alarm Clock");

        Calendar calendar = Calendar.getInstance();
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        int minutes = calendar.get(Calendar.MINUTE);
        int seconds = calendar.get(Calendar.SECOND);

        clock.setCurrentTime(hours, minutes, seconds);

      //  clock.setCurrentTime(18, 15, 30);
        clock.setAlarmTime(13, 37, 00);

        clock.setHours(99);
        clock.printCurrentTime();

        if (clock.isAlarmTime()) {
            clock.fireAlarm();
        }
    }
}
