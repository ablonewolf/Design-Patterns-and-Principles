package StructuralPatterns.AdapterPattern.MediaAdapter;

public class Mp4MediaPlayer implements AdvanceMediaPlayer{
    private String fileName;

    public Mp4MediaPlayer(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public void loadFileName(String fileName) {
        System.out.println("Loading the MP4 file" + fileName + " to listen to.");
    }

    @Override
    public void listen() {
        System.out.println("Listening to the MP4 file " + this.getFileName() + ".");
    }
}
