import java.io.*;
import java.util.*;
/**
 * Encrypts and Decrypts binary and text
 * 
 * @author Nikhil Paranjape (Unguardedsnow)
 * @version April 5 2013 - v3.1.4
 * 
 * USE WITH COPYRIGHTS, nah you can use it, but my name should be in it
 */
public class BinaryEncrypter
{
    private static String saveName;
    public static void Binary() throws IOException
    {
        try{
            //x = scanner
            //y = sentence to convert
            Scanner x = new Scanner(System.in);
            System.out.println("Do you want to encrypt or decrypt binary");
            System.out.println("Type Encrypt or Decrypt");
            String choice = x.nextLine();
            if(choice.equalsIgnoreCase("Encrypt")){
                System.out.println("Enter a sentence");
                String y = x.nextLine();
                System.out.println('\f');
                Random rand = new Random();

                byte [] a = y.getBytes();
                StringBuilder b = new StringBuilder();
                //converts text to binary
                for (byte c :a)
                {
                    int per = c;
                    for (int i = 0; i < 8; i++)
                    {
                        b.append((per & 128) == 0 ? 0:1);
                        per <<= 1;
                    }
                    //adds two's compliment
                    b.append(' ');
                }
                //makes code look cooler
                Thread.sleep(2000);
                System.out.println('\f');
                Thread.sleep(1000);
                System.out.println("Encoding.");
                Thread.sleep(1000);
                System.out.println('\f');
                System.out.println("Encoding..");
                Thread.sleep(1000);
                System.out.println('\f');
                System.out.println("Encoding...");
                Thread.sleep(1000);
                System.out.println('\f');
                System.out.println("Encoding....");
                Thread.sleep(1000);
                System.out.println('\f');
                System.out.println("Encoding.....");
                Thread.sleep(1000);
                System.out.println('\f');
                System.out.println("Encoding......");
                Thread.sleep(900);
                System.out.println('\f');
                System.out.println("Encoding.......");
                Thread.sleep(800);
                System.out.println('\f');
                System.out.println("'" + y + "' to binary: " + b);
                try{
                    Thread.sleep(4000);
                    System.out.println('\f');
                }
                catch (Exception e){
                    System.out.println("CONGRATURLATIONS!");
                }
                System.out.println("Tell me if you want a normal file name, type normal, or type random for a random number filename");
                System.out.println("You can also type no to continue without saving");
                String fileName = x.nextLine();
                //filename is a random integer, then saved
                if(fileName.equalsIgnoreCase("random")){
                    int saveName = rand.nextInt(1000000000) + 1;
                    FileWriter outFile = new FileWriter(saveName + ".txt", true);       
                    try {
                        PrintWriter out1 = new PrintWriter(outFile);
                        try {
                            out1.append(b);
                            out1.println();
                        } finally {
                            out1.close();
                        }
                    }             finally {
                        outFile.close();
                    }
                    System.out.println("Your filename is called " + saveName + ".txt");
                }
                else if(fileName.equalsIgnoreCase("no")){
                    System.out.println("Continuing without saving!");
                }
                else{
                    String save = "" + b;
                    IO.saveFile(save);

                }

            }

            else if(choice.equalsIgnoreCase("Decrypt")){
                try {
                    Scanner scan  = new Scanner(System.in);
                    String text = IO.openFile();
                    System.out.println('\f');
                    Thread.sleep(1000);
                    System.out.println("Opening.");
                    Thread.sleep(1000);
                    System.out.println('\f');
                    System.out.println("Opening..");
                    Thread.sleep(1000);
                    System.out.println('\f');
                    System.out.println("Opening...");
                    Thread.sleep(1000);
                    System.out.println('\f');
                    System.out.println("Opening....");
                    Thread.sleep(1000);
                    System.out.println('\f');
                    System.out.println(text);
                    String output = "";
                    //removes spaces, spaces cause errors and doesn't convert with the spaces
                    String text2 = text.replaceAll(" ","");
                    //converts binary to text
                    for(int i = 0; i <= text2.length() - 8; i+=8)
                    {
                        int k = Integer.parseInt(text2.substring(i, i+8), 2);
                        output += (char) k;

                    } 
                    //This next part just makes it look cool

                    Thread.sleep(2000);
                    System.out.println('\f');
                    Thread.sleep(1000);
                    System.out.println("Decoding.");
                    Thread.sleep(1000);
                    System.out.println('\f');
                    System.out.println("Decoding..");
                    Thread.sleep(1000);
                    System.out.println('\f');
                    System.out.println("Decoding...");
                    Thread.sleep(1000);
                    System.out.println('\f');
                    System.out.println("Decoding....");
                    Thread.sleep(1000);
                    System.out.println('\f');
                    System.out.println("Decoding.....");
                    Thread.sleep(1000);
                    System.out.println('\f');
                    System.out.println("Decoding......");
                    Thread.sleep(900);
                    System.out.println('\f');
                    System.out.println("Decoding.......");
                    Thread.sleep(800);
                    System.out.println('\f');
                    Thread.sleep(1000);
                    System.out.println("Decoded Message:");
                    System.out.println(output);

                } 
                catch (Exception e) {
                    // TODO Auto-generated catch block
                    System.out.println("Error!: " + e);
                }
            }    
        }
        catch(Exception e){
            System.out.println("I AM ERROR!");
        }
    }
}