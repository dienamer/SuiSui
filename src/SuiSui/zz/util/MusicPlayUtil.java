package SuiSui.zz.util;

import SuiSui.zz.dao.SongDao;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MusicPlayUtil {

    private  List<SongDao> song_list;
    private  File song_file;
    public   MusicPlayUtil(){
        song_list=new ArrayList<>();
        song_file=new File("resources/song/songs.txt");
    }
    public   List<SongDao> getSongList() throws IOException {
        BufferedReader read = new BufferedReader(new FileReader(song_file));;
        String song_name=null;
        String song_number=null;
        int len=1;
        while((song_name=read.readLine())!=null)
        {
            song_number=Integer.toString(len);
            SongDao song = new SongDao(song_name,song_number);
            song_list.add(song);
            len++;


        }
        return song_list;
    }
}
