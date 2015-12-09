package com.vogella.gradle.exampleplugin;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class MyTask extends DefaultTask {

    @TaskAction
    public void vogellaTask() {
        System.out.println("Hello from vogella task");
    }

}