import java.util.HashMap;

public class Hashmatique {
    public static void main(String[] args) {
        
        HashMap<String, String> trackList = new HashMap<String, String>();
        //        key    value
        
        // Using map.put(key : value), add in at least 4 songs that are stored by title.
        trackList.put("我不曾忘记", "我的破木香");
        trackList.put("離れ離れの聞き君へ", "あの空は戻らない");
        trackList.put("让风告诉你", "当你的天空突然 下起了大雨 那时我在为你炸乌云");
        trackList.put("Rubia", "Life blooms like a flower");
        
        // Pull out one of the songs by its track title.
        System.out.printf(">> Pulled-out track: %s\n\n", trackList.get("我不曾忘记")); // 我的破木香
        
        printTrackList(trackList);
    }
    
    // Prints out all the track names and lyrics in the format 'Track:  - Lyrics: '.
    public static void printTrackList(HashMap<String, String> trackList ) {
        for ( String key : trackList.keySet() ) {
            //                                key : args
            System.out.println( String.format("Track: %s - Lyrics: %s...", key, trackList.get(key)));
        }
    }
}
