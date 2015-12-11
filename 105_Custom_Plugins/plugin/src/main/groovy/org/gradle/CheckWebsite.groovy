package com.example

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

class CheckWebsite extends DefaultTask {

    String url = 'www.vogella.com'

    @TaskAction
    def checkWebsite() {
        // check the given website by using the url
	Document doc = Jsoup.connect(url).get();
	String title = doc.title();
	println title
	println url
    }
}

