package net.phreebie;

public class WordLet {
    private Relation left;
    private Word word;
    private Relation right;

    public Relation getLeft() {
        return left;
    }

    public void setLeft(Relation left) {
        this.left = left;
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public Relation getRight() {
        return right;
    }

    public void setRight(Relation right) {
        this.right = right;
    }
}
