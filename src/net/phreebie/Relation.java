package net.phreebie;

public class Relation {
    /**
     * Тип отношения
     */
    private RelType type;

    /**
     * Присутствует в первоначальном варианте
     */
    private boolean isOriginal;

    public RelType getType() {
        return type;
    }

    public void setType(RelType type) {
        this.type = type;
    }

    public boolean isOriginal() {
        return isOriginal;
    }

    public void setOriginal(boolean original) {
        isOriginal = original;
    }
}
