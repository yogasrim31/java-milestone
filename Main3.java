import java.util.Scanner;
public class Main3
{
    public static void main(String[] args) 
    {
        String[] words = { "HTML", "Python", "JavaScript", "PHP", "CSS" };
        for(int i = 0; i < 4; ++i) {
            for (int j = i + 1; j < 5; ++j) {
                if (words[i].compareTo(words[j]) > 0) 
                {
                     String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println("In lexicographical order:");
        for(int i = 0; i < 5; i++) {
            System.out.println(words[i]);
        }
    }
}