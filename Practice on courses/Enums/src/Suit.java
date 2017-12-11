public enum Suit {
    SPADE("\u2660"), DIAMOND("\u2666"), CLUB("\u2663"), HEART("\u2665");

    private String name;

    Suit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

