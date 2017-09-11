package net.phreebie;

import java.util.LinkedList;

/**
 * Строим предложение по строке
 */
public class SentenceBuilder {
    private LinkedList<String> sentence = new LinkedList<>();

    public LinkedList<String> getSentence() {
        return sentence;
    }

    public void setSentence(LinkedList<String> sentence) {
        this.sentence = sentence;
    }

    public void addString(String s){

        String[] tmp = s.split(" ");
        for(int i = 0; i<tmp.length; i++) {
            sentence.add(tmp[i]);
        }
    }

    public Sentence build(){
        Sentence sent = new Sentence();
        sentence.forEach((s) -> {
            Relation left = new Relation();
            if (sent.getSentence().size()==0) {
                left.setType(RelType.BEGIN);
            } else {
                left.setType(RelType.SPACE);
            }
            WordLet wl = new WordLet();
            wl.setWord(new Word(s, true));
            wl.setLeft(left);

            Relation right = new Relation();
            if(sent.getSentence().size() == getSentence().size()-1) {
                right.setType(RelType.END);
            } else {
                right.setType(RelType.SPACE);
            }
            wl.setRight(right);

            sent.getSentence().add(wl);
        });

        return  sent;
    }
}
