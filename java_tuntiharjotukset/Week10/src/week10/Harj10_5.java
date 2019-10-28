package week10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Harj10_5 {
	public static void main(String[] args) {
		
		String fileName = "files/harjoitus10_5.dat";
		FileOutputStream fout = null;
		DataOutputStream dout = null;
		FileInputStream in = null;
		DataInputStream input = null;
		
		try {
			fout = new FileOutputStream(fileName);
			dout = new DataOutputStream(fout);
			
			dout.writeUTF("Mikkö");
			dout.writeUTF("testaa");
			dout.writeUTF("datan");
			dout.writeUTF("kirjoitusta.");
			dout.writeDouble(21.2);
			dout.writeInt(1232312);
			dout.flush();
			dout.close();
			fout.close();
			
			in = new FileInputStream(fileName);
			input = new DataInputStream(in);
			
			System.out.println(input.readUTF());
			System.out.println(input.readUTF());
			System.out.println(input.readUTF());
			System.out.println(input.readUTF());
			System.out.println(input.readDouble());
			System.out.println(input.readInt());
//			while(input.available() > 0) {
//				input.
//				System.out.println(input.readUTF());
//			}

			input.close();
			in.close();
			
		} catch (IOException e) {
			System.out.println("Something wrong with opening file.");
		} 
	}
}
