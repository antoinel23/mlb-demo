### Table of Contents
* [Introduction](#introduction)
* [How to run locally](#how-to-run-locally)
* [Requirements](#requirements)
* [Technologies](#technologies)
* [Modules](#modules)
* [Future enhancements](#future-enhancements)

## Introduction
This web application displays MLB teams, rosters and player statistics.
You can see the deployed application on this URL: [54.88.142.165:8080](http://54.88.142.165:8080/)

## How to run locally
#### Option 1 (the simplest version using JAR file):
**Note:** Java 11 or + needs to be installed on your computer to run the project using this JAR otherwise you can use option 2. You can download java [here](https://oracle.com/java/technologies/downloads/#java11). 
1. Clone the repo
2. Open a terminal in the repo folder and run the command:
```bash
java -jar demo.jar
```
3. Use your web browser to visit: localhost:8080

#### Option 2 (Using Eclipse IDE):
1. Clone the repo into your Eclipse workspace
2. Click File > Import
3. Under “Maven” select “Existing Maven Projects” and click “Next”
3. Click “Browse” and select the repo you just cloned 
4. Click “Finish”
5. Right-click the project and select "Run as → Maven build..."
6. Enter the Goals: “clean install” and click “Run”
7. Maven will start building the project. You can see the output in the Eclipse console.
8. Now, right-click on “DemoApplication.java” (under src/main/java/com.mlb.demo) and Select "Run As → Java Application"
9. Use your web browser to visit: localhost:8080
 
## Requirements
Here are the basic requirements that were asked for:
* A page/view listing all MLB teams
* A page/view for each team showing the players on their roster 
* A page/view for each player displaying some biographical information (name, age, height, weight, etc.) and tables of the player’s seasonal batting and/or pitching statistics

## Technologies
* SpringBoot: This Java Web-based Application uses SpringBoot 2.6.1
* Maven: Used for project build and dependency management
* Thymeleaf: This MVC application uses the Thymeleaf library to pass data from the controller to the view
* Bootstrap: The user interface is based on Bootstrap 5.1
* Amazon EC2: The deployed application is running on an AWS EC2 instance

## Modules
The data required for the application is retrieved directly at runtime from the MLB StatsAPI: [https://statsapi.mlb.com/](https://statsapi.mlb.com/)

The project currently has three modules which are each based on a specific endpoint of this API:
1. Team:
   * This module is used to get a list of all MLB teams
   * endpoint: /api/v1/teams?sportId=1
2. Roster: 
   * This module is used to get a list of all players from a specific team
   * endpoint: /api/v1/teams/{TEAM_ID}/roster
3. People:
   * This module is used to get information and statistics from a specific player
   * endpoint: /api/v1/people/{PLAYER_ID}?hydrate=stats(group=[hitting,pitching],type=[yearByYear])

The objects inside the directory “src/main/java/com/mlb/demo/entity” have been designed based on the JSON hierarchy returned by each endpoint of the MLB StatsAPI. To put it simply, the object Player inside the module Roster is different from the object People in the module People because of the JSON  structure I receive from the MLB API.

## Future enhancements
Here are some features that could be interesting to add to this project:
* A module to compare players’ statistics.
* Add the calculations of statistics that are not provided by the MLB API (ex: WAR).
* A module to view the All-Time Career Leader. Exemple: a list of the 10 players with the most career Home Runs using this endpoint: /api/v1/stats/leaders?statType=career&statGroup=hitting&limit=10&sportId=1&leaderGameTypes=R&leaderCategories=homeRuns
* In the page used to view information and statistics on a specific player, I currently use OPS and WHIP to draw a chart of the player evolution per season. It would be nice to add a way of dynamically choosing which statistics we want to add to this chart. 
* In the page used to view information and statistics on a specific player, it would be interesting to see the player league ranking of key statistics for the last season.
