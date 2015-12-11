package com.example

import org.gradle.api.Project
import org.gradle.api.Plugin

class CheckWebsitePlugin implements Plugin<Project> {
    void apply(Project target) {
        target.task('checkSite', type: CheckWebsite)
    }
}
