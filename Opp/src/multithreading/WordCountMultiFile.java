package multithreading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountMultiFile extends Thread {
    private String filename;

    public WordCountMultiFile(String filename) {
        this.filename = filename;
    }

    @Override
    public void run() {
        int wordCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File: " + filename + " - Word Count: " + wordCount);
    }

    public static void main(String[] args) throws InterruptedException {
        WordCountMultiFile wc1 = new WordCountMultiFile("C:/Users/DAC/Desktop/java/input1.txt");
        WordCountMultiFile wc2 = new WordCountMultiFile("C:/Users/DAC/Desktop/java/input2.txt");
        WordCountMultiFile wc3 = new WordCountMultiFile("C:/Users/DAC/Desktop/java/input3.txt");

        wc1.start();
        wc2.start();
        wc3.start();

        System.out.println("All files have been processed.");
    }
}
