package com.lantushenko.projects.netcracker;

public class Hobby {
    String name;
    int hours;
    String text;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    Hobby(String name, int hours, String text) {
        this.name = name;
        this.hours = hours;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", hours=" + hours +
                ", text='" + text + '\'' +
                '}';
    }

    public static void main(String[] args) {

    }
}
