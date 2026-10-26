import java.util.*;

public class ShreyasChannel {
    String videoTitle;
    String videofileName;
    List<YoutubeScriber> subscriberList=new ArrayList<>();


    public void subscriber(YoutubeScriber youtubeScriber){
        subscriberList.add(youtubeScriber);
    }

    public void notifySubscribers(){
        for(YoutubeScriber subscribers:subscriberList){
            subscribers.update(videoTitle,videofileName);
        }
    }

    public void UploadVideo(String videoTitle,String videofileName){
        this.videoTitle=videoTitle;
        this.videofileName=videofileName;
        System.out.println("Video has been Uploaded");
        notifySubscribers();
    }

    
}