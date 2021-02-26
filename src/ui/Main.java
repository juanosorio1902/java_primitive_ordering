package ui;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int cicle = 0;
		while(cicle<n) {
			String[]firstarray = br.readLine().split(" ");
			double[]array =new double[firstarray.length];
			for(int i=0; i<firstarray.length; i++) {
				array[i] = Double.parseDouble(firstarray[i]);
			}
			double c=0;
			double cnt=0;
		
			for(int i=0; i<array.length-1; i++) {
				for(int j=0; j<array.length-1-i; j++) {
					if(array[j]>array[j+1]) {
						double temp = 0;
						temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
						c++;
					}
				}
				cnt++;			
			}
			c/=cnt;
			if(c%2 != 0 && (c/0.1)%2 !=0) {
			String a = ""+c;
			String[]a2 = new String [a.length()];
			for(int i=0; i<a.length(); i++) {
				a2[i] = a.substring(i, i+1);
			}
			String x = "";
			for(int i=0, j=a.length(); i<j; i++) {
				x += a2[i];
				if(a2[i].equals(".")) {
					j=i+3;					
				}
			}
			c = Double.parseDouble(x);
		}
			
		String output = c+"-";
		for(int i=0; i<array.length; i++) {
			output += array[i]+" ";			
		}
		output = output.trim();
		bw.write(output+"\n");
		cicle++;
		}
		
		br.close();
		bw.close();	
	
	}
	
}

