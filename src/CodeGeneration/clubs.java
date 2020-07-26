package CodeGeneration;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


import CodeGeneration.*;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.json.JSONException;
import org.json.JSONObject;

public class clubs {
    public double id;
    public String name;
    public CodeGeneration.city city = new city();
    public String path = "samples//clubs.json";
    public String format = "json";
    public static List<clubs> DataRows;

    private List<clubs> loadCsvFile() {
        BufferedReader br = null;
        List<clubs> list = new ArrayList<>();
        String line = "";
        String splitBy = ",";
        clubs o;
        try {
            br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                String[] row = line.split(splitBy);
                o = new clubs();
                o.id = Double.parseDouble(row[0]);
                o.name = row[1];
                list.add(o);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    private List<clubs> loadJsonFile() throws FileNotFoundException, JSONException {
        loadJsonFile loadJsonFile = new loadJsonFile();
        JsonParser jsonParser = new JsonParser();
        Object object = jsonParser.parse(new FileReader(path));
        String inpuString = object.toString();
        JSONObject inputjson = new JSONObject(inpuString);
        List<clubs> list = new ArrayList<>();
        List<String> ids = loadJsonFile.getKey(inputjson, "id", new ArrayList<>());
        List<String> names = loadJsonFile.getKey(inputjson, "name", new ArrayList<>());
        List<String> _ids = loadJsonFile.getKey(inputjson, "_id", new ArrayList<>());
        List<String> _names = loadJsonFile.getKey(inputjson, "_name", new ArrayList<>());
        List<String> __ids = loadJsonFile.getKey(inputjson, "__id", new ArrayList<>());
        List<String> __names = loadJsonFile.getKey(inputjson, "__name", new ArrayList<>());
        List<String> ___names = loadJsonFile.getKey(inputjson, "___name", new ArrayList<>());
        for (int i = 0; i < ids.size(); i++) {
            region region = new region();
            country country = new country();
            city tmpcity = new city();
            clubs tmp = new clubs();
            tmp.id = Double.parseDouble(ids.get(i));
            tmp.name = names.get(i);
            tmpcity._id = Double.parseDouble(_ids.get(i));
            tmpcity._name = _names.get(i);
            country.__id = Double.parseDouble(__ids.get(i));
            country.__name = __names.get(i);
            region.___name = ___names.get(i);
            country.region = region;
            tmpcity.country = country;
            tmp.city = tmpcity;
            list.add(tmp);
        }
        return list;
    }

    public List<clubs> getData() throws FileNotFoundException, JSONException {
        if (DataRows == null) {
            if (format.toUpperCase().equals("CSV"))
                DataRows = loadCsvFile();
            else if (format.toUpperCase().equals("JSON"))
                DataRows = loadJsonFile();
            else
                System.out.println("ERROR FORMAT FILE NOT SUPPORT *_*");
        }
        return DataRows;
    }
}