package DesignPatterns.StructuralPatterns.AdapterPattern.MediaAdapter;

public class AdvanceMediaPlayerAdapter implements MediaPlayer {

	private final AdvanceMediaPlayer advanceMediaPlayer;

	public AdvanceMediaPlayerAdapter(AdvanceMediaPlayer advanceMediaPlayer) {
		this.advanceMediaPlayer = advanceMediaPlayer;
	}

	private AdvanceMediaPlayer getAdvanceMediaPlayer() {
		return advanceMediaPlayer;
	}

	@Override
	public void play(String audioType, String fileName) {
		this.getAdvanceMediaPlayer().loadFileName(fileName);
		this.getAdvanceMediaPlayer().listen();
	}
}
