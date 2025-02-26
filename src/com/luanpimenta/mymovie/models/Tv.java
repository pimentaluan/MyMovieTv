package com.luanpimenta.mymovie.models;

import com.luanpimenta.mymovie.calculations.Classification;

public class Tv extends Title implements Classification{
    private int seasons;
    private int episodesForSeason;
    private int minutesForEpisode;
    private boolean isActive;

    public Tv(String name, int releaseYear) {
        super(name, releaseYear);
    }

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

    @Override
    public int getClassification() {
        return ((int) ratingAverage())/2;
    }

    @Override
    public String toString() {
        return "Série: %s (%s)".formatted(this.getName(), this.getReleaseYear());
    }
}
