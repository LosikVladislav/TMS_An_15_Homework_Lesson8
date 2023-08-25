package com.teachmeskills.lesson8.part1.task2;

import com.teachmeskills.lesson8.part1.task2.model.Accountant;
import com.teachmeskills.lesson8.part1.task2.model.Director;
import com.teachmeskills.lesson8.part1.task2.model.Worker;

public class Main {
    public static void main(String[] args) {

        Accountant accountant = new Accountant();
        Director director = new Director();
        Worker worker = new Worker();

        accountant.getPost();
        director.getPost();
        worker.getPost();
    }
}
