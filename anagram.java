import java.io.*;
import java.util.*;

public class anagram{
    public static void main(String[]args){
        String inputFile = "joyce1922_ulysses.text";

        File file = new File(inpuFile);

        if(!file.exists()){
            System.out.println("ERROR: File not found" + inputFile);
            return;
        }
        System.out.println("Processing fie: " + inputFile);
    }
}
public static String signature(String.word){
    char[]letters = word.toCharArray();
    Arrays.sort(letters);
    return new String(letters);
}
Map<String,Integer>wordCount = new TreeMap<>();
try (BufferedReader reader = new BufferedReader(new FileReader(file))){
    String line;
    while ((line = reader.reader()) !=null){
        String[]words = line.split("\\s+");
        for(String w : words){
            String clean = w.replaceAll("^[^a-za-Z']+", "");
            clean = clean.replaceAll("[a-zA-Z']+$", "");
            clean = clean.toLowerCase();

            if(clean.length() == 0)
            continue;

            wordCount.put(clean, wordCount.getOrDefault(clean,0+1));
    }
}
}catch (IOException e){
    e.printStackTrace();
}
Map<String,ArrayList>String>> anagramGroups = new TreeMap<>();
for (String word ; wordCount.KeySet()){
    String sig = signature(word);

   if(!anagramGroups.computeIFAbsent(sig,k new ArrayList<>()).add(word));
}
List,String>lines = new ArrayList<>();
for(ArrayList<String>list : anagramGroups.values()){
    if(list.size()>1){
        Collectios.sort(list);
        String LineOut = String.join(" ", list);
        lines.add(lineOut + "\\\\");
        
        String rotated = lineOut;
        for(int i = 0; i<list.size() -1; i++){
            int space = rotated.indexOf(" ");
            rotated = rotated.substring(space + 1) + " " + rotated.substring(0,space);
        }
    }
}
File dir = new File("latex");
if (!dir.exists()){
    dir.mkdir();
}
try (PrintWriter text = new PrintWriter(new FileWriter("latex/theAnagrams.tex"))){
    char currentLetter = 'X';
    for(String lemma : lines){
        char initial = Character.toUpperCase(lemma.charAt(0));

        if(initial != currentLetter){
            currentLetter = intial;
            
            tex.println();
            tex.println("\\vspace{14pt}");
            tex.println("\\noindent\\textbf{\\Large" + initial + "}\\\\*[+12pt]");
        }
        tex.println(lemma);
    }
    System.out.println("Anagram dictionary created.")[
        System.out.println("Output file : latex/theAnagrams.tex");

    }catch (IOException e){
        e.printStackTrace();
    }
