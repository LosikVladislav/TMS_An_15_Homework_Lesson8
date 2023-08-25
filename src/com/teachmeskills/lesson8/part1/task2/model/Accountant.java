package com.teachmeskills.lesson8.part1.task2.model;

public class Accountant implements IAllocatorOfPosts {
    private String post = "accountant";

    @Override
    public void getPost() {
        System.out.println("my post is " + this.post);
    }
}
