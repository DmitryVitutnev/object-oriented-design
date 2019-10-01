package ru.omsu.imit;

import ru.omsu.imit.command.*;

public class AudioController {

    private AudioPlayer player;

    private Button playButton;
    private Button lockButton;
    private Button nextButton;
    private Button previousButton;
    private Button saveButton;
    private Button loadButton;


    public AudioController() {
        player = new AudioPlayer();

        playButton = new Button(()->{executeCommand(new PlayCommand());});
        lockButton = new Button(()->{executeCommand(new LockCommand());});
        nextButton = new Button(()->{executeCommand(new NextCommand());});
        previousButton = new Button(()->{executeCommand(new PreviousCommand());});
        saveButton = new Button(()->{executeCommand(new SaveCommand());});
        loadButton = new Button(()->{executeCommand(new LoadCommand());});

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

    public Button getSaveButton() {
        return saveButton;
    }

    public Button getLoadButton() {
        return loadButton;
    }

    private void executeCommand(ICommand command) {
        command.accept(player);
    }

}
