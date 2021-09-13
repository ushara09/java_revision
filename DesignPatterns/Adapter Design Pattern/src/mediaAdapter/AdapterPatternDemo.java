package mediaAdapter;

public class AdapterPatternDemo {

    public static void main(String args[]){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","Coconut Tree");
        audioPlayer.play("vlc","Diamonds");
        audioPlayer.play("mp4","Broken Heart");
        audioPlayer.play("vhs","Bath ka iwarai");
    }

}
