package CodeGeneration;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.json.JSONException;
import org.json.JSONObject;
import CodeGeneration.loadJsonFile;

public class songs{
         public String initials;
         public String track_id;
         public String artist_name;
         public String title;
         public double loudness;
         public double tempo;
         public double time_signature;
         public double key;
         public double mode;
         public double duration;
         public double year;
         public String path  = "samples//songs.csv";
         public String format =  "csv";
         public static List<songs> DataRows;

         private List<songs> loadCsvFile(){
         BufferedReader br = null; 
         List<songs> list = new ArrayList<>();
         String line = "";  
         String splitBy = ",";  songs o;
 try {
        br = new BufferedReader(new FileReader(path)); 
          while ((line = br.readLine()) != null)  
           {  
           String[] row = line.split(splitBy);
           o = new songs();
           o.initials= row[0] ;
           o.track_id= row[1] ;
           o.artist_name= row[2] ;
           o.title= row[3] ;
           o.loudness= Double.parseDouble(row[4]) ;
           o.tempo= Double.parseDouble(row[5]) ;
           o.time_signature= Double.parseDouble(row[6]) ;
           o.key= Double.parseDouble(row[7]) ;
           o.mode= Double.parseDouble(row[8]) ;
           o.duration= Double.parseDouble(row[9]) ;
           o.year= Double.parseDouble(row[10]) ;
           list.add(o);
          }
         }         catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }catch (IOException e) {
         e.printStackTrace();
         }
         return list;
   }
          private List<songs> loadJsonFile() throws FileNotFoundException, JSONException { loadJsonFile loadJsonFile = new loadJsonFile();
        JsonParser jsonParser = new JsonParser();
        Object object = jsonParser.parse(new FileReader(path));
        String inpuString = object.toString();
        JSONObject inputjson = new JSONObject(inpuString);
        List<songs> list = new ArrayList<>();
List<String>initialss  = loadJsonFile.getKey(inputjson,"initials", new ArrayList<>());
List<String>track_ids  = loadJsonFile.getKey(inputjson,"track_id", new ArrayList<>());
List<String>artist_names  = loadJsonFile.getKey(inputjson,"artist_name", new ArrayList<>());
List<String>titles  = loadJsonFile.getKey(inputjson,"title", new ArrayList<>());
List<String>loudnesss = loadJsonFile.getKey(inputjson,"loudness", new ArrayList<>());
List<String>tempos = loadJsonFile.getKey(inputjson,"tempo", new ArrayList<>());
List<String>time_signatures = loadJsonFile.getKey(inputjson,"time_signature", new ArrayList<>());
List<String>keys = loadJsonFile.getKey(inputjson,"key", new ArrayList<>());
List<String>modes = loadJsonFile.getKey(inputjson,"mode", new ArrayList<>());
List<String>durations = loadJsonFile.getKey(inputjson,"duration", new ArrayList<>());
List<String>years = loadJsonFile.getKey(inputjson,"year", new ArrayList<>());
 for (int i = 0; i <years.size(); i++) {
songs tmp = new songs();
           tmp.initials= initialss.get(i);
           tmp.track_id= track_ids.get(i);
           tmp.artist_name= artist_names.get(i);
           tmp.title= titles.get(i);
           tmp.loudness= Double.parseDouble(loudnesss.get(i)) ;
           tmp.tempo= Double.parseDouble(tempos.get(i)) ;
           tmp.time_signature= Double.parseDouble(time_signatures.get(i)) ;
           tmp.key= Double.parseDouble(keys.get(i)) ;
           tmp.mode= Double.parseDouble(modes.get(i)) ;
           tmp.duration= Double.parseDouble(durations.get(i)) ;
           tmp.year= Double.parseDouble(years.get(i)) ;
list.add(tmp);
}
return list;
   }
       public List<songs> getData() throws FileNotFoundException, JSONException{
           if(DataRows== null){
if(format.toUpperCase().equals("CSV"))
           DataRows= loadCsvFile();
else if (format.toUpperCase().equals("JSON"))
           DataRows= loadJsonFile();
else 
System.out.println("ERROR FORMAT FILE NOT SUPPORT *_*");           }
           return DataRows;
          }
}