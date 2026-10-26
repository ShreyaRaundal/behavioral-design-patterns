class Main{
    public static void main(String[] args) {
        YoutubeScriber subscriber1=new YoutubeScriber("Shreya",1);
        YoutubeScriber subscriber2=new YoutubeScriber("Shubham",2);
        YoutubeScriber subscriber3=new YoutubeScriber("Samruddhi",3);
        YoutubeScriber subscriber4=new YoutubeScriber("Sarthak",4);
        YoutubeScriber subscriber5=new YoutubeScriber("Shreyash",5);
        YoutubeScriber subscriber6=new YoutubeScriber("diksha",6);

        ShreyasChannel sc=new ShreyasChannel();
        sc.subscriber(subscriber1);
        sc.subscriber(subscriber2);
        sc.subscriber(subscriber3);
        sc.subscriber(subscriber5);
        sc.subscriber(subscriber4);

        sc.UploadVideo("Observer Pattern","Observer.mp4");


    }
}