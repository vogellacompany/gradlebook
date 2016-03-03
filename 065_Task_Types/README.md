Task Types
==========

1. Specify a certain version for the **Wrapper** task type
  * Tip: The property for this is called 'gradleVersion' 
2. Use the **Copy** task type for copying a file
  * Tip: The copy task has a from and an into method
         These methods expect a path or file reference
3. Create a custom GradleTutorialFeedback groovy class in the buildSrc directory with a feedback property, which will be printed to the system output
  * → buildSrc/src/main/groovy/com/example/GradleTutorialFeedback.groovy
