# JavaFxRats
## Eclipse Setup for Java FX
### 1. Open a new workspace
### 2. Create a basic Java project
### 3. In the File menu, click Window -> Preferences -> Java -> Installed JREs -> Select jdk1.8.0_2...
### 4. Right-click the project name and click Properties
### 4. a) Java Compiler -> Compiler compliance level -> select 1.8
### 4. b) Java Build Path -> Libraries -> Remove All
### 4. c) Java Build Path -> Libraries -> Add a Library -> User Libraries -> New -> Provide a name -> Add External JARs -> C:\Program Files (x86)\Java\jre1.8.0_24\lib\jfxswt.jar
### 4. d) Java Build Path -> Libraries -> Add a Library -> JRE System Library -> Workspace default JRE (jdk1.8.0_271)
### 5. Add Access Rule -> Right-click the project name and click Properties -> Java Build Path -> Libarries -> Expand the library -> Double-click 'Access rules: No rules defined' -> Add access rule javafx/**
### 6. Install "e(fx)clipse 3.6.0" from the Eclipse Marketplace
## Additional Reources:
https://www.youtube.com/watch?v=ejx3VxuIc8w&t=235s - 
https://ssaurel.medium.com/create-your-first-javafx-8-application-with-eclipse-9f77375a24b3 - 
https://openjfx.io/openjfx-docs/#install-java
## Test Automation Info
https://www.youtube.com/watch?v=PaB0t8NP3Oc - 
https://www.youtube.com/watch?v=NG03nNpSmgU - 
https://medium.com/information-and-technology/test-driven-development-in-javafx-with-testfx-66a84cd561e0 - 
https://marathontesting.com/marathonite/testing-javafx-applications/ - 
https://sites.google.com/a/athaydes.com/renato-athaydes/posts/twosimpletoolstoletyoutestyourswingjavafxapplicationseasily - 
https://support.smartbear.com/testcomplete/docs/app-testing/desktop/java-fx/index.html
