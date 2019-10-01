package ru.omsu.imit;

import ru.omsu.imit.command.*;

public class AudioController {

    private AudioPlayer player;

    private Button playButton;
    private Button lockButton;
    private Button nextButton;
    private Button previousButton;


    public AudioController() {
        player = new AudioPlayer();

        playButton = new Button(()->{executeCommand(new PlayCommand()); return null;});
        lockButton = new Button(()->{executeCommand(new LockCommand()); return null;});
        nextButton = new Button(()->{executeCommand(new NextCommand()); return null;});
        previousButton = new Button(()->{executeCommand(new PreviousCommand()); return null;});

    }

    public Button getPlayButton() {
        return playButton;
    }

    public Button getLockButton() {
        return lockButton;
    }

    public Button getNextButton() {
        return nextButton;
    }

    public Button getPreviousButton() {
        return previousButton;
    }

    private void executeCommand(ICommand command) {
        command.accept(player);
    }

}
