package exercise01;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVLC(String fileName) {
        //nothing
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing MP4 file - "+fileName);
    }
}
