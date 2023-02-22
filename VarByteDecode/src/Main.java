import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Write the variable byte: ");
		String ans = keyboard.nextLine();
		char varByte[] = ans.toCharArray();
		
		String bin = "";
		if((varByte.length % 8) > 0 || (varByte[varByte.length - 8] == '0'))
			System.out.println("It is not VB coded!!!");
		else {
			for(int i=varByte.length - 1;i>=0;i--) {
				if((i != 0) && (i%8 > 0))
					bin = varByte[i] + bin;
			}
		}
		
		char temp[] = bin.toCharArray();
		String finalBin = "";
		boolean flag = false;
		for(int k=0;k<temp.length;k++) {
			if(temp[k] != '0')
				flag = true;
			if(flag)
				finalBin = finalBin + temp[k];
		}
		System.out.println("The integer is: " + Integer.parseInt(finalBin,2));
	}
}

