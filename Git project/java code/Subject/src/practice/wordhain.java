package practice;

import java.util.ArrayList;
import java.util.List;

public class wordhain {
    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        String[] s ={"hot","dot","dog","lot","log","cog"};
        List<String> wordList = new ArrayList<String>();
        for(String word : s){
          wordList.add(word);
        }
        Wordchain method = new Wordchain();
        List<List<String>> result = new ArrayList<>();
        result = method.findLadders(beginWord, endWord, wordList);
        System.out.print(result);
    }
}