package StructuralPatterns.AdapterPattern.MediaAdapter;

public interface AdvanceMediaPlayer {
    public String getFileName();
    public void loadFileName(String fileName);
    public void listen();
}
