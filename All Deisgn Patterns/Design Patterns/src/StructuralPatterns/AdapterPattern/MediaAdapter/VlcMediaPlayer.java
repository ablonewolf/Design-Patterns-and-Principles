package StructuralPatterns.AdapterPattern.MediaAdapter;

public class VlcMediaPlayer implements AdvanceMediaPlayer{
    private String fileName;

    public VlcMediaPlayer(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public void loadFileName(String fileName) {
        System.out.println("Loading the VLC file " + fileName + " to listen to.");
    }

    @Override
    public void listen() {
        System.out.println("Listening to the VLC file " + this.getFileName() + ".");
    }
}
