package com.luanpimenta.mymovie.calculations;
import com.luanpimenta.mymovie.models.Title;

public class TimeCalculator {
    private int totalMinutes;

    public int getTotalMinutes() {
        return totalMinutes / 60;
    }

    public void includes(Title title){
        totalMinutes += title.getDurationInMinutes();
    }
}