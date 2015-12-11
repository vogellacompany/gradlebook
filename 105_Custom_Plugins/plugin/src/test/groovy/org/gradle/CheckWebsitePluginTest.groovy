package com.example

import org.junit.Test
import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project
import static org.junit.Assert.*

class CheckWebsitePluginTest {
    @Test
    public void greeterPluginAddsGreetingTaskToProject() {
        Project project = ProjectBuilder.builder().build()
        project.pluginManager.apply 'com.example.checkwebsite'

        assertTrue(project.tasks.checkSite instanceof CheckWebsite)
    }
}
