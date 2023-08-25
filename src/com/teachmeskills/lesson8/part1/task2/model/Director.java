package com.teachmeskills.lesson8.part1.task2.model;

public class Director implements IAllocatorOfPosts {
    private String post = "director";

    @Override
    public void getPost() {
        System.out.println("my post is " + this.post);
    }
}
