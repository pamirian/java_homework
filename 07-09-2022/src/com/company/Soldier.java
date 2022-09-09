package com.company;


class Soldier implements Comparable<Soldier> {
    private final Integer height;

    public Soldier(Integer height) {
        this.height = height;
    }

    public Integer getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return  "height=" + height;
    }

    @Override
    public int compareTo(Soldier o) {
        return -1 * (this.getHeight()-o.getHeight());
    }
}
