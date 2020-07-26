package CodeGeneration;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;
import java.util.List;

public class loadJsonFile {

    public static void parseObject(JSONObject json, String key) {
        try {
            System.out.println(json.get(key));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static List<String> getKey(JSONObject json, String key, List<String> l) throws JSONException {
        boolean exists = json.has(key);


        //  l.add("raeed");
        Iterator<?> keys;
        String nextKey;

        if (!exists) {
            keys = json.keys();
            while (keys.hasNext()) {
                nextKey = (String) keys.next();
                try {
                    if (json.get(nextKey) instanceof JSONObject) {
                        if (exists == false) {
                            getKey(json.getJSONObject(nextKey), key, l);
                        }

                    } else if (json.get(nextKey) instanceof JSONArray) {
                        JSONArray jsonArray = json.getJSONArray(nextKey);
                        for (int i = 0; i < jsonArray.length(); i++) {
                            String jsonarrayString = jsonArray.get(i).toString();
                            JSONObject innerJson = new JSONObject(jsonarrayString);
                            if (exists == false) {
                                getKey(innerJson, key, l);
                            }
                        }
                    }
                } catch (Exception e) {

                }
            }

        } else {
            String s = json.get(key).toString();

            l.add(s);
        }
        return l;
    }

    public static String getKey(JSONObject json, String key,String s) throws JSONException {
        boolean exists = json.has(key);

        Iterator<?> keys;
        String nextKey;

        if (!exists) {
            keys = json.keys();
            while (keys.hasNext()) {
                nextKey = (String) keys.next();
                try {
                    if (json.get(nextKey) instanceof JSONObject) {
                        if (exists == false) {
                            getKey(json.getJSONObject(nextKey), key,s);
                        }

                    } else if (json.get(nextKey) instanceof JSONArray) {
                        JSONArray jsonArray = json.getJSONArray(nextKey);
                        for (int i = 0; i < jsonArray.length(); i++) {
                            String jsonarrayString = jsonArray.get(i).toString();
                            JSONObject innerJson = new JSONObject(jsonarrayString);
                            if (exists == false) {
                                getKey(innerJson, key,s);
                            }

                        }
                    }
                } catch (Exception e) {

                }

            }

        } else {
            s=json.get(key).toString();
        }
        return s;
    }
}
