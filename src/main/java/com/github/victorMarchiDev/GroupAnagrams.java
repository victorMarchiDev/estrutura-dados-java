package com.github.victorMarchiDev;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] words){
        if (words == null || words.length == 0) return Collections.emptyList();
        Map<String, List<String>> anagramMap = buildAnagramMap(words);
        return new ArrayList<>(anagramMap.values());
    }

    private Map<String, List<String>> buildAnagramMap(String[] words){
        Map<String, List<String>> mapa = new HashMap<>();
        for(String word : words){
            String hash = getAnagramHash(word);
            if(!mapa.containsKey(hash)){
                mapa.put(hash, new ArrayList<>());
            }
            mapa.get(hash).add(word);
        }
        return mapa;
    }

    private String getAnagramHash(String s){
        int[] letterCount = new int[26];
        for(int c : s.toCharArray()){
            letterCount[c - 'a']++;
        }
        return Arrays.toString(letterCount);
    }
}
