package StructuralPatterns.AdapterPattern.MediaAdapter;

public class AudioPlayer implements MediaPlayer{
    @Override
    public void play(String audioType, String fileName) {
        if(!audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Invalid file format, can't play it");
        }
        else {
            System.out.println("Playing " + audioType + " file. Name: " + fileName);
        }
    }
}
