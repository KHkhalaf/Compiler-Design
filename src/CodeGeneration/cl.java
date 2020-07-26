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

public class cl{
         public String initials;
         public double year;
         public double count;
         public String path  = "samples//cl.csv";
         public String format =  "csv";
         public static List<cl> DataRows;

         private List<cl> loadCsvFile(){
         BufferedReader br = null; 
         List<cl> list = new ArrayList<>();
         String line = "";  
         String splitBy = ",";  cl o;
 try {
        br = new BufferedReader(new FileReader(path)); 
          while ((line = br.readLine()) != null)  
           {  
           String[] row = line.split(splitBy);
           o = new cl();
           o.initials= row[0] ;
           o.year= Double.parseDouble(row[1]) ;
           o.count= Double.parseDouble(row[2]) ;
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
          private List<cl> loadJsonFile() throws FileNotFoundException, JSONException { loadJsonFile loadJsonFile = new loadJsonFile();
        JsonParser jsonParser = new JsonParser();
        Object object = jsonParser.parse(new FileReader(path));
        String inpuString = object.toString();
        JSONObject inputjson = new JSONObject(inpuString);
        List<cl> list = new ArrayList<>();
List<String>initialss  = loadJsonFile.getKey(inputjson,"initials", new ArrayList<>());
List<String>years = loadJsonFile.getKey(inputjson,"year", new ArrayList<>());
List<String>counts = loadJsonFile.getKey(inputjson,"count", new ArrayList<>());
 for (int i = 0; i <counts.size(); i++) {
cl tmp = new cl();
           tmp.initials= initialss.get(i);
           tmp.year= Double.parseDouble(years.get(i)) ;
           tmp.count= Double.parseDouble(counts.get(i)) ;
list.add(tmp);
}
return list;
   }
       public List<cl> getData() throws FileNotFoundException, JSONException{
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