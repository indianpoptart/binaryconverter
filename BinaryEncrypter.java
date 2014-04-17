import java.util.Scanner;
/**
 * Encrypts and Decrypts binary and text
 * 
 * @author Nikhil Paranjape (indianpoptart)
 * @version April 17 2014 - v3.1.5
 * 
 * PLEASE ADD THE ABOVE STATEMENTS IF YOU WANT TO USE THIS CODE AS YOUR OWN
 */
public class BinaryEncrypter
{
	public String encrypt(String y){
		Scanner x = new Scanner(System.in);
		y = x.nextLine();
		System.out.println('\f');
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
		return y;
	}
	public String decrypt(String text){
		Scanner scan  = new Scanner(System.in);
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
		return output;
	}
}
