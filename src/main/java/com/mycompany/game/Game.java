/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Game {

   public static void main(String[] args) {

          System.out.println("MENU");
        System.out.println("----");
        System.out.println("1: Guess the number");
        System.out.println("2: Guess the alphabet");
        System.out.println("3: High score");
        System.out.println("4: Credit");
        System.out.println("5: Exit");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int menu = input.nextInt();

       while (menu != 5) {
           
            
                  if(menu==1){ 
                      number();
                  }
                  else if(menu==2){
                      alphabet();
                  }
                   else if(menu==4){
            Credit();
        }
        else if(menu==5){
           exit();
        }
        else if(menu>5){
            System.out.println("invalid value"); 
            finish();
        }
    }
    }
        public static int count=0;
        public static int count1=0;
    public static void Score() {
       System.out.println("HIGH SCORE: \n--------------");
                System.out.println("the best number score: " + count);
               System.out.println("the best alphabet score: " + count1); 
                     finish();
  }
    public static void number() {
      
        System.out.println("Start Menu: ");
                    System.out.println("----------");
                    System.out.println("Select a difficulty level\n1: Easy\n2: Medium\n3: Hard\n4: Return to main menu");
                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter your choice: ");
                    int num1 = input.nextInt();

                    if (num1 == 1) {

                        Random rand = new Random();
                        int num = rand.nextInt(16) + 1;
                        System.out.println("Instructions: ");
                        System.out.println("1: guess the number based on the given range");
                        System.out.println("2: you are allowed to make one guess at a time");
                        System.out.println("3: each game has 5 chances to guess the correct number");
                        System.out.println("4: once you have used up all your chances, you lose the game");

                        int i = 5;
                        while (i != 0) {
                            System.out.println("Enter the guess number from 1 to 15. " + i + " chances left");
                            int n = input.nextInt();
                            if (n > num) {
                                System.out.println("wrong! your guess was too high");
                                i--;
                                
                            } else if (n < num) {
                                System.out.println("wrong your guess was too low ");
                                i--;
                                
                            } else if (n == num) {
                                System.out.println("correct! you won");
                                count++;
                                break;
                            }
                            else{
                                System.out.println("you lost the game");
                                break;
                            }
                             
                      }
                      
                    }

                   else if (num1 == 2) {
                        Random rand = new Random();
                        int num = rand.nextInt(21) + 1;
                        System.out.println("Instructions: ");
                        System.out.println("1: guess the number based on the given range");
                        System.out.println("2: you are allowed to make one guess at a time");
                        System.out.println("3: each game has 4 chances to guess the correct number");
                        System.out.println("4: once you have used up all your chances, you lose the game");

                        int i = 4;
                        while (i != 0) {
                            System.out.println("Enter the guess number from 1 to 20. " + i + " chances left");
                            int n = input.nextInt();
                            if (n > num) {
                                System.out.println("wrong! your guess was too high");
                                i--;
                              
                            } else if (n < num) {
                                System.out.println("wrong your guess was too low ");
                                i--;
                               
                            } else if (n == num) {
                                System.out.println("correct! you won");
                                count++;
                                break;
                            }
                            else{
                               System.out.println("you lost!"); 
                               break;
                            }
                          
                        }
                     
                    }
                    
                    
                    else if (num1 == 3) {
                        Random rand = new Random();
                        int num = rand.nextInt(41) + 1;
                        System.out.println("Instructions: ");
                        System.out.println("1: guess the number based on the given range");
                        System.out.println("2: you are allowed to make one guess at a time");
                        System.out.println("3: each game has 3 chances to guess the correct number");
                        System.out.println("4: once you have used up all your chances, you lose the game");

                        int i = 3;
                        while (i != 0) {
                            System.out.println("Enter the guess number from 1 to 40. " + i + " chances left");
                            int n = input.nextInt();
                            if (n > num) {
                                System.out.println("wrong! your guess was too high");
                                i--;
                              
                            } else if (n < num) {
                                System.out.println("wrong your guess was too low ");
                                i--;
                               
                            } else if (n == num) {
                                System.out.println("correct! you won");
                                count++;
                                break;
                            }
                            else{
                              System.out.println("you lost!"); 
                              break;
                            }
                             
                        }
                    
                    }
                    else if (num1 == 4) {
                      finish();
                    }
                  
    }
    public static void alphabet() {
        {
                  
                    System.out.println("Start Menu: ");
                    System.out.println("----------");
                    System.out.println("Select a difficulty level\n1: Easy\n2: Medium\n3: Hard\n4: Return to main menu");
                       Scanner input = new Scanner(System.in);
                    System.out.println("Enter your choice: ");
                    int num2 = input.nextInt();

                    if (num2 == 1) {
                        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
                        Random random = new Random(vowel.length);
                        int c = random.nextInt(vowel.length);
                        System.out.println("Instructions: ");
                        System.out.println("1: guess the vowel letter");
                        System.out.println("2: you are allowed to make one guess at a time");
                        System.out.println("3: each game has 2 chances to guess the correct vowel");
                        System.out.println("4: once you have used up all your chances, you lose the game");
                        int i = 2;
                        while (i != 0) {
                            System.out.println("Enter the guess vowel letter . " + i + " chances left");
                            char c1 = input.next().charAt(0);
                            if (c1 == vowel[c]) {
                                System.out.println("correct! you won!");
                                count1++;
                                break;
                            } else if(c1!= vowel[c]) {
                                System.out.println("wrong!" );
                                i--;
                           
                        }else{
                            System.out.println("you lost the game");   
                            break;
                            }
                            
                       }
                       
                        }
                    
                   else if (num2 == 2) {
                     char[] constant = {'b', 'c', 'd', 'f', 'g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
                        Random random = new Random(constant.length);
                        int c = random.nextInt(constant.length);

                        System.out.println("Instructions: ");
                        System.out.println("1: guess the constant letter");
                        System.out.println("2: you are allowed to make one guess at a time");
                        System.out.println("3: each game has 4 chances to guess the correct letter");
                        System.out.println("4: once you have used up all your chances, you lose the game");
                        int i = 4;
                        while (i != 0) {
                            System.out.println("Enter the guess letter from 'b' to 'z'. " + i + " chances left");
                            char c1 = input.next().charAt(0);
                            if (c1 == constant[c]) {
                                System.out.println("correct! you won!");
                                count1++;
                                break;
                        } else if (c1 != constant[c]) {
                                System.out.println("wrong!");
                                i--;
                               
                            } else{
                                System.out.println("you lost the game");
                                break;
                            }
                          
                    }
                        
                    }
                   else if (num2 == 3) {
                        Random r = new Random();
                        char c = (char) (r.nextInt(26) + 'a');

                        System.out.println("Instructions: ");
                        System.out.println("1: guess alphabet");
                        System.out.println("2: you are allowed to make one guess at a time");
                        System.out.println("3: each game has 5 chances to guess the correct letter");
                        System.out.println("4: once you have used up all your chances, you lose the game");
                        int i = 5;
                        while (i != 0) {
                            System.out.println("Enter the guess letter from 'a' to 'z'. " + i + " chances left");
                            char c1 = input.next().charAt(0);
                            if (c1 < c) {
                                System.out.println("wrong! your guess was too low");
                                i--;
                                
                            } else if (c1 > c) {
                                System.out.println("wrong! your guess is too high");
                                i--;
                               
                            } else if (c1 == c) {
                                System.out.println("correct! you won!");
                                 count1++;
                                   break;
                            }else{
                                 System.out.println("you lost the game");
                                break;
                            }
                       
                        }
                            
                     }
                   else if (num2 == 4) {
                        finish();
                  }
       
        }
       }
   public static void Credit() {
         System.out.println("Student name: Aziza Urinboeva");
                    System.out.println("Student ID: 21020990");
                    System.out.println("Course of study: software engineering");
                      finish();
    }
    public static void exit() {
            System.exit(0);
    }
    public static void finish () {
       System.out.println("MENU");
        System.out.println("----");
        System.out.println("1: Guess the number");
        System.out.println("2: Guess the alphabet");
        System.out.println("3: High score");
        System.out.println("4: Credit");
        System.out.println("5: Exit");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int menu = input.nextInt(); 
        if(menu==3){
            Score();
        }
        else if(menu==2){
                alphabet();
                }
        else if(menu==1){
               number(); 
                }
        else if(menu==4){
            Credit();
        }
        else if(menu==5){
           exit();
        }
        else if(menu>5){
            System.out.println("invalid value"); 
        }
    }
    
}
        

