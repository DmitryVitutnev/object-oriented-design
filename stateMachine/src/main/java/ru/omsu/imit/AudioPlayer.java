package ru.omsu.imit;

public class AudioPlayer {

    private State state;
    private boolean playing;

    public AudioPlayer() {
        state = new ReadyState(this);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void clickLock() {
        state.clickLock();
    }

    public void clickPlay() {
        state.clickPlay();
    }

    public void clickNext() {
        state.clickNext();
    }

    public void clickPrevious() {
        state.clickPrevious();
    }


    public boolean isPlaying() {
        return playing;
    }


    public void startPlayback() {
        playing = true;
        System.out.println("Start playback");
    }

    public void stopPlayback() {
        playing = false;
        System.out.println("Stop playback");
    }

    public void nextSong() {
        System.out.println("Next song");
    }

    public void previousSong() {
        System.out.println("Previous song");
    }

    public void fastForward(int time) {
        System.out.println("Fast forwart " + time);
    }

    public void rewind(int time) {
        System.out.println("Rewind " + time);
    }


}
