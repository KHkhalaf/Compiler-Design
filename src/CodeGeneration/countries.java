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

public class countries{
         public double id;
         public String name;
         public String code;
         public String post_code;
         public String region;
         public String path  = "samples//countries.json";
         public String format =  "json";
         public static List<countries> DataRows;

         private List<countries> loadCsvFile(){
         BufferedReader br = null; 
         List<countries> list = new ArrayList<>();
         String line = "";  
         String splitBy = ",";  countries o;
 try {
        br = new BufferedReader(new FileReader(path)); 
          while ((line = br.readLine()) != null)  
           {  
           String[] row = line.split(splitBy);
           o = new countries();
           o.id= Double.parseDouble(row[0]) ;
           o.name= row[1] ;
           o.code= row[2] ;
           o.post_code= row[3] ;
           o.region= row[4] ;
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
          private List<countries> loadJsonFile() throws FileNotFoundException, JSONException { loadJsonFile loadJsonFile = new loadJsonFile();
        JsonParser jsonParser = new JsonParser();
        Object object = jsonParser.parse(new FileReader(path));
        String inpuString = object.toString();
        JSONObject inputjson = new JSONObject(inpuString);
        List<countries> list = new ArrayList<>();
List<String>ids = loadJsonFile.getKey(inputjson,"id", new ArrayList<>());
List<String>names  = loadJsonFile.getKey(inputjson,"name", new ArrayList<>());
List<String>codes  = loadJsonFile.getKey(inputjson,"code", new ArrayList<>());
List<String>post_codes  = loadJsonFile.getKey(inputjson,"post_code", new ArrayList<>());
List<String>regions  = loadJsonFile.getKey(inputjson,"region", new ArrayList<>());
 for (int i = 0; i <ids.size(); i++) {
countries tmp = new countries();
           tmp.id= Double.parseDouble(ids.get(i)) ;
           tmp.name= names.get(i);
           tmp.code= codes.get(i);
           tmp.post_code= post_codes.get(i);
           tmp.region= regions.get(i);
list.add(tmp);
}
return list;
   }
       public List<countries> getData() throws FileNotFoundException, JSONException{
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