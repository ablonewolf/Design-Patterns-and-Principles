package DesignPatterns.StructuralPatterns.AdapterPattern.MediaAdapter;

public class MediaPlayerDemo {
	public static void main(String[] args) {
		MediaPlayer player = new AudioPlayer();
		player.play("mp3", "Holiday");
		AdvanceMediaPlayer mediaPlayer = new VlcMediaPlayer("Fireflies");
		player = new AdvanceMediaPlayerAdapter(mediaPlayer);
		player.play("vlc", mediaPlayer.getFileName());
		player = new AudioPlayer();
		player.play("vlc", mediaPlayer.getFileName());
		mediaPlayer = new Mp4MediaPlayer("Girls like you");
		player = new AdvanceMediaPlayerAdapter(mediaPlayer);
		player.play("Mp4", mediaPlayer.getFileName());
	}
}
