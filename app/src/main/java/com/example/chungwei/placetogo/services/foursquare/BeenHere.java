package com.example.chungwei.placetogo.services.foursquare;

public class BeenHere {
    private int count;

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private boolean marked;

    public boolean getMarked() {
        return this.marked;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }

    private int lastCheckinExpiredAt;

    public int getLastCheckinExpiredAt() {
        return this.lastCheckinExpiredAt;
    }

    public void setLastCheckinExpiredAt(int lastCheckinExpiredAt) {
        this.lastCheckinExpiredAt = lastCheckinExpiredAt;
    }
}
