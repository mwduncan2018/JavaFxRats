# JavaFxRats
## Eclipse Setup for Java FX
#### 1. Open a new workspace
#### 2. Create a basic Java project
#### 3. In the File menu, click Window -> Preferences -> Java -> Installed JREs -> Select jdk1.8.0_2...
#### 4. Right-click the project name and click Properties
#### 4a) Java Compiler -> Compiler compliance level -> select 1.8
#### 4b) Java Build Path -> Libraries -> Remove All
#### 4c) Java Build Path -> Libraries -> Add a Library -> User Libraries -> New -> Provide a name -> Add External JARs -> C:\Program Files (x86)\Java\jre1.8.0_24\lib\jfxswt.jar
#### 4d) Java Build Path -> Libraries -> Add a Library -> JRE System Library -> Workspace default JRE (jdk1.8.0_271)
#### 5. Add Access Rule -> Right-click the project name and click Properties -> Java Build Path -> Libarries -> Expand the library -> Double-click 'Access rules: No rules defined' -> Add access rule javafx/**
#### Additional Reources:
##### https://www.youtube.com/watch?v=ejx3VxuIc8w&t=235s
##### https://ssaurel.medium.com/create-your-first-javafx-8-application-with-eclipse-9f77375a24b3
##### https://openjfx.io/openjfx-docs/#install-java
