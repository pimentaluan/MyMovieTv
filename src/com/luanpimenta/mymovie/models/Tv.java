package com.luanpimenta.mymovie.models;

import com.luanpimenta.mymovie.calculations.Classification;

public class Tv extends Title {
    private int seasons;
    private int episodesForSeason;
    private int minutesForEpisode;
    private boolean isActive;

    public int getSeasons(){
        return seasons;
    }

    public int getEpisodesForSeason(){
        return episodesForSeason;
    }

    public int getMinutesForEpisode() {
        return minutesForEpisode;
    }

    public boolean getIsActive(){
        return isActive;
    }

    public void setSeasons(int seasons){
        this.seasons = seasons;
    }

    public void setEpisodesForSeason(int episodesForSeason){
        this.episodesForSeason = episodesForSeason;
    }

    public void setIsActive(boolean isActive){
        this.isActive = isActive;
    }

    public void setMinutesForEpisode(int minutesForEpisode) {
        this.minutesForEpisode = minutesForEpisode;
    }

    @Override
    public int getDurationInMinutes() {
        return seasons * episodesForSeason * minutesForEpisode;
    }
}
