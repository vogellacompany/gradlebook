package com.example

import spock.lang.Specification

import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project

class CheckWebsitePluginTest extends Specification {

    public void checkWebsitePluginAddsCheckWebsiteTaskToProject() {
	setup:
        Project project = ProjectBuilder.builder().build()
	when:        
	project.pluginManager.apply 'com.example.checkwebsite'
	then:
        project.tasks.checkSite instanceof CheckWebsite
    }
}
