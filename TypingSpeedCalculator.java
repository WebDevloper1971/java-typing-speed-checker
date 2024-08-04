import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TypingSpeedCalculator {
    public static void main(String[] args) throws InterruptedException {
        String words = "The cat is awesome animal.";
        String word_list [] = words.split(" ");
        // System.out.println(Arrays.toString(word_list));

        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);

        System.out.println(words);

        System.out.println();

        double start = LocalTime.now().toNanoOfDay();

        Scanner scan = new Scanner(System.in);
        String user_words = scan.nextLine();

        double end = LocalTime.now().toNanoOfDay();
        double time_elapsed = end - start;
        double seconds = time_elapsed/Math.pow(10,9);

        // words per minute = ( total no. of words / length of word ) / 60 * seconds

        int total_num_of_words = words.length();
        int average_length_of_word = 5;

        int wpm = (int)((((double)total_num_of_words / average_length_of_word) / seconds)*60);

        String[] user_words_list = user_words.split(" ");
        
        System.out.println(Arrays.toString(user_words_list));

        double count = 0;

        for (int i = 0; i < word_list.length; i++){
            if (word_list[i].equals(user_words_list[i])){
                // System.out.println(word_list[i] + " == " + user_words_list[i]);
                count += 1;
            }
        }

        // System.out.println(count);

        double accuracy = (count / word_list.length)*100;

        System.out.println("Your Typing Speed is " + wpm + " wpm [words per minute]");
        System.out.println("Your accuracy is " + accuracy + "% .");
    }
}
