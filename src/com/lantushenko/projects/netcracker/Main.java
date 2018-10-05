package com.lantushenko.projects.netcracker;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hobby hobby = new Hobby ("Паять", 3, "мне нравится запах канифоли");
        System.out.println("Мое хобби состоит в том что я люблю: "+hobby.name);
        System.out.println("Для этого я выделяю "+hobby.hours+" часа");
        System.out.println("Я вибрал себе такое занятие потому-что "+hobby.text);


    }
}
