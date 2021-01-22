package ClassInstance;

import java.util.concurrent.TimeUnit;

public class Clock {
    private int days;
    private int hours;
    private int minutes;
    private int seconds;
    public long currentMil = System.currentTimeMillis();

    public Clock(int days, int hours, int minutes, int seconds){
        UpdateTimeManual(days,hours,minutes,seconds);
    }

    public String toString(){
        return String.format("Days: %d\nHours: %d\nMinutes: %d\nSeconds: %d",days, hours, minutes, seconds);
    }

    public void UpdateTimeManual(int days, int hours, int minutes, int seconds){
        if(days < 0 || hours < 0 || minutes < 0 || seconds < 0){
//            throw Exception;
        }
        this.days += days;
        this.hours += hours;
        this.minutes += minutes;
        this.seconds += seconds;

    }

    public int timePassed(Clock a){
        return (a.seconds + a.days * 86400 + a.hours * 3600 + a.minutes * 60) - (this.seconds + this.days * 86400 + this.hours * 3600 + this.minutes * 60);
    }

    public void updateTime(){
        int timeDifference = (int) (System.currentTimeMillis() - currentMil);
        timeDifference = timeDifference / 1000;
        System.out.println(currentMil);
        System.out.println(System.currentTimeMillis());
        days += timeDifference / 86400;
        hours += (timeDifference - days * 86400) / 3600;
        minutes += (timeDifference - (days * 86400 + hours * 3600)) / 60;
        seconds += (timeDifference - (days * 86400 + hours * 3600 + minutes * 60));

    }

    public int getDays(){ return this.days; }

    public int getHours(){ return this.hours; }

    public int getMinutes(){ return this.minutes; }

    public int getSeconds(){ return this.seconds; }

}
