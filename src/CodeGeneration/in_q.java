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

public class in_q{
         public String path  = "path";
         public String format =  "";
         public static List<in_q> DataRows;

         private List<in_q> loadCsvFile(){
         BufferedReader br = null; 
         List<in_q> list = new ArrayList<>();
         String line = "";  
         String splitBy = ",";  in_q o;
         return list;
   }
          private List<in_q> loadJsonFile() throws FileNotFoundException, JSONException { loadJsonFile loadJsonFile = new loadJsonFile();
        JsonParser jsonParser = new JsonParser();
        Object object = jsonParser.parse(new FileReader(path));
        String inpuString = object.toString();
        JSONObject inputjson = new JSONObject(inpuString);
        List<in_q> list = new ArrayList<>();
return list;
   }
       public List<in_q> getData() throws FileNotFoundException, JSONException{
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