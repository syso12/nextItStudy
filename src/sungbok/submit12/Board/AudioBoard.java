package sungbok.submit12.Board;

public class AudioBoard extends Board {
    private String audio;

    public AudioBoard() {
        super();
    }

    public AudioBoard(int num, String title, String day, String audio) {
        this.audio = audio;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    ;
}