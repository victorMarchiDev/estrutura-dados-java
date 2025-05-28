package com.github.victorMarchiDev;


import java.util.HashSet;
import java.util.Set;

/*
 * Dado um metodo que recebe uma string, comprovar se todos os caracteres sao unicos ou nao
 *
 * isUnique("abcde") => true;
 * isUnique("abcded") => false;
 */
public class IsUnique {

    private static final int NUMBER_OF_CHARS = 128;
    public static boolean isUnique(String s){
        if(s.length() > NUMBER_OF_CHARS) return false;

        Set<Character> characters = new HashSet<>();
        for(Character c : s.toCharArray()){
            if(characters.contains(c)) return false;
            characters.add(c);
        }
        return true;
    }
}
