import java.io.*;
public class fileop
{
    public static void main(String[] args)
    {
        try {
            BufferedWriter wr=new BufferedWriter(new FileWriter("myhobby.txt"));
            wr.write("My name is Jomon.\nAs of today, I have read many manhuas, manhwas, and a dozen or so books, light novels, and mangas.");
            wr.write("The journey has been amazing so far.\nBut it's becoming extremely hard to find time to read.\nLast year, I restarted reading light novels, and they had me hooked for too long (I am still not off the hook).");
            wr.write("One hour is the least I read every day.\nSometimes it goes up to ten hours.\nI mostly read on my phone.\nI found a really good reader application named 'Moon Reader' last year, and since then, I have been using it to read.");
            wr.write("Finding a physical book to read is hard since buying one is not an option because I'm broke.\nThe only option is borrowing, but that comes with its own disadvantages.");
            wr.write("There seems to be an invisible force making it hard for me to start reading a normal paper book, whereas I can read an e-book anytime.");
            wr.write("This reading habit has robbed me of sleep for over four years.\nThis year has been the worst of all—the average sleeping time is 2 o'clock.\nI have realized that it's affecting my health and eyesight pretty badly, yet I still can't stop for some reason.");
            wr.write("I feel like it has become more of a habit or addiction—maybe, I don't know for sure.\nAnyway, if you are reading this, thank you for listening to my thoughts about my messed-up hobby and health.\nI will leave you with a question: 'Don't you have anything better to do than reading my 1 o'clock self-talk that I'm writing for a program to perform a write operation in Java?'");
            wr.close();
    
            BufferedReader rr=new BufferedReader(new FileReader("myhobby.txt"));
            String line;
            System.out.println("content of the file");
            while((line=rr.readLine())!=null)
            {
                System.out.println(line);
            }
            rr.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        

    }
}