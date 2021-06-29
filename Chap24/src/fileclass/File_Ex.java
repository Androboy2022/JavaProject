package fileclass;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class File_Ex {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File dir = new File("D:/JAVA_Project/Dir");
		File file1 = new File("D:/JAVA_Project/file1.txt");
		File file2 = new File("D:/JAVA_Project/file2.txt");
		
		if(!dir.exists()) {
			dir.mkdir();
		}
		
		if(!file1.exists()) {
			file1.createNewFile();
		}
		
		if(!file2.exists()) {
			file2.createNewFile();
		}
		
		File temp = new File("D:/JAVA_Project");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		File[] contents = temp.listFiles();
		System.out.println("��¥ \t\t\t\t �ð� \t\t ���� \t\t ũ�� \t\t �̸�");
		System.out.println("__________________________________________");
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.print("\t <DIR> \t\t\t"+file.getName());
			}else {
				System.out.print("\t\t"+file.length());
				System.out.print("\t\t"+file.getName());
			}
			System.out.println("");
		}
	}

}











