Exercise for a multi project build
==================================

Add proper contents to the currently empty settings.gradle and build.gradle files

Subprojects
-----------

Include all subprojects of this multi project build in the settings.gradle file

Plugins
-------

Please apply the 'war' plugin for all subprojects

Repositories
------------

Use mavenCentral() in the repositories closure for all subprojects

Dependencies of the core project
--------------------------------

* com.example.model project
* 'log4j:log4j:1.2.17'
* 'org.slf4j:slf4j-log4j12:1.7.12'
* 'org.glassfish.jersey.containers:jersey-container-servlet:2.6'
* 'org.glassfish.jersey.media:jersey-media-json-jackson:2.6'
