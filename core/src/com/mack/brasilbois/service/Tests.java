package com.mack.brasilbois.service;

import com.mack.brasilbois.BrBoisMain;
import com.mack.brasilbois.enums.SizePositionValues;
import com.mack.brasilbois.model.Card;

import java.util.Random;
import java.util.Stack;

public class Tests {



    public static void main(String args[]){
        int a = 3;
        float mult = 1.5f;
        int result = (int) (a * mult);
        System.out.println(result);
    }


    //returns a test Deck
    public static  Stack<Card> getTestDeck(int cardTotal,boolean enemy){
        Stack<Card> ret = new Stack<Card>();


        for (int i= 0;i<cardTotal;i++){
            Card c ;
            Random rand =  new Random();
            int allCardsCount = BrBoisMain.allCards.size();
            c = BrBoisMain.allCards.get(rand.nextInt(allCardsCount)).getCopy();

            if(enemy) {
                c.setxPos(SizePositionValues.ENEMY_GRIMORIO_X);
                c.setyPos(SizePositionValues.ENEMY_GRIMORIO_Y);

            }else{
                c.setxPos(SizePositionValues.FRIENDLY_GRIMORIO_X);
                c.setyPos(SizePositionValues.FRIENDLY_GRIMORIO_Y);
            }

            ret.push(c);
        }
        return ret;
    }

}