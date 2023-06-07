package classes;

public enum Type {

    SELF_HELP("Self Help"),
    SCIENCE_FICTION("Science Fiction"),
    NOVEL("Novel");

    private String prettyPrint;

    Type(String prettyPrint) {
        this.prettyPrint = prettyPrint;
    }

    @Override
    public String toString() {
        return prettyPrint;
    }
}
