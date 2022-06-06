import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String line = br.readLine();
        String[] words = line.trim().split(" ");

        int k = Integer.parseInt(br.readLine());

        printTheStringArray(words,k);
    }

    private static void printTheStringArray(String[] words, int k) {
        if(words.length==0)
            System.out.println("[]");
        StringBuilder stringBuilder = null;
        ArrayList<String> finalArray=new ArrayList<>();
        for(int i=0;i< words.length;i++){
            if (words[i].length() > k)
                System.out.println("[ ]");
            if (stringBuilder == null)
                stringBuilder = new StringBuilder(words[i]);
            else if (stringBuilder.length() + words[i].length() + 1 <= k)
                stringBuilder.append(' ').append(words[i]);
            else {
                finalArray.add(stringBuilder.toString());
                stringBuilder = new StringBuilder(words[i]);
            }
        }
        if(stringBuilder!=null)
            finalArray.add(stringBuilder.toString());

        System.out.println(finalArray);
    }
}