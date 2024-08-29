public class AudioBook extends Book {
    private int runtime;
    private String voiceOver;

    AudioBook(String title, String author, int runtime, String voiceOver) {
        super(title, author, 0);

        this.runtime = runtime;
        this.voiceOver = voiceOver;
    }

    // runtime getter function
    public int getRuntime() {
        return this.runtime;
    }

    // voice over getter function
    public String getVoiceOver() {
        return this.voiceOver;
    }
}
