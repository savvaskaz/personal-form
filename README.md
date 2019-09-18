#Project Name:personal-form

#Description:This is an application which help us to automate and complete a form in a website.In this project I used Java,Selenium and
built a project with Maven.My development enviroment is Eclipse IDE.

#Requirements:


#Instuctions:
First of all we must have installed Java and Eclipse IDE in our computer.Secondly download and install Apache Maven,
we can check if maven has installed n our pc on command prompt with command mvn -v.Then  download TestNG for Maven.In the next
step we create a new Maven project in Eclipse and open pom.xml file.On this file we add selenium dependency for maven.

		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>3.141.59</version>
		</dependency>
		
 We can find this dependency on this link  https://www.seleniumhq.org/download/maven.jsp. Also before we start development 
 of project we download JUnit from Eclipse Market place.Source code exists in upload classes in my uploaded file 
 personal-form on github.This application runs in google Chrome and is necessary to have download chrome drivers.
 HTML code for my form exists on file Personal_Form.html.Application runs with 3 ways:
 
 1.In Eclipse \personal-form\src\test\java\com\savvas\regression\MyTest.java-->Run As-->TestNG Test
 2.In Eclipsepersonal-form\src\test\java\com\savvas\regression\PersonalFormTest-->Run As-->JUnit Test
 3.In Selenium IDE(we must install selenium plugin for Chrome) and we build a new test.
 
 Installations required:
 -Java SDK version 12.0.2
 -Maven
 -Eclipse IDE
 -Google Chrome drivers
 -TestNG
 -Selenium dependency for pom.xml file
 -JUnit
 
 
    
