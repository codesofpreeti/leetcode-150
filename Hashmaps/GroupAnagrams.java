package Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs){
        if(strs==null|| strs.length==0){
            return new ArrayList<>();
        }
        Map<String,List<String>> mp= new HashMap<>();
        for(String s: strs){
            String freq= getFreq(s);
            if(mp.containsKey(freq)){
                mp.get(freq).add(s);
            }
            else {
                List<String> strList= new ArrayList<>();
                strList.add(s);
                mp.put(s, strList);
            }
        }
        return new ArrayList()<mp.values()>;
    }
    public String getFreq(String str){
        //create frequncy array
        int freq[]= new int[26];

        //array populated
        for(char c: str.toCharArray()){
            freq[c-'a']++;
        }
        //now create string out of this array
        StringBuilder ss= new StringBuilder();
        char c='a';
        for(int i:freq){
            ss.append(c);
            ss.append(i);
            c++;
        }
        return ss.toString();
    }
}
