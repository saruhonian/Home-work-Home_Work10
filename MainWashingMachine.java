package ua.od.hillel.washing_machine;

import java.util.Calendar;

public class MainWashingMachine {
    public static void main(String[] args) {

        WashingMachine washingMachine = new WashingMachine();
        washingMachine.setName("Bosh");
        washingMachine.setMode(30, 50, 800);

        Calendar calendar = Calendar.getInstance();
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        int minutes = calendar.get(Calendar.MINUTE);
        int seconds = calendar.get(Calendar.SECOND);

        washingMachine.setCurrentTime(hours, minutes, seconds); // Устанавливаем текущее время на стиральной машине

        washingMachine.setDelay(00, 00, 30); // Устанавливаем отстрочку стирки

        System.out.println();
        washingMachine.printCurrentTime();
        washingMachine.isTimeStartWash();
        washingMachine.isTimeOffWash();



    }
}
