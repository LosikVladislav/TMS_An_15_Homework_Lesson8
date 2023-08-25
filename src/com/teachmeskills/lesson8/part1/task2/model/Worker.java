package com.teachmeskills.lesson8.part1.task2.model;

public class Worker implements IAllocatorOfPosts {
    private String post = "worker";

    @Override
    public void getPost() {
        System.out.println("my post is " + this.post);
    }
}
