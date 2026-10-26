/**
 * YoutubeScriber
 */
public class YoutubeScriber {
    private String name;
    private int id;


    public YoutubeScriber(String name,int id){
        this.name=name;
        this.id=id;
    }

    public void update(String videoTitle,String videofileName){
        System.out.println("Upload Video: Received Notification " + videoTitle + " filename " + videofileName);
    }

    
}