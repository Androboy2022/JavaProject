package dataperformance;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DataBuffered_Ex {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		OutputStream out1 = new FileOutputStream("D:/JAVA_Project/data1.bin");
		DataOutputStream dataOut = new DataOutputStream(out1);
		Data_Performance.performance(dataOut);
		dataOut.close();
		
		OutputStream out2 = new FileOutputStream("D:/JAVA_Project/data2.bin");
		BufferedOutputStream buf1 = new BufferedOutputStream(out2, 1024*10);
		DataOutputStream dataOut2 = new DataOutputStream(buf1);
		Data_Performance.performance(dataOut2);
		dataOut2.close();
		
	}

}
