
package spellchecker;

import java.io.*;
import java.util.*;

public class SpellChecker {
    
    public ArrayList<String> spell(String filename) throws FileNotFoundException, IOException {
        ArrayList<String> checkedWords= new ArrayList<String>();
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String input=null;
            while((input = bufferedReader.readLine()) != null) {
                String line[] = input.split("\\P{L}+");
                for(int i=0; i<line.length;i++)
                {
                    if(line[i].length()<=1){
                        continue;
                    }
                    checkedWords.add(line[i]);
                }
            }   
            bufferedReader.close();                 
            return checkedWords;
    }

    public void printNonDuplicates(ArrayList<String> ListOfWordsNotFound) {
        for(int i=0;i<ListOfWordsNotFound.size();i++){
            System.out.println(ListOfWordsNotFound.get(i));
        }
    }

    public boolean inDictionary(String word, ArrayList<String> dictionary) {
	boolean found=false;
        for(String inputWords:dictionary){
            if(inputWords.equals(word)){
                found=true;
            }
        }
        return found;
    }

    public static void main(String[] args) throws IOException {
        
        
      Scanner scanner = new Scanner( System.in );
      ArrayList<String> boinkWords= new ArrayList<String>();
      ArrayList<String> dictonaryWords= new ArrayList<String>();
      ArrayList<String> misspelledWords= new ArrayList<String>();
      
      
      
      System.out.println("Enter the name of the file (for example: a.txt)");
      
      String fname = scanner.nextLine();
      SpellChecker sc = new SpellChecker();
      boinkWords=sc.spell(fname);

      System.out.println("Enter the name of the dictionary file");
      String dfname = scanner.nextLine();
      dictonaryWords=sc.spell(dfname);
      
      for(String eachWord:boinkWords){      
          if(!sc.inDictionary(eachWord, dictonaryWords))
              misspelledWords.add(eachWord);
      }
      
      
     System.out.println("List of non duplicateswords"); 
     sc.printNonDuplicates(misspelledWords);
      
    }
}
