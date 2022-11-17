package StructuralPatterns.AdapterPattern.MediaAdapter;

public class AdvanceMediaPlayerAdapter implements MediaPlayer{
    private AdvanceMediaPlayer advanceMediaPlayer;

    public AdvanceMediaPlayerAdapter(AdvanceMediaPlayer advanceMediaPlayer) {
        this.advanceMediaPlayer = advanceMediaPlayer;
    }

    public AdvanceMediaPlayer getAdvanceMediaPlayer() {
        return advanceMediaPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        this.getAdvanceMediaPlayer().loadFileName(fileName);
        this.getAdvanceMediaPlayer().listen();
    }
}
