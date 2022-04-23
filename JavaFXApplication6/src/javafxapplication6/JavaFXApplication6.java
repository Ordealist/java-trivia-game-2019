/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Timestamp;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import java.util.*;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

/**
 *
 * @author Austin Brown
 */
public class JavaFXApplication6 extends Application {
    
    //====String values for extraction of text from input.txt====
    String str1, str2, str3, str4, str5, str6;
    String str7, str8, str9, str10, str11, str12;
    String str13, str14, str15, str16, str17, str18;
    String str19, str20, str21, str22, str23, str24;
    String str25, str26, str27, str28, str29, str30;
    String str31, str32, str33, str34, str35, str36;
    String str37, str38, str39, str40, str41, str42;
    String str43, str44, str45, str46, str47, str48;
    String str49, str50, str51, str52, str53, str54;
    String str55, str56, str57, str58, str59, str60;
    //====end extraction value creation====
    
    //====timelines====
    Timeline timeline, timeline2, timeline3;
    Timeline timeline4, timeline5, timeline6;
    Timeline timeline7, timeline8, timeline9;
    Timeline timeline10;
    Integer startTime = 5;
    Integer countDown = startTime;
    //====end timelines creation====
    //====end timelines creation====

    //textfield string
    String playerName;
    //String playerTitle;
    //score variables
//    int maxChars = 20;
    public Integer q1Score, q2Score, q3Score, q4Score, q5Score;
    public Integer q6Score, q7Score, q8Score, q9Score, q10Score;
    public int score = 10;
    
    //public ArrayList<Integer> scoreArray;
    //next buttons
    Button nextButton1, nextButton2, nextButton3, nextButton4, nextButton5;
    Button nextButton6, nextButton7, nextButton8, nextButton9, nextButton10;
    Button returnHome;
    //question buttons
    Button wrongAnswer_1Q1, wrongAnswer_3Q1, wrongAnswer_2Q1, correctAnswer_Q1;
    Button wrongAnswer_1Q2, wrongAnswer_3Q2, wrongAnswer_2Q2, correctAnswer_Q2;
    Button wrongAnswer_1Q3, wrongAnswer_3Q3, wrongAnswer_2Q3, correctAnswer_Q3;
    Button wrongAnswer_1Q4, wrongAnswer_3Q4, wrongAnswer_2Q4, correctAnswer_Q4;
    Button wrongAnswer_1Q5, wrongAnswer_3Q5, wrongAnswer_2Q5, correctAnswer_Q5;
    Button wrongAnswer_1Q6, wrongAnswer_3Q6, wrongAnswer_2Q6, correctAnswer_Q6;
    Button wrongAnswer_1Q7, wrongAnswer_3Q7, wrongAnswer_2Q7, correctAnswer_Q7;
    Button wrongAnswer_1Q8, wrongAnswer_3Q8, wrongAnswer_2Q8, correctAnswer_Q8;
    Button wrongAnswer_1Q9, wrongAnswer_3Q9, wrongAnswer_2Q9, correctAnswer_Q9;
    Button wrongAnswer_1Q10, wrongAnswer_3Q10, wrongAnswer_2Q10, correctAnswer_Q10;
    
    //timestamps
    Timestamp timestampQ1 = new Timestamp(System.currentTimeMillis());
    Label q1TS;
    Label notifierL1; 
    Timestamp timestampQ2 = new Timestamp(System.currentTimeMillis());
    Label q2TS;
    Label notifierL2;
    Timestamp timestampQ3 = new Timestamp(System.currentTimeMillis());
    Label q3TS;
    Label notifierL3;
    Timestamp timestampQ4 = new Timestamp(System.currentTimeMillis());
    Label q4TS;
    Label notifierL4;
    Timestamp timestampQ5 = new Timestamp(System.currentTimeMillis());
    Label q5TS;
    Label notifierL5;
    Timestamp timestampQ6 = new Timestamp(System.currentTimeMillis());
    Label q6TS;
    Label notifierL6;
    Timestamp timestampQ7 = new Timestamp(System.currentTimeMillis());
    Label q7TS;
    Label notifierL7;
    Timestamp timestampQ8 = new Timestamp(System.currentTimeMillis());
    Label q8TS;
    Label notifierL8;
    Timestamp timestampQ9 = new Timestamp(System.currentTimeMillis());
    Label q9TS;
    Label notifierL9;
    Timestamp timestampQ10 = new Timestamp(System.currentTimeMillis());
    Label q10TS;
    Label notifierL10;
    
    //generate report button
    Button generateReport = new Button("Download report (to Downloads folder)");
    Label playerNameSpace1 = new Label("...");
    Label playerNameSpace2 = new Label("...");
    Label playerNameSpace3 = new Label("...");
    Label playerNameSpace4 = new Label("...");
    Label playerNameSpace5 = new Label("...");
    Label playerNameSpace6 = new Label("...");
    Label playerNameSpace7 = new Label("...");
    Label playerNameSpace8 = new Label("...");
    Label playerNameSpace9 = new Label("...");
    Label playerNameSpace10 = new Label("...");
    Label playerTitleSpace = new Label("...");
    //String playNameScore = "...";
    

    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        
        //====creating startScreen====
        StackPane newPane = new StackPane();
        
        HBox fiveBoxes = new HBox(30); //an HBox for 5 vboxes
        
        //vbox number 1
        VBox box1 = new VBox(5);
        Label titleofApp = new Label("Trivia Game 1.3");
        titleofApp.setTextFill(Color.DARKBLUE);
        titleofApp.setFont(Font.font("Tahoma", FontWeight.BOLD, FontPosture.REGULAR, 25));
        Label spaceBelow = new Label("");
        
        Label blankSpace = new Label("\n" + "※ Select a game ➞");
        blankSpace.setFont(Font.font("Tahoma", FontPosture.REGULAR, 16));
        Label stackDown1 = new Label("");
        Label stackDown2 = new Label("");
        Label stackDown3 = new Label("");
        Label stackDown4 = new Label("");
        Button aboutPage = new Button("About");
        
        //aboutPage.setPrefHeight(25);
        VBox.setVgrow(blankSpace, Priority.ALWAYS);
        VBox.setVgrow(stackDown1, Priority.ALWAYS);
        VBox.setVgrow(stackDown2, Priority.ALWAYS);
        VBox.setVgrow(stackDown3, Priority.ALWAYS);
        VBox.setVgrow(stackDown4, Priority.ALWAYS);
        VBox.setVgrow(aboutPage, Priority.ALWAYS);
        box1.getChildren().addAll(titleofApp, blankSpace, stackDown1, stackDown2, stackDown3, stackDown4, aboutPage);
        HBox.setHgrow(box1, Priority.ALWAYS);
        
        //vbox number 2
        VBox box2 = new VBox(5);
        Label blankSpace2 = new Label("\n" + "\n");
        Button vGame = new Button("Valencia Game");
        //vGame.setPrefWidth(25);
        VBox.setVgrow(vGame, Priority.ALWAYS);
        box2.getChildren().addAll(blankSpace2, vGame);
        HBox.setHgrow(box2, Priority.ALWAYS);
        
        //vbox number 3
        VBox box3 = new VBox(5);
        Label blankSpace3 = new Label("\n" + "\n");
        Button mGame = new Button("Meme Game");
        //mGame.setPrefWidth(25);
        VBox.setVgrow(mGame, Priority.ALWAYS);
        box3.getChildren().addAll(blankSpace3, mGame);
        HBox.setHgrow(box3, Priority.ALWAYS);
        
        //vbox number 4
        VBox box4 = new VBox(5);
        Label blankSpace4 = new Label("\n" + "\n");
        Button jpGame = new Button("日本ゲーム");
        //jpGame.setPrefWidth(25);
        VBox.setVgrow(jpGame, Priority.ALWAYS);
        box4.getChildren().addAll(blankSpace4, jpGame);
        HBox.setHgrow(box4, Priority.ALWAYS);
        
        //vbox number 5
        VBox box5 = new VBox(5);
        Label blankSpace5 = new Label("\n" + "\n");
        Button suomiGame = new Button("Suomipeli");
        //suomiGame.setPrefWidth(25);
        VBox.setVgrow(suomiGame, Priority.ALWAYS);
        box5.getChildren().addAll(blankSpace5, suomiGame);
        HBox.setHgrow(box5, Priority.ALWAYS);
        
        fiveBoxes.getChildren().addAll(box1, box2, box3, box4, box5);
        newPane.getChildren().add(fiveBoxes);
        Scene startScreen = new Scene(newPane, 1600, 600);
        
        FileInputStream getImg = new FileInputStream("C:\\Users\\Austin Brown\\Documents\\NetBeansProjects\\JavaFXApplication6\\testbg.png");
        BackgroundImage newBG = new BackgroundImage(new Image(getImg, 1600, 600, false, true), 
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        fiveBoxes.setBackground(new Background(newBG));
        //====END startScreen creation====
        
        //====creating aboutScene====
        Label blankTop = new Label("");
        Label infoAbout = new Label("This program was created as a final exam for COP2085 at Valencia.\n" 
                + "It contains four games: The first being part of the project specs, the remaining being\n" 
                + "for fun with memes that I find funny (If I finish them).\n" + 
                "\n" + "\n" + "Works Cited: \n" +
                "https://www.javacodegeeks.com/2012/07/javafx-20-layout-panes-hbox-and-vbox.html \n" +
                "https://stackoverflow.com/questions/5343689/java-reading-a-file-into-an-arraylist \n" +
                "Lectures and explanations from class \n" + 
                "My own brainstorming as well as previous classes \n" + 
                "https://tomasmikula.github.io/blog/2014/06/04/timers-in-javafx-and-reactfx.html \n" + 
                "https://asgteach.com/2011/10/javafx-animation-and-binding-simple-countdown-timer-2/ \n" +
                "https://www.java-forums.org/javafx/95592-problem-text-field-gettext.html \n" + 
                "Ideas based off of suggestions from my classmate Connor Green \n" + 
                "https://www.w3schools.com/java/java_files_create.asp \n" + 
                "https://stackoverflow.com/questions/9738146/javafx-how-to-set-scene-background-image \n" +
                "https://www.geeksforgeeks.org/javafx-background-class/");
        infoAbout.setFont(Font.font("Tahoma", FontPosture.REGULAR, 16));
        Button returnFromAbout = new Button("Back");
        VBox.setVgrow(infoAbout, Priority.ALWAYS);
        VBox.setVgrow(returnFromAbout, Priority.ALWAYS);
        
        BackgroundFill infoBG = new BackgroundFill(Color.BEIGE, CornerRadii.EMPTY, Insets.EMPTY);
        Background aboutBG = new Background(infoBG);
        
        VBox infoBox = new VBox(20);
        infoBox.getChildren().addAll(blankTop, infoAbout, returnFromAbout);
        infoBox.setBackground(aboutBG);
        Scene aboutScene = new Scene(infoBox, 1600, 600);
        
        mGame.setDisable(true);
        jpGame.setDisable(true);
        suomiGame.setDisable(true);
        //====END aboutScene creation====
        
        //====creating verifyScreen ==== 
        StackPane verifyPane = new StackPane();
        HBox verify2Boxes = new HBox(20);
        //box1
        Label question = new Label("Play Valencia game?\n" + "\n" + "In this trivia-based quiz game, there are 10 questions.\n" 
                + "You will have FIVE SECONDS to answer each question, failing\n"
                + "to answer or answering incorrectly will yield zero points.\n"
        + "Correct answers yield one point for each question.\n" 
                + "The next button for each question is disabled until an answer \n"
                + "is selected or when the timer reaches zero.");
        
        Label instructions = new Label("Enter a sufficient player name into the text field below to play ▼");
        TextField playername = new TextField();
        playername.setPrefWidth(300);
        Button clearField = new Button("Clear");
        Button startGameGo = new Button("Start Game");
        Button returnFromVerify = new Button("Back");
        VBox verifyBox = new VBox(20);
        VBox.setVgrow(instructions, Priority.ALWAYS);
        VBox.setVgrow(playername, Priority.ALWAYS);
        VBox.setVgrow(clearField, Priority.ALWAYS);
        VBox.setVgrow(startGameGo, Priority.ALWAYS);
        VBox.setVgrow(returnFromVerify, Priority.ALWAYS);
        verifyBox.getChildren().addAll(question, instructions, playername, clearField, startGameGo, returnFromVerify);
        
        //playerName = playername.getText();
        
        //box2
        Label blankspaceV = new Label("\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n");
        Label checkerTxtFld = new Label("...");
        VBox verifyBox2 = new VBox(20);
        VBox.setVgrow(checkerTxtFld, Priority.ALWAYS);
        verifyBox2.getChildren().addAll(blankspaceV, checkerTxtFld);
        
        verify2Boxes.getChildren().addAll(verifyBox, verifyBox2);
        verifyPane.getChildren().add(verify2Boxes);
               
        Scene verifyScreen = new Scene(verifyPane, 1600, 600);
        
                FileInputStream vcImg = new FileInputStream("C:\\Users\\Austin Brown\\Documents\\NetBeansProjects\\JavaFXApplication6\\verifyvc.png");
        BackgroundImage newerBG = new BackgroundImage(new Image(vcImg, 1600, 600, false, true), 
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        verify2Boxes.setBackground(new Background(newerBG));
        //====END verifyScreen====
        
        //====EXTRACTION FROM input.txt====
        Scanner si = new Scanner(new File("C:\\Users\\Austin Brown\\Documents\\NetBeansProjects\\JavaFXApplication6\\input.txt"));
        ArrayList<String> questionlistVG = new ArrayList<>();
        while (si.hasNext()) {
            questionlistVG.add(si.next());
        }
        si.close();
        //System.out.println(questionlistVG);
        
        //question 1 block
        str1 = questionlistVG.get(0); //obj1, 5.0
        str2 = questionlistVG.get(1); //obj2, 4
        str3 = questionlistVG.get(2); //Q1 CORRECT ANSWER, 9.0
        str4 = questionlistVG.get(3); //QI WRONG ANSWER 1, 9
        str5 = questionlistVG.get(4); //Q1 WRONG ANSWER 2, 5
        str6 = questionlistVG.get(5); //Q1 WRONG ANSWER 3, 25
        
        //question 2 block
        str7 = questionlistVG.get(6); //obj3, 5.0
        str8 = questionlistVG.get(7); //obj4, 4.0
        str9 = questionlistVG.get(8); //Q2 CORRECT ANSWER, 9
        str10 = questionlistVG.get(9); //Q2 WRONG ANSWER 1, 9.0
        str11 = questionlistVG.get(10); //Q2 WRONG ANSWER 2, 25
        str12 = questionlistVG.get(11); //Q2 WRONG ANSWER 3, 5
        
        //question 3 block
        str13 = questionlistVG.get(12); //obj5, Mickey
        str14 = questionlistVG.get(13); //obj6, Mouse
        str15 = questionlistVG.get(14); //Q3 CORRECT ANSWER, MickeyMouse
        str16 = questionlistVG.get(15); //Q3 WRONG ANSWER 1, null
        str17 = questionlistVG.get(16); //Q3 WRONG ANSWER 2, error
        str18 = questionlistVG.get(17); //Q3 WRONG ANSWER 3, MouseMickey
        
        //question 4 block
        str19 = questionlistVG.get(18); //obj7, c
        str20 = questionlistVG.get(19); //obj8, a
        str21 = questionlistVG.get(20); //Q4 CORRECT ANSWER, error
        str22 = questionlistVG.get(21); //Q4 WRONG ANSWER 1, ca
        str23 = questionlistVG.get(22); //Q4 WRONG ANSWER 2, 4
        str24 = questionlistVG.get(23); //Q4 WRONG ANSWER 3, 25
        
        //question 5 block
        str25 = questionlistVG.get(24); //obj9, 8
        str26 = questionlistVG.get(25); //obj10, 8
        str27 = questionlistVG.get(26); //Q5 CORRECT ANSWER, 16
        str28 = questionlistVG.get(27); //Q5 WRONG ANSWER 1, 15
        str29 = questionlistVG.get(28); //Q5 WRONG ANSWER 2, 14
        str30 = questionlistVG.get(29); //Q5 WRONG ANSWER 3, 11
        
        //question 6 block
        str31 = questionlistVG.get(30); //obj11, 4.5f
        str32 = questionlistVG.get(31); //obj12, 3.6f
        str33 = questionlistVG.get(32); //Q6 CORRECT ANSWER, 8.1f
        str34 = questionlistVG.get(33); //Q6 WRONG ANSWER 1, 2
        str35 = questionlistVG.get(34); //Q6 WRONG ANSWER 2, 8.1
        str36 = questionlistVG.get(35); //Q6 WRONG ANSWER 3, 6
        
        //question 7 block
        str37 = questionlistVG.get(36); //obj13, Java
        str38 = questionlistVG.get(37); //obj14, Program
        str39 = questionlistVG.get(38); //Q7 CORRECT ANSWER, JavaProgram
        str40 = questionlistVG.get(39); //Q7 WRONG ANSWER 1, javaprogram
        str41 = questionlistVG.get(40); //Q7 WRONG ANSWER 2, Javaprogram
        str42 = questionlistVG.get(41); //Q7 WRONG ANSWER 3, javaProgram
        
        //question 8 block
        str43 = questionlistVG.get(42); //obj15, 2.3f
        str44 = questionlistVG.get(43); //obj16, 4
        str45 = questionlistVG.get(44); //Q8 CORRECT ANSWER, 6.3f
        str46 = questionlistVG.get(45); //Q8 WRONG ANSWER 1, 6.3
        str47 = questionlistVG.get(46); //Q8 WRONG ANSWER 2, 4
        str48 = questionlistVG.get(47); //Q8 WRONG ANSWER 3, 2
        
        //question 9 block
        str49 = questionlistVG.get(48); //obj17, Mary
        str50 = questionlistVG.get(49); //obj18, Lamb
        str51 = questionlistVG.get(50); //Q9 CORRECT ANSWER, MaryLamb
        str52 = questionlistVG.get(51); //Q9 WRONG ANSWER 1, little
        str53 = questionlistVG.get(52); //Q9 WRONG ANSWER 2, lamb
        str54 = questionlistVG.get(53); //Q9 WRONG ANSWER 3, cool
        
        //question 10 block
        str55 = questionlistVG.get(54); //obj19, 6
        str56 = questionlistVG.get(55); //obj20, 5
        str57 = questionlistVG.get(56); //Q10 CORRECT ANSWER, 11
        str58 = questionlistVG.get(57); //Q10 WRONG ANSWER 1, 12
        str59 = questionlistVG.get(58); //Q10 WRONG ANSWER 2, 13
        str60 = questionlistVG.get(59); //Q10 WRONG ANSWER 3, 14
        //====END EXTRACTION====
        
        //====creating question 1====
        /*
        //question 1 block
        str1 = questionlistVG.get(0); //obj1, 5.0
        str2 = questionlistVG.get(1); //obj2, 4
        str3 = questionlistVG.get(2); //Q1 CORRECT ANSWER, 9.0
        str4 = questionlistVG.get(3); //QI WRONG ANSWER 1, 9
        str5 = questionlistVG.get(4); //Q1 WRONG ANSWER 2, 5
        str6 = questionlistVG.get(5); //Q1 WRONG ANSWER 3, 25
        */
        StackPane q1Stack = new StackPane();
        HBox q1Box = new HBox(40); //hbox with 5 HBox
        
        //box1, question number and timer go here
        VBox q1B1 = new VBox(40);
        Label questionNo1 = new Label("№ 1");
        Label q1Blank1 = new Label("\n" + "\n" + "\n" + "\n" + "\n" + "\n");
        Label timerQ1 = new Label("NaN");
        nextButton1 = new Button("Next");
        VBox.setVgrow(q1Blank1, Priority.ALWAYS);
        VBox.setVgrow(timerQ1, Priority.ALWAYS);
        q1B1.getChildren().addAll(questionNo1, q1Blank1, timerQ1, nextButton1);
        
        //box2, obj1 and option1 go here
        VBox q1B2 = new VBox(40);
        Label q1Blank2_5 = new Label("\n" + "\n");
        Label object1 = new Label(str1);
        Label q1Blank3 = new Label("\n" + "\n");
        wrongAnswer_1Q1 = new Button(str4);
        VBox.setVgrow(q1Blank2_5, Priority.ALWAYS);
        VBox.setVgrow(q1Blank3, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_1Q1, Priority.ALWAYS);
        q1B2.getChildren().addAll(q1Blank2_5, object1, q1Blank3, wrongAnswer_1Q1);
        //box3, qplus and option2 go here
        VBox q1B3 = new VBox(40);
        Label q1Blank3_5 = new Label("\n" + "\n");
        Label qPlus1 = new Label("+");
        Label q1Blank4 = new Label("\n" + "\n");
        wrongAnswer_3Q1 = new Button(str6);
        VBox.setVgrow(q1Blank3_5, Priority.ALWAYS);
        VBox.setVgrow(q1Blank4, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_3Q1, Priority.ALWAYS);
        q1B3.getChildren().addAll(q1Blank3_5, qPlus1, q1Blank4, wrongAnswer_3Q1);
        //box4, obj2 and option3 go here
        VBox q1B4 = new VBox(40);
        Label q1Blank4_5 = new Label("\n" + "\n");
        Label object2 = new Label(str2);
        Label q1Blank5 = new Label("\n" + "\n");
        wrongAnswer_2Q1 = new Button(str5);
        VBox.setVgrow(q1Blank4_5, Priority.ALWAYS);
        VBox.setVgrow(q1Blank5, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_2Q1, Priority.ALWAYS);
        q1B4.getChildren().addAll(q1Blank4_5, object2, q1Blank5, wrongAnswer_2Q1);
        //box5, option4 goes here
        VBox q1B5 = new VBox(40);
        Label emptySpace = new Label("");
        Label emptySpace2 = new Label("");
        Label q1Blank6 = new Label("\n" + "\n" + "\n");
        correctAnswer_Q1 = new Button(str3);
        VBox.setVgrow(emptySpace2, Priority.ALWAYS);
        VBox.setVgrow(q1Blank6, Priority.ALWAYS);
        VBox.setVgrow(correctAnswer_Q1, Priority.ALWAYS);
        q1B5.getChildren().addAll(emptySpace, emptySpace2, q1Blank6, correctAnswer_Q1);
        
        //box6, playername, timestamp, and that report generator go here | WHY WON'T IT WORK
        VBox q1B6 = new VBox(10);
        
        
        q1TS = new Label("...");
        notifierL1 = new Label("...");
        VBox.setVgrow(notifierL1, Priority.ALWAYS);
        //VBox.setVgrow(generateReport, Priority.ALWAYS);
        q1B6.getChildren().addAll(playerNameSpace1, notifierL1);
        
        q1Box.getChildren().addAll(q1B1, q1B2, q1B3, q1B4, q1B5, q1B6);
        q1Stack.getChildren().add(q1Box);
        
        Scene question_1 = new Scene(q1Stack, 1600, 600);
        
        //====end creation question 1====

        //====creating question 2====
        /*
        //question 2 block
        str7 = questionlistVG.get(6); //obj3, 5.0
        str8 = questionlistVG.get(7); //obj4, 4.0
        str9 = questionlistVG.get(8); //Q2 CORRECT ANSWER, 9
        str10 = questionlistVG.get(9); //Q2 WRONG ANSWER 1, 9.0
        str11 = questionlistVG.get(10); //Q2 WRONG ANSWER 2, 25
        str12 = questionlistVG.get(11); //Q2 WRONG ANSWER 3, 5
        */
        StackPane q2Stack = new StackPane();
        HBox q2Box = new HBox(40); //hbox with 5 HBox
        
        //box1, question number and timer go here
        VBox q2B1 = new VBox(40);
        Label questionNo2 = new Label("№ 2");
        Label q2Blank1 = new Label("\n" + "\n" + "\n" + "\n" + "\n" + "\n");
        Label timerQ2 = new Label("NaN");
        nextButton2 = new Button("Next");
        VBox.setVgrow(q2Blank1, Priority.ALWAYS);
        VBox.setVgrow(timerQ2, Priority.ALWAYS);
        q2B1.getChildren().addAll(questionNo2, q2Blank1, timerQ2, nextButton2);
        
        //box2, obj1 and option1 go here
        VBox q2B2 = new VBox(40);
        Label q2Blank2_5 = new Label("\n" + "\n");
        Label object3 = new Label(str7);
        Label q2Blank3 = new Label("\n" + "\n");
        wrongAnswer_1Q2 = new Button(str11);
        VBox.setVgrow(q2Blank2_5, Priority.ALWAYS);
        VBox.setVgrow(q2Blank3, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_1Q2, Priority.ALWAYS);
        q2B2.getChildren().addAll(q2Blank2_5, object3, q2Blank3, wrongAnswer_1Q2);
        
        //box3, qplus and option2 go here
        VBox q2B3 = new VBox(40);
        Label q2Blank3_5 = new Label("\n" + "\n");
        Label qPlus2 = new Label("+");
        Label q2Blank4 = new Label("\n" + "\n");
        wrongAnswer_3Q2 = new Button(str10);
        VBox.setVgrow(q2Blank3_5, Priority.ALWAYS);
        VBox.setVgrow(q2Blank4, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_3Q2, Priority.ALWAYS);
        q2B3.getChildren().addAll(q2Blank3_5, qPlus2, q2Blank4, wrongAnswer_3Q2);
        
        //box4, obj2 and option3 go here
        VBox q2B4 = new VBox(40);
        Label q2Blank4_5 = new Label("\n" + "\n");
        Label object4 = new Label(str8);
        Label q2Blank5 = new Label("\n" + "\n");
        wrongAnswer_2Q2 = new Button(str12);
        VBox.setVgrow(q1Blank4_5, Priority.ALWAYS);
        VBox.setVgrow(q1Blank5, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_2Q1, Priority.ALWAYS);
        q2B4.getChildren().addAll(q2Blank4_5, object4, q2Blank5, wrongAnswer_2Q2);
        
        //box5, option4 goes here
        VBox q2B5 = new VBox(40);
        Label emptySpace_2 = new Label("");
        Label emptySpace2_2 = new Label("");
        Label q2Blank6 = new Label("\n" + "\n" + "\n");
        correctAnswer_Q2 = new Button(str9);
        VBox.setVgrow(emptySpace2_2, Priority.ALWAYS);
        VBox.setVgrow(q2Blank6, Priority.ALWAYS);
        VBox.setVgrow(correctAnswer_Q2, Priority.ALWAYS);
        q2B5.getChildren().addAll(emptySpace_2, emptySpace2_2, q2Blank6, correctAnswer_Q2);
        
        //box6, playername, timestamp, and that report generator go here
        VBox q2B6 = new VBox(10);
        
        
        q2TS = new Label("...");
        notifierL2 = new Label("...");
        VBox.setVgrow(notifierL2, Priority.ALWAYS);
        //VBox.setVgrow(generateReport, Priority.ALWAYS);
        q2B6.getChildren().addAll(playerNameSpace2, notifierL2);
        
        q2Box.getChildren().addAll(q2B1, q2B2, q2B3, q2B4, q2B5, q2B6);
        q2Stack.getChildren().add(q2Box);
        
        Scene question_2 = new Scene(q2Stack, 1600, 600);
        
        //====end creation question 2====

        //====creating question 3====
        /*
        //question 3 block
        str13 = questionlistVG.get(12); //obj5, Mickey
        str14 = questionlistVG.get(13); //obj6, Mouse
        str15 = questionlistVG.get(14); //Q3 CORRECT ANSWER, MickeyMouse
        str16 = questionlistVG.get(15); //Q3 WRONG ANSWER 1, null
        str17 = questionlistVG.get(16); //Q3 WRONG ANSWER 2, error
        str18 = questionlistVG.get(17); //Q3 WRONG ANSWER 3, MouseMickey
        */
        StackPane q3Stack = new StackPane();
        HBox q3Box = new HBox(40); //hbox with 5 HBox
        
        //box1, question number and timer go here
        VBox q3B1 = new VBox(40);
        Label questionNo3 = new Label("№ 3");
        Label q3Blank1 = new Label("\n" + "\n" + "\n" + "\n" + "\n" + "\n");
        Label timerQ3 = new Label("NaN");
        nextButton3 = new Button("Next");
        VBox.setVgrow(q3Blank1, Priority.ALWAYS);
        VBox.setVgrow(timerQ3, Priority.ALWAYS);
        VBox.setVgrow(nextButton3, Priority.ALWAYS);
        q3B1.getChildren().addAll(questionNo3, q3Blank1, timerQ3, nextButton3);
        
        //box2, obj1 and option1 go here
        VBox q3B2 = new VBox(40);
        Label q3Blank2_5 = new Label("\n" + "\n");
        Label object5 = new Label(str13);
        Label q3Blank3 = new Label("\n" + "\n");
        wrongAnswer_1Q3 = new Button(str16);
        VBox.setVgrow(q3Blank2_5, Priority.ALWAYS);
        VBox.setVgrow(q3Blank3, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_1Q3, Priority.ALWAYS);
        q3B2.getChildren().addAll(q3Blank2_5, object5, q3Blank3, wrongAnswer_1Q3);
        
        //box3, qplus and option2 go here
        VBox q3B3 = new VBox(40);
        Label q3Blank3_5 = new Label("\n" + "\n");
        Label qPlus3 = new Label("+");
        Label q3Blank4 = new Label("\n" + "\n");
        wrongAnswer_3Q3 = new Button(str18);
        VBox.setVgrow(q3Blank3_5, Priority.ALWAYS);
        VBox.setVgrow(q3Blank4, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_3Q3, Priority.ALWAYS);
        q3B3.getChildren().addAll(q3Blank3_5, qPlus3, q3Blank4, wrongAnswer_3Q3);
        
        //box4, obj2 and option3 go here
        VBox q3B4 = new VBox(40);
        Label q3Blank4_5 = new Label("\n" + "\n");
        Label object6 = new Label(str14);
        Label q3Blank5 = new Label("\n" + "\n");
        wrongAnswer_2Q3 = new Button(str17);
        VBox.setVgrow(q3Blank4_5, Priority.ALWAYS);
        VBox.setVgrow(q3Blank5, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_2Q3, Priority.ALWAYS);
        q3B4.getChildren().addAll(q3Blank4_5, object6, q3Blank5, wrongAnswer_2Q3);
        
        //box5, option4 goes here
        VBox q3B5 = new VBox(40);
        Label emptySpace_3 = new Label("");
        Label emptySpace2_3 = new Label("");
        Label q3Blank6 = new Label("\n" + "\n" + "\n");
        correctAnswer_Q3 = new Button(str15);
        VBox.setVgrow(emptySpace2_3, Priority.ALWAYS);
        VBox.setVgrow(q3Blank6, Priority.ALWAYS);
        VBox.setVgrow(correctAnswer_Q3, Priority.ALWAYS);
        q3B5.getChildren().addAll(emptySpace_3, emptySpace2_3, q3Blank6, correctAnswer_Q3);
        
        //box6, playername, timestamp, and that report generator go here
        VBox q3B6 = new VBox(10);
        
        
        q3TS = new Label("...");
        notifierL3 = new Label("...");
        VBox.setVgrow(notifierL3, Priority.ALWAYS);
        //VBox.setVgrow(generateReport, Priority.ALWAYS);
        q3B6.getChildren().addAll(playerNameSpace3, notifierL3);
        
        q3Box.getChildren().addAll(q3B1, q3B2, q3B3, q3B4, q3B5, q3B6);
        q3Stack.getChildren().add(q3Box);
        
        Scene question_3 = new Scene(q3Stack, 1600, 600);
        //====end creation question 3====
        
        //====creating question 4====
        /*
        //question 4 block
        str19 = questionlistVG.get(18); //obj7, c
        str20 = questionlistVG.get(19); //obj8, a
        str21 = questionlistVG.get(20); //Q4 CORRECT ANSWER, error
        str22 = questionlistVG.get(21); //Q4 WRONG ANSWER 1, ca
        str23 = questionlistVG.get(22); //Q4 WRONG ANSWER 2, 4
        str24 = questionlistVG.get(23); //Q4 WRONG ANSWER 3, 25
        */
        StackPane q4Stack = new StackPane();
        HBox q4Box = new HBox(40); //hbox with 5 HBox
        
        //box1, question number and timer go here
        VBox q4B1 = new VBox(40);
        Label questionNo4 = new Label("№ 4");
        Label q4Blank1 = new Label("\n" + "\n" + "\n" + "\n" + "\n" + "\n");
        Label timerQ4 = new Label("NaN");
        nextButton4 = new Button("Next");
        VBox.setVgrow(q4Blank1, Priority.ALWAYS);
        VBox.setVgrow(timerQ4, Priority.ALWAYS);
        VBox.setVgrow(nextButton4, Priority.ALWAYS);
        q4B1.getChildren().addAll(questionNo4, q4Blank1, timerQ4, nextButton4);
        
                
        //box2, obj1 and option1 go here
        VBox q4B2 = new VBox(40);
        Label q4Blank2_5 = new Label("\n" + "\n");
        Label object7 = new Label(str19);
        Label q4Blank3 = new Label("\n" + "\n");
        wrongAnswer_1Q4 = new Button(str22);
        VBox.setVgrow(q4Blank2_5, Priority.ALWAYS);
        VBox.setVgrow(q4Blank3, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_1Q4, Priority.ALWAYS);
        q4B2.getChildren().addAll(q4Blank2_5, object7, q4Blank3, wrongAnswer_1Q4);
        
        //box3, qplus and option2 go here
        VBox q4B3 = new VBox(40);
        Label q4Blank3_5 = new Label("\n" + "\n");
        Label qPlus4 = new Label("+");
        Label q4Blank4 = new Label("\n" + "\n");
        wrongAnswer_3Q4 = new Button(str24);
        VBox.setVgrow(q4Blank3_5, Priority.ALWAYS);
        VBox.setVgrow(q4Blank4, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_3Q4, Priority.ALWAYS);
        q4B3.getChildren().addAll(q4Blank3_5, qPlus4, q4Blank4, wrongAnswer_3Q4);
        
        //box4, obj2 and option3 go here
        VBox q4B4 = new VBox(40);
        Label q4Blank4_5 = new Label("\n" + "\n");
        Label object8 = new Label(str20);
        Label q4Blank5 = new Label("\n" + "\n");
        wrongAnswer_2Q4 = new Button(str23);
        VBox.setVgrow(q4Blank4_5, Priority.ALWAYS);
        VBox.setVgrow(q4Blank5, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_2Q4, Priority.ALWAYS);
        q4B4.getChildren().addAll(q4Blank4_5, object8, q4Blank5, wrongAnswer_2Q4);
        
        //box5, option4 goes here
        VBox q4B5 = new VBox(40);
        Label emptySpace_4 = new Label("");
        Label emptySpace2_4 = new Label("");
        Label q4Blank6 = new Label("\n" + "\n" + "\n");
        correctAnswer_Q4 = new Button(str21);
        VBox.setVgrow(emptySpace2_4, Priority.ALWAYS);
        VBox.setVgrow(q4Blank6, Priority.ALWAYS);
        VBox.setVgrow(correctAnswer_Q4, Priority.ALWAYS);
        q4B5.getChildren().addAll(emptySpace_4, emptySpace2_4, q4Blank6, correctAnswer_Q4);
        
        //box6, playername, timestamp, and that report generator go here
        VBox q4B6 = new VBox(10);
        
        
        q4TS = new Label("...");
        notifierL4 = new Label("...");
        VBox.setVgrow(notifierL4, Priority.ALWAYS);
        //VBox.setVgrow(generateReport, Priority.ALWAYS);
        q4B6.getChildren().addAll(playerNameSpace4, notifierL4);
        
        q4Box.getChildren().addAll(q4B1, q4B2, q4B3, q4B4, q4B5, q4B6);
        q4Stack.getChildren().add(q4Box);
        
        Scene question_4 = new Scene(q4Stack, 1600, 600);
        //====end creation question 4====
        
        //====creating question 5====
        /*
        //question 5 block
        str25 = questionlistVG.get(24); //obj9, 8
        str26 = questionlistVG.get(25); //obj10, 8
        str27 = questionlistVG.get(26); //Q5 CORRECT ANSWER, 16
        str28 = questionlistVG.get(27); //Q5 WRONG ANSWER 1, 15
        str29 = questionlistVG.get(28); //Q5 WRONG ANSWER 2, 14
        str30 = questionlistVG.get(29); //Q5 WRONG ANSWER 3, 11
        */
        StackPane q5Stack = new StackPane();
        HBox q5Box = new HBox(40); //hbox with 5 HBox
        
        //box1, question number and timer go here
        VBox q5B1 = new VBox(40);
        Label questionNo5 = new Label("№ 5");
        Label q5Blank1 = new Label("\n" + "\n" + "\n" + "\n" + "\n" + "\n");
        Label timerQ5 = new Label("NaN");
        nextButton5 = new Button("Next");
        VBox.setVgrow(q5Blank1, Priority.ALWAYS);
        VBox.setVgrow(timerQ5, Priority.ALWAYS);
        VBox.setVgrow(nextButton5, Priority.ALWAYS);
        q5B1.getChildren().addAll(questionNo5, q5Blank1, timerQ5, nextButton5);
        
        //box2, obj1 and option1 go here
        VBox q5B2 = new VBox(40);
        Label q5Blank2_5 = new Label("\n" + "\n");
        Label object9 = new Label(str25);
        Label q5Blank3 = new Label("\n" + "\n");
        wrongAnswer_1Q5 = new Button(str28);
        VBox.setVgrow(q5Blank2_5, Priority.ALWAYS);
        VBox.setVgrow(q5Blank3, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_1Q5, Priority.ALWAYS);
        q5B2.getChildren().addAll(q5Blank2_5, object9, q5Blank3, wrongAnswer_1Q5);
        
        //box3, qplus and option2 go here
        VBox q5B3 = new VBox(40);
        Label q5Blank3_5 = new Label("\n" + "\n");
        Label qPlus5 = new Label("+");
        Label q5Blank4 = new Label("\n" + "\n");
        correctAnswer_Q5 = new Button(str27);
        VBox.setVgrow(q4Blank3_5, Priority.ALWAYS);
        VBox.setVgrow(q4Blank4, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_3Q4, Priority.ALWAYS);
        q5B3.getChildren().addAll(q5Blank3_5, qPlus5, q5Blank4, correctAnswer_Q5);
        
        //box4, obj2 and option3 go here
        VBox q5B4 = new VBox(40);
        Label q5Blank4_5 = new Label("\n" + "\n");
        Label object10 = new Label(str26);
        Label q5Blank5 = new Label("\n" + "\n");
        wrongAnswer_2Q5 = new Button(str30);
        VBox.setVgrow(q5Blank4_5, Priority.ALWAYS);
        VBox.setVgrow(q5Blank5, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_2Q5, Priority.ALWAYS);
        q5B4.getChildren().addAll(q5Blank4_5, object10, q5Blank5, wrongAnswer_2Q5);
        
        //box5, option4 goes here
        VBox q5B5 = new VBox(40);
        Label emptySpace_5 = new Label("");
        Label emptySpace2_5 = new Label("");
        Label q5Blank6 = new Label("\n" + "\n" + "\n");
        wrongAnswer_3Q5 = new Button(str29);
        VBox.setVgrow(emptySpace2_5, Priority.ALWAYS);
        VBox.setVgrow(q5Blank6, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_3Q5, Priority.ALWAYS);
        q5B5.getChildren().addAll(emptySpace_5, emptySpace2_5, q5Blank6, wrongAnswer_3Q5);
        
        //box6, playername, timestamp, and that report generator go here
        VBox q5B6 = new VBox(10);
        
        
        q5TS = new Label("...");
        notifierL5 = new Label("...");
        VBox.setVgrow(notifierL5, Priority.ALWAYS);
        //VBox.setVgrow(generateReport, Priority.ALWAYS);
        q5B6.getChildren().addAll(playerNameSpace5, notifierL5);
        
        q5Box.getChildren().addAll(q5B1, q5B2, q5B3, q5B4, q5B5, q5B6);
        q5Stack.getChildren().add(q5Box);
        
        Scene question_5 = new Scene(q5Stack, 1600, 600);
        //====end creation question 5====
        
        //====creating question 6====
        /*
        //question 6 block
        str31 = questionlistVG.get(30); //obj11, 4.5f
        str32 = questionlistVG.get(31); //obj12, 3.6f
        str33 = questionlistVG.get(32); //Q6 CORRECT ANSWER, 8.1f
        str34 = questionlistVG.get(33); //Q6 WRONG ANSWER 1, 2
        str35 = questionlistVG.get(34); //Q6 WRONG ANSWER 2, 8.1
        str36 = questionlistVG.get(35); //Q6 WRONG ANSWER 3, 6
        */
        StackPane q6Stack = new StackPane();
        HBox q6Box = new HBox(40); //hbox with 5 HBox
        
        //box1, question number and timer go here
        VBox q6B1 = new VBox(40);
        Label questionNo6 = new Label("№ 6");
        Label q6Blank1 = new Label("\n" + "\n" + "\n" + "\n" + "\n" + "\n");
        Label timerQ6 = new Label("NaN");
        nextButton6 = new Button("Next");
        VBox.setVgrow(q6Blank1, Priority.ALWAYS);
        VBox.setVgrow(timerQ6, Priority.ALWAYS);
        VBox.setVgrow(nextButton6, Priority.ALWAYS);
        q6B1.getChildren().addAll(questionNo6, q6Blank1, timerQ6, nextButton6);
        
        //box2, obj1 and option1 go here
        VBox q6B2 = new VBox(40);
        Label q6Blank2_5 = new Label("\n" + "\n");
        Label object11 = new Label(str31);
        Label q6Blank3 = new Label("\n" + "\n");
        wrongAnswer_1Q6 = new Button(str36);
        VBox.setVgrow(q6Blank2_5, Priority.ALWAYS);
        VBox.setVgrow(q6Blank3, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_1Q6, Priority.ALWAYS);
        q6B2.getChildren().addAll(q6Blank2_5, object11, q6Blank3, wrongAnswer_1Q6);
        
        //box3, qplus and option2 go here
        VBox q6B3 = new VBox(40);
        Label q6Blank3_5 = new Label("\n" + "\n");
        Label qPlus6 = new Label("+");
        Label q6Blank4 = new Label("\n" + "\n");
        correctAnswer_Q6 = new Button(str33);
        VBox.setVgrow(q6Blank3_5, Priority.ALWAYS);
        VBox.setVgrow(q6Blank4, Priority.ALWAYS);
        VBox.setVgrow(correctAnswer_Q6, Priority.ALWAYS);
        q6B3.getChildren().addAll(q6Blank3_5, qPlus6, q6Blank4, correctAnswer_Q6);
        
        //box4, obj2 and option3 go here
        VBox q6B4 = new VBox(40);
        Label q6Blank4_5 = new Label("\n" + "\n");
        Label object12 = new Label(str32);
        Label q6Blank5 = new Label("\n" + "\n");
        wrongAnswer_2Q6 = new Button(str35);
        VBox.setVgrow(q5Blank4_5, Priority.ALWAYS);
        VBox.setVgrow(q5Blank5, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_2Q5, Priority.ALWAYS);
        q6B4.getChildren().addAll(q6Blank4_5, object12, q6Blank5, wrongAnswer_2Q6);
        
        //box5, option4 goes here
        VBox q6B5 = new VBox(40);
        Label emptySpace_6 = new Label("");
        Label emptySpace2_6 = new Label("");
        Label q6Blank6 = new Label("\n" + "\n" + "\n");
        wrongAnswer_3Q6 = new Button(str34);
        VBox.setVgrow(emptySpace2_6, Priority.ALWAYS);
        VBox.setVgrow(q6Blank6, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_3Q6, Priority.ALWAYS);
        q6B5.getChildren().addAll(emptySpace_6, emptySpace2_6, q6Blank6, wrongAnswer_3Q6);
        
        //box6, playername, timestamp, and that report generator go here
        VBox q6B6 = new VBox(10);
        
        
        q6TS = new Label("...");
        notifierL6 = new Label("...");
        VBox.setVgrow(notifierL6, Priority.ALWAYS);
        //VBox.setVgrow(generateReport, Priority.ALWAYS);
        q6B6.getChildren().addAll(playerNameSpace6, notifierL6);
        
        q6Box.getChildren().addAll(q6B1, q6B2, q6B3, q6B4, q6B5, q6B6);
        q6Stack.getChildren().add(q6Box);
        
        Scene question_6 = new Scene(q6Stack, 1600, 600);
        //====end creation question 6====
        
        //====creating question 7====
        /*
        //question 7 block
        str37 = questionlistVG.get(36); //obj13, Java
        str38 = questionlistVG.get(37); //obj14, Program
        str39 = questionlistVG.get(38); //Q7 CORRECT ANSWER, JavaProgram
        str40 = questionlistVG.get(39); //Q7 WRONG ANSWER 1, javaprogram
        str41 = questionlistVG.get(40); //Q7 WRONG ANSWER 2, Javaprogram
        str42 = questionlistVG.get(41); //Q7 WRONG ANSWER 3, javaProgram
        */
        StackPane q7Stack = new StackPane();
        HBox q7Box = new HBox(40); //hbox with 5 HBox
        
        //box1, question number and timer go here
        VBox q7B1 = new VBox(40);
        Label questionNo7 = new Label("№ 7");
        Label q7Blank1 = new Label("\n" + "\n" + "\n" + "\n" + "\n" + "\n");
        Label timerQ7 = new Label("NaN");
        nextButton7 = new Button("Next");
        VBox.setVgrow(q7Blank1, Priority.ALWAYS);
        VBox.setVgrow(timerQ7, Priority.ALWAYS);
        VBox.setVgrow(nextButton7, Priority.ALWAYS);
        q7B1.getChildren().addAll(questionNo7, q7Blank1, timerQ7, nextButton7);
        
        //box2, obj1 and option1 go here
        VBox q7B2 = new VBox(40);
        Label q7Blank2_5 = new Label("\n" + "\n");
        Label object13 = new Label(str37);
        Label q7Blank3 = new Label("\n" + "\n");
        wrongAnswer_1Q7 = new Button(str40);
        VBox.setVgrow(q7Blank2_5, Priority.ALWAYS);
        VBox.setVgrow(q7Blank3, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_1Q7, Priority.ALWAYS);
        q7B2.getChildren().addAll(q7Blank2_5, object13, q7Blank3, wrongAnswer_1Q7);
        
        //box3, qplus and option2 go here
        VBox q7B3 = new VBox(40);
        Label q7Blank3_5 = new Label("\n" + "\n");
        Label qPlus7 = new Label("+");
        Label q7Blank4 = new Label("\n" + "\n");
        wrongAnswer_2Q7 = new Button(str41);
        VBox.setVgrow(q7Blank3_5, Priority.ALWAYS);
        VBox.setVgrow(q7Blank4, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_2Q7, Priority.ALWAYS);
        q7B3.getChildren().addAll(q7Blank3_5, qPlus7, q7Blank4, wrongAnswer_2Q7);
        
        //box4, obj2 and option3 go here
        VBox q7B4 = new VBox(40);
        Label q7Blank4_5 = new Label("\n" + "\n");
        Label object14 = new Label(str38);
        Label q7Blank5 = new Label("\n" + "\n");
        correctAnswer_Q7 = new Button(str39);
        VBox.setVgrow(q7Blank4_5, Priority.ALWAYS);
        VBox.setVgrow(q7Blank5, Priority.ALWAYS);
        VBox.setVgrow(correctAnswer_Q7, Priority.ALWAYS);
        q7B4.getChildren().addAll(q7Blank4_5, object14, q7Blank5, correctAnswer_Q7);
        
        //box5, option4 goes here
        VBox q7B5 = new VBox(40);
        Label emptySpace_7 = new Label("");
        Label emptySpace2_7 = new Label("");
        Label q7Blank6 = new Label("\n" + "\n" + "\n");
        wrongAnswer_3Q7 = new Button(str42);
        VBox.setVgrow(emptySpace2_7, Priority.ALWAYS);
        VBox.setVgrow(q7Blank6, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_3Q7, Priority.ALWAYS);
        q7B5.getChildren().addAll(emptySpace_7, emptySpace2_7, q7Blank6, wrongAnswer_3Q7);
        
        //box6, playername, timestamp, and that report generator go here
        VBox q7B6 = new VBox(10);
        
        
        q7TS = new Label("...");
        notifierL7 = new Label("...");
        VBox.setVgrow(q7TS, Priority.ALWAYS);
        //VBox.setVgrow(generateReport, Priority.ALWAYS);
        q7B6.getChildren().addAll(playerNameSpace7, notifierL7);
        
        q7Box.getChildren().addAll(q7B1, q7B2, q7B3, q7B4, q7B5, q7B6);
        q7Stack.getChildren().add(q7Box);
        
        Scene question_7 = new Scene(q7Stack, 1600, 600);
        //====end creation question 7====
        
        //====creating question 8====
        /*
        //question 8 block
        str43 = questionlistVG.get(42); //obj15, 2.3f
        str44 = questionlistVG.get(43); //obj16, 4
        str45 = questionlistVG.get(44); //Q8 CORRECT ANSWER, 6.3f
        str46 = questionlistVG.get(45); //Q8 WRONG ANSWER 1, 6.3
        str47 = questionlistVG.get(46); //Q8 WRONG ANSWER 2, 4
        str48 = questionlistVG.get(47); //Q8 WRONG ANSWER 3, 2
        */
        StackPane q8Stack = new StackPane();
        HBox q8Box = new HBox(40); //hbox with 5 HBox
        
        //box1, question number and timer go here
        VBox q8B1 = new VBox(40);
        Label questionNo8 = new Label("№ 8");
        Label q8Blank1 = new Label("\n" + "\n" + "\n" + "\n" + "\n" + "\n");
        Label timerQ8 = new Label("NaN");
        nextButton8 = new Button("Next");
        VBox.setVgrow(q8Blank1, Priority.ALWAYS);
        VBox.setVgrow(timerQ8, Priority.ALWAYS);
        VBox.setVgrow(nextButton8, Priority.ALWAYS);
        q8B1.getChildren().addAll(questionNo8, q8Blank1, timerQ8, nextButton8);
        
        //box2, obj1 and option1 go here
        VBox q8B2 = new VBox(40);
        Label q8Blank2_5 = new Label("\n" + "\n");
        Label object15 = new Label(str43);
        Label q8Blank3 = new Label("\n" + "\n");
        correctAnswer_Q8 = new Button(str45);
        VBox.setVgrow(q8Blank2_5, Priority.ALWAYS);
        VBox.setVgrow(q8Blank3, Priority.ALWAYS);
        VBox.setVgrow(correctAnswer_Q8, Priority.ALWAYS);
        q8B2.getChildren().addAll(q8Blank2_5, object15, q8Blank3, correctAnswer_Q8);
        
        //box3, qplus and option2 go here
        VBox q8B3 = new VBox(40);
        Label q8Blank3_5 = new Label("\n" + "\n");
        Label qPlus8 = new Label("+");
        Label q8Blank4 = new Label("\n" + "\n");
        wrongAnswer_1Q8 = new Button(str46);
        VBox.setVgrow(q8Blank3_5, Priority.ALWAYS);
        VBox.setVgrow(q8Blank4, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_1Q8, Priority.ALWAYS);
        q8B3.getChildren().addAll(q8Blank3_5, qPlus8, q8Blank4, wrongAnswer_1Q8);
        
        //box4, obj2 and option3 go here
        VBox q8B4 = new VBox(40);
        Label q8Blank4_5 = new Label("\n" + "\n");
        Label object16 = new Label(str44);
        Label q8Blank5 = new Label("\n" + "\n");
        wrongAnswer_2Q8 = new Button(str47);
        VBox.setVgrow(q8Blank4_5, Priority.ALWAYS);
        VBox.setVgrow(q8Blank5, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_2Q8, Priority.ALWAYS);
        q8B4.getChildren().addAll(q8Blank4_5, object16, q8Blank5, wrongAnswer_2Q8);
        
        //box5, option4 goes here
        VBox q8B5 = new VBox(40);
        Label emptySpace_8 = new Label("");
        Label emptySpace2_8 = new Label("");
        Label q8Blank6 = new Label("\n" + "\n" + "\n");
        wrongAnswer_3Q8 = new Button(str48);
        VBox.setVgrow(emptySpace2_8, Priority.ALWAYS);
        VBox.setVgrow(q8Blank6, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_3Q8, Priority.ALWAYS);
        q8B5.getChildren().addAll(emptySpace_8, emptySpace2_8, q8Blank6, wrongAnswer_3Q8);
        
        //box6, playername, timestamp, and that report generator go here
        VBox q8B6 = new VBox(10);
        
        
        q8TS = new Label("...");
        notifierL8 = new Label("...");
        VBox.setVgrow(notifierL8, Priority.ALWAYS);
        //VBox.setVgrow(generateReport, Priority.ALWAYS);
        q8B6.getChildren().addAll(playerNameSpace8, notifierL8);
        
        q8Box.getChildren().addAll(q8B1, q8B2, q8B3, q8B4, q8B5, q8B6);
        q8Stack.getChildren().add(q8Box);
        
        Scene question_8 = new Scene(q8Stack, 1600, 600);
        //====end creation question 8====
        
        //====creating question 9====
        /*
        //question 9 block
        str49 = questionlistVG.get(48); //obj17, Mary
        str50 = questionlistVG.get(49); //obj18, Lamb
        str51 = questionlistVG.get(50); //Q9 CORRECT ANSWER, MaryLamb
        str52 = questionlistVG.get(51); //Q9 WRONG ANSWER 1, little
        str53 = questionlistVG.get(52); //Q9 WRONG ANSWER 2, lamb
        str54 = questionlistVG.get(53); //Q9 WRONG ANSWER 3, cool
        */
        StackPane q9Stack = new StackPane();
        HBox q9Box = new HBox(40); //hbox with 5 HBox
        
        //box1, question number and timer go here
        VBox q9B1 = new VBox(40);
        Label questionNo9 = new Label("№ 9");
        Label q9Blank1 = new Label("\n" + "\n" + "\n" + "\n" + "\n" + "\n");
        Label timerQ9 = new Label("NaN");
        nextButton9 = new Button("Next");
        VBox.setVgrow(q9Blank1, Priority.ALWAYS);
        VBox.setVgrow(timerQ9, Priority.ALWAYS);
        VBox.setVgrow(nextButton9, Priority.ALWAYS);
        q9B1.getChildren().addAll(questionNo9, q9Blank1, timerQ9, nextButton9);
        
        //box2, obj1 and option1 go here
        VBox q9B2 = new VBox(40);
        Label q9Blank2_5 = new Label("\n" + "\n");
        Label object17 = new Label(str49);
        Label q9Blank3 = new Label("\n" + "\n");
        correctAnswer_Q9 = new Button(str51);
        VBox.setVgrow(q9Blank2_5, Priority.ALWAYS);
        VBox.setVgrow(q9Blank3, Priority.ALWAYS);
        VBox.setVgrow(correctAnswer_Q9, Priority.ALWAYS);
        q9B2.getChildren().addAll(q9Blank2_5, object17, q9Blank3, correctAnswer_Q9);
        
        //box3, qplus and option2 go here
        VBox q9B3 = new VBox(40);
        Label q9Blank3_5 = new Label("\n" + "\n");
        Label qPlus9 = new Label("+");
        Label q9Blank4 = new Label("\n" + "\n");
        wrongAnswer_1Q9 = new Button(str52);
        VBox.setVgrow(q9Blank3_5, Priority.ALWAYS);
        VBox.setVgrow(q9Blank4, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_1Q9, Priority.ALWAYS);
        q9B3.getChildren().addAll(q9Blank3_5, qPlus9, q9Blank4, wrongAnswer_1Q9);
        
        //box4, obj2 and option3 go here
        VBox q9B4 = new VBox(40);
        Label q9Blank4_5 = new Label("\n" + "\n");
        Label object18 = new Label(str50);
        Label q9Blank5 = new Label("\n" + "\n");
        wrongAnswer_2Q9 = new Button(str53);
        VBox.setVgrow(q9Blank4_5, Priority.ALWAYS);
        VBox.setVgrow(q9Blank5, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_2Q9, Priority.ALWAYS);
        q9B4.getChildren().addAll(q9Blank4_5, object18, q9Blank5, wrongAnswer_2Q9);
        
        //box5, option4 goes here
        VBox q9B5 = new VBox(40);
        Label emptySpace_9 = new Label("");
        Label emptySpace2_9 = new Label("");
        Label q9Blank6 = new Label("\n" + "\n" + "\n");
        wrongAnswer_3Q9 = new Button(str54);
        VBox.setVgrow(emptySpace2_9, Priority.ALWAYS);
        VBox.setVgrow(q9Blank6, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_3Q9, Priority.ALWAYS);
        q9B5.getChildren().addAll(emptySpace_9, emptySpace2_9, q9Blank6, wrongAnswer_3Q9);
        
        //box6, playername, timestamp, and that report generator go here
        VBox q9B6 = new VBox(10);
        
        
        q9TS = new Label("...");
        notifierL9 = new Label("...");
        VBox.setVgrow(notifierL9, Priority.ALWAYS);
        //VBox.setVgrow(generateReport, Priority.ALWAYS);
        q9B6.getChildren().addAll(playerNameSpace9, notifierL9);
        
        q9Box.getChildren().addAll(q9B1, q9B2, q9B3, q9B4, q9B5, q9B6);
        q9Stack.getChildren().add(q9Box);
        
        Scene question_9 = new Scene(q9Stack, 1600, 600);
        //====end creation question 9====
        
        //====creating question 10====
        /*
        //question 10 block
        str55 = questionlistVG.get(54); //obj19, 6
        str56 = questionlistVG.get(55); //obj20, 5
        str57 = questionlistVG.get(56); //Q10 CORRECT ANSWER, 11
        str58 = questionlistVG.get(57); //Q10 WRONG ANSWER 1, 12
        str59 = questionlistVG.get(58); //Q10 WRONG ANSWER 2, 13
        str60 = questionlistVG.get(59); //Q10 WRONG ANSWER 3, 14
        */
        StackPane q10Stack = new StackPane();
        HBox q10Box = new HBox(40); //hbox with 5 HBox
        
        //box1, question number and timer go here
        VBox q10B1 = new VBox(40);
        Label questionNo10 = new Label("№ 10");
        Label q10Blank1 = new Label("\n" + "\n" + "\n" + "\n" + "\n" + "\n");
        Label timerQ10 = new Label("NaN");
        nextButton10 = new Button("Next");
        VBox.setVgrow(q10Blank1, Priority.ALWAYS);
        VBox.setVgrow(timerQ10, Priority.ALWAYS);
        VBox.setVgrow(nextButton10, Priority.ALWAYS);
        q10B1.getChildren().addAll(questionNo10, q10Blank1, timerQ10, nextButton10);
        
        //box2, obj1 and option1 go here
        VBox q10B2 = new VBox(40);
        Label q10Blank2_5 = new Label("\n" + "\n");
        Label object19 = new Label(str55);
        Label q10Blank3 = new Label("\n" + "\n");
        correctAnswer_Q10 = new Button(str57);
        VBox.setVgrow(q10Blank2_5, Priority.ALWAYS);
        VBox.setVgrow(q10Blank3, Priority.ALWAYS);
        VBox.setVgrow(correctAnswer_Q10, Priority.ALWAYS);
        q10B2.getChildren().addAll(q10Blank2_5, object19, q10Blank3, correctAnswer_Q10);
        
        //box3, qplus and option2 go here
        VBox q10B3 = new VBox(40);
        Label q10Blank3_5 = new Label("\n" + "\n");
        Label qPlus10 = new Label("+");
        Label q10Blank4 = new Label("\n" + "\n");
        wrongAnswer_1Q10 = new Button(str58);
        VBox.setVgrow(q10Blank3_5, Priority.ALWAYS);
        VBox.setVgrow(q10Blank4, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_1Q10, Priority.ALWAYS);
        q10B3.getChildren().addAll(q10Blank3_5, qPlus10, q10Blank4, wrongAnswer_1Q10);
        
        //box4, obj2 and option3 go here
        VBox q10B4 = new VBox(40);
        Label q10Blank4_5 = new Label("\n" + "\n");
        Label object20 = new Label(str56);
        Label q10Blank5 = new Label("\n" + "\n");
        wrongAnswer_2Q10 = new Button(str59);
        VBox.setVgrow(q10Blank4_5, Priority.ALWAYS);
        VBox.setVgrow(q10Blank5, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_2Q10, Priority.ALWAYS);
        q10B4.getChildren().addAll(q10Blank4_5, object20, q10Blank5, wrongAnswer_2Q10);
        
        //box5, option4 goes here
        VBox q10B5 = new VBox(40);
        Label emptySpace_10 = new Label("");
        Label emptySpace2_10 = new Label("");
        Label q10Blank6 = new Label("\n" + "\n" + "\n");
        wrongAnswer_3Q10 = new Button(str60);
        VBox.setVgrow(emptySpace2_10, Priority.ALWAYS);
        VBox.setVgrow(q10Blank6, Priority.ALWAYS);
        VBox.setVgrow(wrongAnswer_3Q10, Priority.ALWAYS);
        q10B5.getChildren().addAll(emptySpace_10, emptySpace2_10, q10Blank6, wrongAnswer_3Q10);
        
        //box6, playername, timestamp, and that report generator go here
        VBox q10B6 = new VBox(10);
        
        
        q10TS = new Label("...");
        notifierL10 = new Label("...");
        VBox.setVgrow(notifierL10, Priority.ALWAYS);
        //VBox.setVgrow(generateReport, Priority.ALWAYS);
        q10B6.getChildren().addAll(playerNameSpace10, notifierL10/*, generateReport*/);
        
        q10Box.getChildren().addAll(q10B1, q10B2, q10B3, q10B4, q10B5, q10B6);
        q10Stack.getChildren().add(q10Box);
        
        Scene question_10 = new Scene(q10Stack, 1600, 600);
        //====end creation question 10====
        
        //====creating reviewPage====
        VBox qReview = new VBox(5);
        Label titleQR = new Label(" Question Review \n" + "\n");
        returnHome = new Button("Home");
        //Label totalPoints = new Label(playerTitleSpace + "'s score: " + score + "/10");
        qReview.getChildren().addAll(titleQR, q1TS, q2TS, q3TS, q4TS, q5TS, q6TS, q7TS, q8TS, q9TS, q10TS, playerTitleSpace, generateReport, returnHome);
//        VBox score_board = new VBox(5);
//        Label leaderBoard = new Label("LEADER BOARD \n" + "1.   \n" + "2.   \n" + "3.   \n" + "4.   \n" + "5.   \n" + "6.   \n" + "7.   \n" + "8.   \n" + "9.   \n" + "10.  \n");
//        score_board.getChildren().add(leaderBoard);
        StackPane qR = new StackPane();
        qR.getChildren().addAll(qReview);
        Scene question_review = new Scene(qR, 1600, 600);
        
                FileInputStream reviewImg = new FileInputStream("C:\\Users\\Austin Brown\\Documents\\NetBeansProjects\\JavaFXApplication6\\scorescreen.png");
        BackgroundImage reviewBG = new BackgroundImage(new Image(reviewImg, 1600, 600, false, true), 
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        qReview.setBackground(new Background(reviewBG));
        //====end creation of reviewPage====
        
        //===BUTTON ACTIONS====
        
        //action for returnFromAbout
        returnFromAbout.setOnAction(e -> primaryStage.setScene(startScreen));
        
        //action for aboutPage
        aboutPage.setOnAction(e -> primaryStage.setScene(aboutScene));
        
        //action for vGame
        vGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(verifyScreen);
                playername.setText("");
                checkerTxtFld.setText("空　[Field cannot be empty]");
                checkerTxtFld.setTextFill(Color.RED);
            }
        });
        
        //action for returnFromVerify
        returnFromVerify.setOnAction(e -> primaryStage.setScene(startScreen));
        
        //action for clearField
        clearField.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event2) {
                playername.setText("");
                checkerTxtFld.setText("空　[Field cannot be empty]");
                checkerTxtFld.setTextFill(Color.RED);
            }
        });
        
        //KeyEvent for checkerTxtFld?
        
        //action for startGameGo
        startGameGo.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event3) {
               
               primaryStage.setScene(question_1);
               nextButton1.setDisable(true);
               timerQ1.setTextFill(Color.RED);
               //score = 0;
               playerName = playername.getText();
               playerNameSpace1.setText(playerName);
               playerNameSpace2.setText(playerName);
               playerNameSpace3.setText(playerName);
               playerNameSpace4.setText(playerName);
               playerNameSpace5.setText(playerName);
               playerNameSpace6.setText(playerName);
               playerNameSpace7.setText(playerName);
               playerNameSpace8.setText(playerName);
               playerNameSpace9.setText(playerName);
               playerNameSpace10.setText(playerName);
               //score = q1Score + q2Score + q3Score + q4Score + q5Score + q6Score + q7Score + q8Score + q9Score + q10Score;
               
               playerTitleSpace.setText(playerName + "'s score: " + score + "/10");
               //playerTitle = playername.getText();

                           
            if (timeline != null) {
                timeline.stop();
            }
            countDown = startTime;
            
            // update timer label
            timerQ1.setText(countDown.toString());
            timeline = new Timeline();
            timeline.setCycleCount(Timeline.INDEFINITE);
            timeline.getKeyFrames().add(
                    new KeyFrame(Duration.seconds(1), (ActionEvent event1) -> {
                        countDown--;
                        // updates time string
                        timerQ1.setText(
                                countDown.toString());
                        if (countDown <= 0) {
                            timeline.stop();
                            noAnswer1();
                            timerQ1.setTextFill(Color.BLUEVIOLET);
                        }
            } // KeyFrame event handler
            ));
            timeline.playFromStart();
                  
            }
               
           });
        
        
    //QUESTION 1 ACTIONS
        //action for next_question_1
        nextButton1.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event8) {
            primaryStage.setScene(question_2);
            nextButton2.setDisable(true);
            timerQ2.setTextFill(Color.RED);
               if (timeline2 != null) {
                timeline2.stop();
            }
            countDown = startTime;
            
            // update timer label
            timerQ2.setText(countDown.toString());
            timeline2 = new Timeline();
            timeline2.setCycleCount(Timeline.INDEFINITE);
            timeline2.getKeyFrames().add(
                    new KeyFrame(Duration.seconds(1), (ActionEvent event9) -> {
                        countDown--;
                        // updates time string
                        timerQ2.setText(
                                countDown.toString());
                        if (countDown <= 0) {
                            timeline2.stop();
                            noAnswer2();
                            timerQ2.setTextFill(Color.BLUEVIOLET);
                        }
            } // KeyFrame event handler
            ));
            timeline2.playFromStart();
                  
            }
        });
        
        //action for wrongAnswer_1Q1
        wrongAnswer_1Q1.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event4) {
               wrongOrCorrectAnswer1();
               q1Score = 0;
               deductPoints();
               //scoreArray.add(q1Score);
               q1TS.setText("Incorrect answer on 1 at " + timestampQ1 + " | " + q1Score + " points recieved");
               notifierL1.setText("Sorry, that's incorrect. \n" + "The correct answer is 9.0.");
           }
        });
        
        //action for wrongAnswer_3Q1
        wrongAnswer_3Q1.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event5) {
               wrongOrCorrectAnswer1();
               q1Score = 0;
               deductPoints();
               //scoreArray.add(q1Score);
               q1TS.setText("Incorrect answer on 1 at " + timestampQ1 + " | " + q1Score + " points recieved");
               notifierL1.setText("Sorry, that's incorrect. \n" + "The correct answer is 9.0.");
           }
        });
        
        //action for wrongAnswer_2Q1
        wrongAnswer_2Q1.setOnAction(new EventHandler<ActionEvent>() {
          @Override
           public void handle(ActionEvent event6) {
               wrongOrCorrectAnswer1();
               q1Score = 0;
               deductPoints();
               //scoreArray.add(q1Score);
               q1TS.setText("Incorrect answer on 1 at " + timestampQ1 + " | " + q1Score + " points recieved");
               notifierL1.setText("Sorry, that's incorrect. \n" + "The correct answer is 9.0.");
           }
        });
        
        //action for correctAnswerQ1
        correctAnswer_Q1.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event7) {
               wrongOrCorrectAnswer1();
               q1Score = 1;
               //scoreArray.add(q1Score);
               q1TS.setText("Correct answer on 1 at " + timestampQ1 + " | " + q1Score + " points recieved");
               notifierL1.setText("You answered correctly! Great job!");
           }
        });
        
    //QUESTION 2 ACTIONS
        //action for next_question_2
        nextButton2.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event10) {
            primaryStage.setScene(question_3);
            nextButton3.setDisable(true);
            timerQ3.setTextFill(Color.RED);
               if (timeline3 != null) {
                timeline3.stop();
            }
            countDown = startTime;
            
            // update timer label
            timerQ3.setText(countDown.toString());
            timeline3 = new Timeline();
            timeline3.setCycleCount(Timeline.INDEFINITE);
            timeline3.getKeyFrames().add(
                    new KeyFrame(Duration.seconds(1), (ActionEvent event11) -> {
                        countDown--;
                        // updates time string
                        timerQ3.setText(
                                countDown.toString());
                        if (countDown <= 0) {
                            timeline3.stop();
                            noAnswer3();
                            timerQ3.setTextFill(Color.BLUEVIOLET);
                        }
            } // KeyFrame event handler
            ));
            timeline3.playFromStart();
                  
            }
        });
        
        //action for wrongAnswer_1Q2
        wrongAnswer_1Q2.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event12) {
               wrongOrCorrectAnswer2();
               q2Score = 0;
               deductPoints();
               //scoreArray.add(q2Score);
               q2TS.setText("Incorrect answer on 2 at " + timestampQ2 + " | " + q2Score + " points recieved");
               notifierL2.setText("Sorry, that's incorrect. \n" + "The correct answer is 9.");
           }
        });
        //action for wrongAnswer_3Q2
        wrongAnswer_3Q2.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event13) {
               wrongOrCorrectAnswer2();
               q2Score = 0;
               deductPoints();
               //scoreArray.add(q2Score);
               q2TS.setText("Incorrect answer on 2 at " + timestampQ2 + " | " + q2Score + " points recieved");
               notifierL2.setText("Sorry, that's incorrect. \n" + "The correct answer is 9.");
           }
        });
        //action for wrongAnswer_2Q2
        wrongAnswer_2Q2.setOnAction(new EventHandler<ActionEvent>() {
          @Override
           public void handle(ActionEvent event14) {
               wrongOrCorrectAnswer2();
               q2Score = 0;
               deductPoints();
               //scoreArray.add(q2Score);
               q2TS.setText("Incorrect answer on 2 at " + timestampQ2 + " | " + q2Score + " points recieved");
               notifierL2.setText("Sorry, that's incorrect. \n" + "The correct answer is 9.");
           }
        });
        //action for correctAnswerQ2
        correctAnswer_Q2.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event15) {
               wrongOrCorrectAnswer2();
               q2Score = 1;
               //scoreArray.add(q2Score);
               q2TS.setText("Correct answer on 2 at " + timestampQ2 + " | " + q2Score + " points recieved");
               notifierL2.setText("You answered correctly! Great job!");
           }
        });
        
    //QUESTION 3 ACTIONS
        //action for next_question_3
        nextButton3.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event16) {
            primaryStage.setScene(question_4);
            nextButton4.setDisable(true);
            timerQ4.setTextFill(Color.RED);
               if (timeline4 != null) {
                timeline4.stop();
            }
            countDown = startTime;
            
            // update timer label
            timerQ4.setText(countDown.toString());
            timeline4 = new Timeline();
            timeline4.setCycleCount(Timeline.INDEFINITE);
            timeline4.getKeyFrames().add(
                    new KeyFrame(Duration.seconds(1), (ActionEvent event17) -> {
                        countDown--;
                        // updates time string
                        timerQ4.setText(
                                countDown.toString());
                        if (countDown <= 0) {
                            timeline4.stop();
                            noAnswer4();
                            timerQ4.setTextFill(Color.BLUEVIOLET);
                        }
            } // KeyFrame event handler
            ));
            timeline4.playFromStart();
            }
        });
        
        //action for wrongAnswer_1Q3
        wrongAnswer_1Q3.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event18) {
               wrongOrCorrectAnswer3();
               q3Score = 0;
               deductPoints();
               //scoreArray.add(q3Score);
               q3TS.setText("Incorrect answer on 3 at " + timestampQ3 + " | " + q3Score + " points recieved");
               notifierL3.setText("Sorry, that's incorrect. \n" + "The correct answer is MickeyMouse.");
           }
        });
        //action for wrongAnswer_3Q3
        wrongAnswer_3Q3.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event19) {
               wrongOrCorrectAnswer3();
               q3Score = 0;
               deductPoints();
               //scoreArray.add(q3Score);
               q3TS.setText("Incorrect answer on 3 at " + timestampQ3 + " | " + q3Score + " points recieved");
               notifierL3.setText("Sorry, that's incorrect. \n" + "The correct answer is MickeyMouse.");
           }
        });
        //action for wrongAnswer_2Q3
        wrongAnswer_2Q3.setOnAction(new EventHandler<ActionEvent>() {
          @Override
           public void handle(ActionEvent event20) {
               wrongOrCorrectAnswer3();
               q3Score = 0;
               deductPoints();
               //scoreArray.add(q3Score);
               q3TS.setText("Incorrect answer on 3 at " + timestampQ3 + " | " + q3Score + " points recieved");
               notifierL3.setText("Sorry, that's incorrect. \n" + "The correct answer is MickeyMouse.");
           }
        });
        //action for correctAnswerQ3
        correctAnswer_Q3.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event21) {
               wrongOrCorrectAnswer3();
               q3Score = 1;
               //scoreArray.add(q3Score);
               q3TS.setText("Correct answer on 3 at " + timestampQ3 + " | " + q3Score + " points recieved");
               notifierL3.setText("You answered correctly! Great job!");
           }
        });
    
    //QUESTION 4 ACTIONS
        //action for next_question_4
        nextButton4.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event22) {
            primaryStage.setScene(question_5);
            nextButton5.setDisable(true);
            timerQ5.setTextFill(Color.RED);
               if (timeline5 != null) {
                timeline5.stop();
            }
            countDown = startTime;
            
            // update timer label
            timerQ5.setText(countDown.toString());
            timeline5 = new Timeline();
            timeline5.setCycleCount(Timeline.INDEFINITE);
            timeline5.getKeyFrames().add(
                    new KeyFrame(Duration.seconds(1), (ActionEvent event23) -> {
                        countDown--;
                        // updates time string
                        timerQ5.setText(
                                countDown.toString());
                        if (countDown <= 0) {
                            timeline5.stop();
                            noAnswer5();
                            timerQ5.setTextFill(Color.BLUEVIOLET);
                        }
            } // KeyFrame event handler
            ));
            timeline5.playFromStart();
            }
        });
        //action for wrongAnswer_1Q4
        wrongAnswer_1Q4.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event24) {
               wrongOrCorrectAnswer4();
               q4Score = 0;
               deductPoints();
               //scoreArray.add(q4Score);
               q4TS.setText("Incorrect answer on 4 at " + timestampQ4 + " | " + q4Score + " points recieved");
               notifierL4.setText("Sorry, that's incorrect. \n" + "The correct answer is error.");
           }
        });
        //action for wrongAnswer_3Q4
        wrongAnswer_3Q4.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event25) {
               wrongOrCorrectAnswer4();
               q4Score = 0;
               deductPoints();
               //scoreArray.add(q4Score);
               q4TS.setText("Incorrect answer on 4 at " + timestampQ4 + " | " + q4Score + " points recieved");
               notifierL4.setText("Sorry, that's incorrect. \n" + "The correct answer is error.");
           }
        });
        //action for wrongAnswer_2Q4
        wrongAnswer_2Q4.setOnAction(new EventHandler<ActionEvent>() {
          @Override
           public void handle(ActionEvent event26) {
               wrongOrCorrectAnswer4();
               q4Score = 0;
               deductPoints();
               //scoreArray.add(q4Score);
               q4TS.setText("Incorrect answer on 4 at " + timestampQ4 + " | " + q4Score + " points recieved");
               notifierL4.setText("Sorry, that's incorrect. \n" + "The correct answer is error.");
           }
        });
        //action for correctAnswerQ4
        correctAnswer_Q4.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event27) {
               wrongOrCorrectAnswer4();
               q4Score = 1;
               //scoreArray.add(q4Score);
               q4TS.setText("Correct answer on 4 at " + timestampQ4 + " | " + q4Score + " points recieved");
               notifierL4.setText("You answered correctly! Great job!");
           }
        });
        
    //QUESTION 5 ACTIONS
        //action for next_question_5
        nextButton5.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event28) {
            primaryStage.setScene(question_6);
            nextButton6.setDisable(true);
            timerQ6.setTextFill(Color.RED);
               if (timeline6 != null) {
                timeline6.stop();
            }
            countDown = startTime;
            
            // update timer label
            timerQ6.setText(countDown.toString());
            timeline6 = new Timeline();
            timeline6.setCycleCount(Timeline.INDEFINITE);
            timeline6.getKeyFrames().add(
                    new KeyFrame(Duration.seconds(1), (ActionEvent event29) -> {
                        countDown--;
                        // updates time string
                        timerQ6.setText(
                                countDown.toString());
                        if (countDown <= 0) {
                            timeline6.stop();
                            noAnswer6();
                            timerQ6.setTextFill(Color.BLUEVIOLET);
                        }
            } // KeyFrame event handler
            ));
            timeline6.playFromStart();
            }
        });
        //action for wrongAnswer_1Q5
        wrongAnswer_1Q5.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event30) {
               wrongOrCorrectAnswer5();
               q5Score = 0;
               deductPoints();
               //scoreArray.add(q5Score);
               q5TS.setText("Incorrect answer on 5 at " + timestampQ5 + " | " + q5Score + " points recieved");
               notifierL5.setText("Sorry, that's incorrect. \n" + "The correct answer is 16.");
           }
        });
        //action for correctAnswer_Q5
        correctAnswer_Q5.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event27) {
               wrongOrCorrectAnswer5();
               q5Score = 1;
               //scoreArray.add(q5Score);
               q5TS.setText("Correct answer on 5 at " + timestampQ5 + " | " + q5Score + " points recieved");
               notifierL5.setText("You answered correctly! Great job!");
           }
        });
        //action for wrongAnswer_2Q5
        wrongAnswer_2Q5.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event31) {
               wrongOrCorrectAnswer5();
               q5Score = 0;
               deductPoints();
               //scoreArray.add(q5Score);
               q5TS.setText("Incorrect answer on 5 at " + timestampQ5 + " | " + q5Score + " points recieved");
               notifierL5.setText("Sorry, that's incorrect. \n" + "The correct answer is 16.");
           }
        });
        //action for wrongAnswer_3Q5
        wrongAnswer_3Q5.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event32) {
               wrongOrCorrectAnswer5();
               q5Score = 0;
               deductPoints();
               //scoreArray.add(q5Score);
               q5TS.setText("Incorrect answer on 5 at " + timestampQ5 + " | " + q5Score + " points recieved");
               notifierL5.setText("Sorry, that's incorrect. \n" + "The correct answer is 16.");
           }
        });
        
    //QUESTION 6 ACTIONS
        //action for next_question_6
        nextButton6.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event33) {
            primaryStage.setScene(question_7);
            nextButton7.setDisable(true);
            timerQ7.setTextFill(Color.RED);
               if (timeline7 != null) {
                timeline7.stop();
            }
            countDown = startTime;
            
            // update timer label
            timerQ7.setText(countDown.toString());
            timeline7 = new Timeline();
            timeline7.setCycleCount(Timeline.INDEFINITE);
            timeline7.getKeyFrames().add(
                    new KeyFrame(Duration.seconds(1), (ActionEvent event34) -> {
                        countDown--;
                        // updates time string
                        timerQ7.setText(
                                countDown.toString());
                        if (countDown <= 0) {
                            timeline7.stop();
                            noAnswer7();
                            timerQ7.setTextFill(Color.BLUEVIOLET);
                        }
            } // KeyFrame event handler
            ));
            timeline7.playFromStart();
            }
        });
        //action for wrongAnswer_1Q6
        wrongAnswer_1Q6.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event35) {
               wrongOrCorrectAnswer6();
               q6Score = 0;
               deductPoints();
               //scoreArray.add(q6Score);
               q6TS.setText("Incorrect answer on 6 at " + timestampQ6 + " | " + q6Score + " points recieved");
               notifierL6.setText("Sorry, that's incorrect. \n" + "The correct answer is 8.1f.");
           }
        });
        //action for correctAnswer_Q6
        correctAnswer_Q6.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event36) {
               wrongOrCorrectAnswer6();
               q6Score = 1;
               //scoreArray.add(q6Score);
               q6TS.setText("Correct answer on 6 at " + timestampQ6 + " | " + q6Score + " points recieved");
               notifierL6.setText("You answered correctly! Great job!");
           }
        });
        //action for wrongAnswer_2Q6
        wrongAnswer_2Q6.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event37) {
               wrongOrCorrectAnswer6();
               q6Score = 0;
               deductPoints();
               //scoreArray.add(q6Score);
               q6TS.setText("Incorrect answer on 6 at " + timestampQ6 + " | " + q6Score + " points recieved");
               notifierL6.setText("Sorry, that's incorrect. \n" + "The correct answer is 8.1f.");
           }
        });
        //action for wrongAnswer_3Q6
        wrongAnswer_3Q6.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event38) {
               wrongOrCorrectAnswer6();
               q6Score = 0;
               deductPoints();
               //scoreArray.add(q6Score);
               q6TS.setText("Incorrect answer on 6 at " + timestampQ6 + " | " + q6Score + " points recieved");
               notifierL6.setText("Sorry, that's incorrect. \n" + "The correct answer is 8.1f.");
           }
        });
        
    //QUESTION 7 ACTIONS
        //action for next_question_7
        nextButton7.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event39) {
            primaryStage.setScene(question_8);
            nextButton8.setDisable(true);
            timerQ8.setTextFill(Color.RED);
               if (timeline8 != null) {
                timeline8.stop();
            }
            countDown = startTime;
            
            // update timer label
            timerQ8.setText(countDown.toString());
            timeline8 = new Timeline();
            timeline8.setCycleCount(Timeline.INDEFINITE);
            timeline8.getKeyFrames().add(
                    new KeyFrame(Duration.seconds(1), (ActionEvent event40) -> {
                        countDown--;
                        // updates time string
                        timerQ8.setText(
                                countDown.toString());
                        if (countDown <= 0) {
                            timeline8.stop();
                            noAnswer8();
                            timerQ8.setTextFill(Color.BLUEVIOLET);
                        }
            } // KeyFrame event handler
            ));
            timeline8.playFromStart();
            }
        });
        //action for wrongAnswer_1Q7
        wrongAnswer_1Q7.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event41) {
               wrongOrCorrectAnswer7();
               q7Score = 0;
               deductPoints();
               //scoreArray.add(q7Score);
               q7TS.setText("Incorrect answer on 7 at " + timestampQ7 + " | " + q7Score + " points recieved");
               notifierL7.setText("Sorry, that's incorrect. \n" + "The correct answer is JavaProgram.");
           }
        });
        //action for wrongAnswer_2Q7
        wrongAnswer_2Q7.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event42) {
               wrongOrCorrectAnswer7();
               q7Score = 0;
               deductPoints();
               //scoreArray.add(q7Score);
               q7TS.setText("Incorrect answer on 7 at " + timestampQ7 + " | " + q7Score + " points recieved");
               notifierL7.setText("Sorry, that's incorrect. \n" + "The correct answer is JavaProgram.");
           }
        });
        //action for correctAnswer_Q7
        correctAnswer_Q7.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event43) {
               wrongOrCorrectAnswer7();
               q7Score = 1;
               //scoreArray.add(q7Score);
               q7TS.setText("Correct answer on 7 at " + timestampQ7 + " | " + q7Score + " points recieved");
               notifierL7.setText("You answered correctly! Great job!");
           }
        });
        //action for wrongAnswer_3Q7
        wrongAnswer_3Q7.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event44) {
               wrongOrCorrectAnswer7();
               q7Score = 0;
               deductPoints();
               //scoreArray.add(q7Score);
               q7TS.setText("Incorrect answer on 7 at " + timestampQ7 + " | " + q7Score + " points recieved");
               notifierL7.setText("Sorry, that's incorrect. \n" + "The correct answer is JavaProgram.");
           }
        });
    //QUESTION 8 ACTIONS
        //action for next_question_8
        nextButton8.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event45) {
            primaryStage.setScene(question_9);
            nextButton9.setDisable(true);
            timerQ9.setTextFill(Color.RED);
               if (timeline9 != null) {
                timeline9.stop();
            }
            countDown = startTime;
            
            // update timer label
            timerQ9.setText(countDown.toString());
            timeline9 = new Timeline();
            timeline9.setCycleCount(Timeline.INDEFINITE);
            timeline9.getKeyFrames().add(
                    new KeyFrame(Duration.seconds(1), (ActionEvent event46) -> {
                        countDown--;
                        // updates time string
                        timerQ9.setText(
                                countDown.toString());
                        if (countDown <= 0) {
                            timeline9.stop();
                            noAnswer9();
                            timerQ9.setTextFill(Color.BLUEVIOLET);
                        }
            } // KeyFrame event handler
            ));
            timeline9.playFromStart();
            }
        });
        //action for correctAnswer_Q8
        correctAnswer_Q8.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event47) {
               wrongOrCorrectAnswer8();
               q8Score = 1;
               //scoreArray.add(q8Score);
               q8TS.setText("Correct answer on 8 at " + timestampQ8 + " | " + q8Score + " points recieved");
               notifierL8.setText("You answered correctly! Great job!");
           }
        });
        //action for wrongAnswer_1Q8
        wrongAnswer_1Q8.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event48) {
               wrongOrCorrectAnswer8();
               q8Score = 0;
               deductPoints();
               //scoreArray.add(q8Score);
               q8TS.setText("Incorrect answer on 8 at " + timestampQ8 + " | " + q8Score + " points recieved");
               notifierL8.setText("Sorry, that's incorrect. \n" + "The correct answer is 6.3f.");
           }
        });
        //action for wrongAnswer_2Q8
        wrongAnswer_2Q8.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event49) {
               wrongOrCorrectAnswer8();
               q8Score = 0;
               deductPoints();
               //scoreArray.add(q8Score);
               q8TS.setText("Incorrect answer on 8 at " + timestampQ8 + " | " + q8Score + " points recieved");
               notifierL8.setText("Sorry, that's incorrect. \n" + "The correct answer is 6.3f.");
           }
        });
        //action for wrongAnswer_3Q8
        wrongAnswer_3Q8.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event50) {
               wrongOrCorrectAnswer8();
               q8Score = 0;
               deductPoints();
               //scoreArray.add(q8Score);
               q8TS.setText("Incorrect answer on 8 at " + timestampQ8 + " | " + q8Score + " points recieved");
               notifierL8.setText("Sorry, that's incorrect. \n" + "The correct answer is 6.3f.");
           }
        });
        
    //QUESTION 9 ACTIONS
        //action for next_question_9
        nextButton9.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event51) {
            primaryStage.setScene(question_10);
            nextButton10.setDisable(true);
            timerQ10.setTextFill(Color.RED);
            //generateReport.setDisable(true);
               if (timeline10 != null) {
                timeline10.stop();
            }
            countDown = startTime;
            
            // update timer label
            timerQ10.setText(countDown.toString());
            timeline10 = new Timeline();
            timeline10.setCycleCount(Timeline.INDEFINITE);
            timeline10.getKeyFrames().add(
                    new KeyFrame(Duration.seconds(1), (ActionEvent event52) -> {
                        countDown--;
                        // updates time string
                        timerQ10.setText(
                                countDown.toString());
                        if (countDown <= 0) {
                            timeline10.stop();
                            noAnswer10();
                            timerQ10.setTextFill(Color.BLUEVIOLET);
                        }
            } // KeyFrame event handler
            ));
            timeline10.playFromStart();
            }
        });
        
        //action for correctAnswer_Q9
        correctAnswer_Q9.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event53) {
               wrongOrCorrectAnswer9();
               q9Score = 1;
               //scoreArray.add(q9Score);
               q9TS.setText("Correct answer on 9 at " + timestampQ9 + " | " + q9Score + " points recieved");
               notifierL9.setText("You answered correctly! Great job!");
           }
        });
        //action for wrongAnswer_1Q9
        wrongAnswer_1Q9.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event54) {
               wrongOrCorrectAnswer9();
               q9Score = 0;
               deductPoints();
               //scoreArray.add(q9Score);
               q9TS.setText("Incorrect answer on 9 at " + timestampQ9 + " | " + q9Score + " points recieved");
               notifierL9.setText("Sorry, that's incorrect. \n" + "The correct answer is MaryLamb.");
           }
        });
        //action for wrongAnswer_2Q9
        wrongAnswer_2Q9.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event55) {
               wrongOrCorrectAnswer9();
               q9Score = 0;
               deductPoints();
               //scoreArray.add(q9Score);
               q9TS.setText("Incorrect answer on 9 at " + timestampQ9 + " | " + q9Score + " points recieved");
               notifierL9.setText("Sorry, that's incorrect. \n" + "The correct answer is MaryLamb.");
           }
        });
        //action for wrongAnswer_3Q9
        wrongAnswer_3Q9.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event56) {
               wrongOrCorrectAnswer9();
               q9Score = 0;
               deductPoints();
               //scoreArray.add(q9Score);
               q9TS.setText("Incorrect answer on 9 at " + timestampQ9 + " | " + q9Score + " points recieved");
               notifierL9.setText("Sorry, that's incorrect. \n" + "The correct answer is MaryLamb.");
           }
        });
        
    //QUESTION 10 ACTIONS
        //action for next_question_10
        nextButton10.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event57) {
               primaryStage.setScene(question_review);
                
//               score = 0; //this variable, and the other scores are haunted by some sort of NullPointerException, I don't know how to fix this
//               scoreArray.add(q1Score);
//               scoreArray.add(q2Score);
//               scoreArray.add(q3Score);
//               scoreArray.add(q4Score);
//               scoreArray.add(q5Score);
//               scoreArray.add(q6Score);
//               scoreArray.add(q7Score);
//               scoreArray.add(q8Score);
//               scoreArray.add(q9Score);
//               scoreArray.add(q10Score);
//               for(int i = 0; i < scoreArray.size(); i++) {
//                    score =+ scoreArray.get(i);
//               }
               //System.out.println(scoreArray);
               //System.out.println(score);
               
               Connection s = null;
               try {
                       
                Class.forName("org.sqlite.JDBC");
                s = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Austin Brown\\Documents\\NetBeansProjects\\JavaFXApplication6\\scoreBoard.db");   
                s.setAutoCommit(true);
                System.out.println("Connection successful?");
                WriteToDB to = new WriteToDB(playername.getText(), score);
                to.write2Leaderboard(to, s);
                
                s.close();
               } catch(SQLException e) {
                   
               } catch (ClassNotFoundException ex) {
                   Logger.getLogger(JavaFXApplication6.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
        });
        //action for correctAnswer_Q10
        correctAnswer_Q10.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event58) {
               wrongOrCorrectAnswer10();
               q10Score = 1;
               
               //scoreArray.add(q10Score);
               notifierL10.setText("You answered correctly! Great job!");
               q10TS.setText("Correct answer on 10 at " + timestampQ10 + " | " + q10Score + " points recieved");
           }
        });
        //action for wrongAnswer_1Q10
        wrongAnswer_1Q10.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event59) {
               wrongOrCorrectAnswer10();
               q10Score = 0;
               deductPoints();
               //scoreArray.add(q10Score);
               notifierL10.setText("Sorry, that's incorrect. \n" + "The correct answer is 11.");
               q10TS.setText("Incorrect answer on 10 at " + timestampQ10 + " | " + q10Score + " points recieved");
           }
        });
        //action for wrongAnswer_2Q10
        wrongAnswer_2Q10.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event60) {
               wrongOrCorrectAnswer10();
               q10Score = 0;
               deductPoints();
               //scoreArray.add(q10Score);
               notifierL10.setText("Sorry, that's incorrect. \n" + "The correct answer is 11.");
               q10TS.setText("Incorrect answer on 10 at " + timestampQ10 + " | " + q10Score + " points recieved");
           }
        });
        //action for wrongAnswer_3Q10
        wrongAnswer_3Q10.setOnAction(new EventHandler<ActionEvent>(){ 
           @Override
           public void handle(ActionEvent event61) {
               wrongOrCorrectAnswer10();
               q10Score = 0;
               deductPoints();
               //scoreArray.add(q10Score);
               notifierL10.setText("Sorry, that's incorrect. \n" + "The correct answer is 11.");
               q10TS.setText("Incorrect answer on 10 at " + timestampQ10 + " | " + q10Score + " points recieved");
           }
        });
        
        //returnHome button
        returnHome.setOnAction(e -> primaryStage.setScene(startScreen));
        
        //generateReport button
        generateReport.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event62) {
               Connection s = null;
               
               try {
                       
                Class.forName("org.sqlite.JDBC");
                s = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Austin Brown\\Documents\\NetBeansProjects\\JavaFXApplication6\\scoreBoard.db");   
                s.setAutoCommit(true);
                System.out.println("Connection successful?");
                WriteToDB to = new WriteToDB(playername.getText(), score);
                //WriteToDB ot = new WriteToDB(playername.getText(), score);
                
                to = WriteToDB.downLoadReport(to, s);
                
                
                s.close();
               } catch(SQLException e) {
                   
               } catch (ClassNotFoundException ex) {
                   Logger.getLogger(JavaFXApplication6.class.getName()).log(Level.SEVERE, null, ex);
               } catch (IOException ex) {
                    Logger.getLogger(JavaFXApplication6.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            }
        });
        //END BUTTON ACTIONS====
                 
        //====textfield specs====
        
        //====textfield specs====
        
        //====database scoreboard stuff====
        
        //write player name and score to database
        
        primaryStage.setTitle("Trivia Game");
        primaryStage.setScene(startScreen);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public void deductPoints() {
        score--;
        System.out.println("Current score " + score);
        playerTitleSpace.setText(playerName + "'s score: " + score + "/10");
    }
    
    public void noAnswer1() {
        nextButton1.setDisable(false);
        wrongAnswer_1Q1.setDisable(true);
        wrongAnswer_3Q1.setDisable(true);
        wrongAnswer_2Q1.setDisable(true);
        correctAnswer_Q1.setDisable(true);
        revealAnswers1();
        q1Score = 0;
        deductPoints();
        notifierL1.setText("No answer");
        q1TS.setText("No answer on 1 at " + timestampQ1 + " | " + q1Score + " points recieved");
        
    }
    
    public void wrongOrCorrectAnswer1() {
        timeline.stop();
        nextButton1.setDisable(false);
        wrongAnswer_1Q1.setDisable(true);
        wrongAnswer_3Q1.setDisable(true);
        wrongAnswer_2Q1.setDisable(true);
        correctAnswer_Q1.setDisable(true);
        revealAnswers1();
    }
    
    public void revealAnswers1() {
        wrongAnswer_1Q1.setStyle("-fx-text-fill: red");
        wrongAnswer_3Q1.setStyle("-fx-text-fill: red");
        wrongAnswer_2Q1.setStyle("-fx-text-fill: red");
        correctAnswer_Q1.setStyle("-fx-text-fill: green");
    }
    
    public void noAnswer2() {
        nextButton2.setDisable(false);
        wrongAnswer_1Q2.setDisable(true);
        wrongAnswer_3Q2.setDisable(true);
        wrongAnswer_2Q2.setDisable(true);
        correctAnswer_Q2.setDisable(true);
        revealAnswers2();
        q2Score = 0;
        deductPoints();
        notifierL2.setText("No answer");
        q2TS.setText("No answer on 2 at " + timestampQ2 + " | " + q2Score + " points recieved");
        
    }
    
    public void wrongOrCorrectAnswer2() {
        timeline2.stop();
        nextButton2.setDisable(false);
        wrongAnswer_1Q2.setDisable(true);
        wrongAnswer_3Q2.setDisable(true);
        wrongAnswer_2Q2.setDisable(true);
        correctAnswer_Q2.setDisable(true);
        revealAnswers2();
    }
    
    public void revealAnswers2() {
        wrongAnswer_1Q2.setStyle("-fx-text-fill: red");
        wrongAnswer_3Q2.setStyle("-fx-text-fill: red");
        wrongAnswer_2Q2.setStyle("-fx-text-fill: red");
        correctAnswer_Q2.setStyle("-fx-text-fill: green");
    }
    
    public void noAnswer3() {
        nextButton3.setDisable(false);
        wrongAnswer_1Q3.setDisable(true);
        wrongAnswer_3Q3.setDisable(true);
        wrongAnswer_2Q3.setDisable(true);
        correctAnswer_Q3.setDisable(true);
        revealAnswers3();
        q3Score = 0;
        deductPoints();
        notifierL3.setText("No answer");
        q3TS.setText("No answer on 3 at " + timestampQ3 + " | " + q3Score + " points recieved");
    }
    
    public void wrongOrCorrectAnswer3() {
        timeline3.stop();
        nextButton3.setDisable(false);
        wrongAnswer_1Q3.setDisable(true);
        wrongAnswer_3Q3.setDisable(true);
        wrongAnswer_2Q3.setDisable(true);
        correctAnswer_Q3.setDisable(true);
        revealAnswers3();
    }
    
    public void revealAnswers3() {
        wrongAnswer_1Q3.setStyle("-fx-text-fill: red");
        wrongAnswer_3Q3.setStyle("-fx-text-fill: red");
        wrongAnswer_2Q3.setStyle("-fx-text-fill: red");
        correctAnswer_Q3.setStyle("-fx-text-fill: green");
    }
        
    public void noAnswer4() {
        nextButton4.setDisable(false);
        wrongAnswer_1Q4.setDisable(true);
        wrongAnswer_3Q4.setDisable(true);
        wrongAnswer_2Q4.setDisable(true);
        correctAnswer_Q4.setDisable(true);
        revealAnswers4();
        q4Score = 0;
        deductPoints();
        notifierL4.setText("No answer");
        q4TS.setText("No answer on 4 at " + timestampQ4 + " | " + q4Score + " points recieved");
    }
    
    public void wrongOrCorrectAnswer4() {
        timeline4.stop();
        nextButton4.setDisable(false);
        wrongAnswer_1Q4.setDisable(true);
        wrongAnswer_3Q4.setDisable(true);
        wrongAnswer_2Q4.setDisable(true);
        correctAnswer_Q4.setDisable(true);
        revealAnswers4();
    }
    
    public void revealAnswers4() {
        wrongAnswer_1Q4.setStyle("-fx-text-fill: red");
        wrongAnswer_3Q4.setStyle("-fx-text-fill: red");
        wrongAnswer_2Q4.setStyle("-fx-text-fill: red");
        correctAnswer_Q4.setStyle("-fx-text-fill: green");
    }
    
    public void noAnswer5() {
        nextButton5.setDisable(false);
        wrongAnswer_1Q5.setDisable(true);
        wrongAnswer_3Q5.setDisable(true);
        wrongAnswer_2Q5.setDisable(true);
        correctAnswer_Q5.setDisable(true);
        revealAnswers5();
        q5Score = 0;
        deductPoints();
        notifierL5.setText("No answer");
        q5TS.setText("No answer on 5 at " + timestampQ5 + " | " + q5Score + " points recieved");
    }
    
    public void wrongOrCorrectAnswer5() {
        timeline5.stop();
        nextButton5.setDisable(false);
        wrongAnswer_1Q5.setDisable(true);
        wrongAnswer_3Q5.setDisable(true);
        wrongAnswer_2Q5.setDisable(true);
        correctAnswer_Q5.setDisable(true);
        revealAnswers5();
    }
    
    public void revealAnswers5() {
        wrongAnswer_1Q5.setStyle("-fx-text-fill: red");
        wrongAnswer_3Q5.setStyle("-fx-text-fill: red");
        wrongAnswer_2Q5.setStyle("-fx-text-fill: red");
        correctAnswer_Q5.setStyle("-fx-text-fill: green");
    }
    
    public void noAnswer6() {
        nextButton6.setDisable(false);
        wrongAnswer_1Q6.setDisable(true);
        wrongAnswer_3Q6.setDisable(true);
        wrongAnswer_2Q6.setDisable(true);
        correctAnswer_Q6.setDisable(true);
        revealAnswers6();
        q6Score = 0;
        deductPoints();
        notifierL6.setText("No answer");
        q6TS.setText("No answer at " + timestampQ6 + " | " + q6Score + " points recieved");
    }
    
    public void wrongOrCorrectAnswer6() {
        timeline6.stop();
        nextButton6.setDisable(false);
        wrongAnswer_1Q6.setDisable(true);
        wrongAnswer_3Q6.setDisable(true);
        wrongAnswer_2Q6.setDisable(true);
        correctAnswer_Q6.setDisable(true);
        revealAnswers6();
    }
    
    public void revealAnswers6() {
        wrongAnswer_1Q6.setStyle("-fx-text-fill: red");
        wrongAnswer_3Q6.setStyle("-fx-text-fill: red");
        wrongAnswer_2Q6.setStyle("-fx-text-fill: red");
        correctAnswer_Q6.setStyle("-fx-text-fill: green");
    }
    
    public void noAnswer7() {
        nextButton7.setDisable(false);
        wrongAnswer_1Q7.setDisable(true);
        wrongAnswer_3Q7.setDisable(true);
        wrongAnswer_2Q7.setDisable(true);
        correctAnswer_Q7.setDisable(true);
        revealAnswers7();
        q7Score = 0;
        deductPoints();
        notifierL7.setText("No answer");
        q7TS.setText("No answer at " + timestampQ7 + " | " + q7Score + " points recieved");
    }
    
    public void wrongOrCorrectAnswer7() {
        timeline7.stop();
        nextButton7.setDisable(false);
        wrongAnswer_1Q7.setDisable(true);
        wrongAnswer_3Q7.setDisable(true);
        wrongAnswer_2Q7.setDisable(true);
        correctAnswer_Q7.setDisable(true);
        revealAnswers7();
    }
    
    public void revealAnswers7() {
        wrongAnswer_1Q7.setStyle("-fx-text-fill: red");
        wrongAnswer_3Q7.setStyle("-fx-text-fill: red");
        wrongAnswer_2Q7.setStyle("-fx-text-fill: red");
        correctAnswer_Q7.setStyle("-fx-text-fill: green");
    }
    
    public void noAnswer8() {
        nextButton8.setDisable(false);
        wrongAnswer_1Q8.setDisable(true);
        wrongAnswer_3Q8.setDisable(true);
        wrongAnswer_2Q8.setDisable(true);
        correctAnswer_Q8.setDisable(true);
        revealAnswers8();
        q8Score = 0;
        deductPoints();
        notifierL8.setText("No answer");
        q8TS.setText("No answer at " + timestampQ8 + " | " + q8Score + " points recieved");
    }
    
    public void wrongOrCorrectAnswer8() {
        timeline8.stop();
        nextButton8.setDisable(false);
        wrongAnswer_1Q8.setDisable(true);
        wrongAnswer_3Q8.setDisable(true);
        wrongAnswer_2Q8.setDisable(true);
        correctAnswer_Q8.setDisable(true);
        revealAnswers8();
    }
    
    public void revealAnswers8() {
        wrongAnswer_1Q8.setStyle("-fx-text-fill: red");
        wrongAnswer_3Q8.setStyle("-fx-text-fill: red");
        wrongAnswer_2Q8.setStyle("-fx-text-fill: red");
        correctAnswer_Q8.setStyle("-fx-text-fill: green");
    }
    
    public void noAnswer9() {
        nextButton9.setDisable(false);
        wrongAnswer_1Q9.setDisable(true);
        wrongAnswer_3Q9.setDisable(true);
        wrongAnswer_2Q9.setDisable(true);
        correctAnswer_Q9.setDisable(true);
        revealAnswers9();
        q9Score = 0;
        deductPoints();
        notifierL9.setText("No answer");
        q9TS.setText("No answer at " + timestampQ9 + " | " + q9Score + " points recieved");
    }
    
    public void wrongOrCorrectAnswer9() {
        timeline9.stop();
        nextButton9.setDisable(false);
        wrongAnswer_1Q9.setDisable(true);
        wrongAnswer_3Q9.setDisable(true);
        wrongAnswer_2Q9.setDisable(true);
        correctAnswer_Q9.setDisable(true);
        revealAnswers9();
    }
    
    public void revealAnswers9() {
        wrongAnswer_1Q9.setStyle("-fx-text-fill: red");
        wrongAnswer_3Q9.setStyle("-fx-text-fill: red");
        wrongAnswer_2Q9.setStyle("-fx-text-fill: red");
        correctAnswer_Q9.setStyle("-fx-text-fill: green");
    }
    
    public void noAnswer10() {
        nextButton10.setDisable(false);
        generateReport.setDisable(false);
        wrongAnswer_1Q10.setDisable(true);
        wrongAnswer_3Q10.setDisable(true);
        wrongAnswer_2Q10.setDisable(true);
        correctAnswer_Q10.setDisable(true);
        revealAnswers10();
        q10Score = 0;
        deductPoints();
        notifierL10.setText("No answer");
        q10TS.setText("No answer at " + timestampQ10 + " | " + q10Score + " points recieved");
    }
    
    public void wrongOrCorrectAnswer10() {
        timeline10.stop();
        nextButton10.setDisable(false);
        generateReport.setDisable(false);
        wrongAnswer_1Q10.setDisable(true);
        wrongAnswer_3Q10.setDisable(true);
        wrongAnswer_2Q10.setDisable(true);
        correctAnswer_Q10.setDisable(true);
        revealAnswers10();
    }
    
    public void revealAnswers10() {
        wrongAnswer_1Q10.setStyle("-fx-text-fill: red");
        wrongAnswer_3Q10.setStyle("-fx-text-fill: red");
        wrongAnswer_2Q10.setStyle("-fx-text-fill: red");
        correctAnswer_Q10.setStyle("-fx-text-fill: green");
    }
    
}
