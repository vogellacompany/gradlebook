package com.example

import spock.lang.Specification

import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project

class CheckWebsiteTaskTest extends Specification {

    public void checkWebsitePluginAddsCheckWebsiteTaskToProject() {
	setup:
        Project project = ProjectBuilder.builder().build()
	when:        
        def task = project.task('greeting', type: CheckWebsite)
	then:
        task instanceof CheckWebsite
    }
}
