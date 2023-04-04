import java.io.*;
import java.util.LinkedList;

public class WorkFrequencyCounter {
    public WorkFrequencyCounter() {
    }

    LinkedList<String> ListOftext = new LinkedList<String>();
    LinkedList<String> UniqueWords = new LinkedList<String>();
    LinkedList<Integer> CountOfWords = new LinkedList<Integer>();
    BufferedReader reader;

    {
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\user\\IdeaProjects\\dataStructures\\src\\story"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    //fills with words from the sile
    public void  populateList() throws IOException {
        String line;

       while((line=reader.readLine()) != null){
           String[]  words = line.toLowerCase().split("[\\s\\p{Punct}]+");
           for (String s: words) {
                   ListOftext.add(s);
        }
       }
       reader.close();
    }
   // stores each word only one time
    public void getUniqueList() {
        for (String s : ListOftext) {
            if(!UniqueWords.contains(s))
                UniqueWords.add(s);
        }
    }

     int counter;
    // checks how often a word was used
    public void checkFrequency(){

        for (String a : UniqueWords) {
            counter = 0;
        for (String s: ListOftext) {
               if(a.equals(s)){
                   counter++;
               }
        }
            CountOfWords.add(counter);
        }
    }
   // print out the results
    public void printFrequency(){

        for (int i = 0; i<UniqueWords.size(); i++) {
            System.out.println("Word: " + UniqueWords.get(i) + " was used " + CountOfWords.get(i) + " times");

        }
    }

}
