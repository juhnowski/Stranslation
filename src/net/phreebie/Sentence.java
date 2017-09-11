package net.phreebie;

import java.util.LinkedList;

/**
 * Предложение
 */
public class Sentence {
    private LinkedList<WordLet> sentence = new LinkedList<>();

    public LinkedList<WordLet> getSentence() {
        return sentence;
    }

    public void setSentence(LinkedList<WordLet> sentence) {
        this.sentence = sentence;
    }

    public void print(){

        sentence.forEach((wl)->{
            System.out.println(wl.getWord());
        });

    };

}
