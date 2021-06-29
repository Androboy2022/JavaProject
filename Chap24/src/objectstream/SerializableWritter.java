package objectstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableWritter {

	public static void main(String[] args) throws Exception {
		
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("D:/JAVA_Project/object.txt"));
		ClassA classA = new ClassA();
		classA.field1=1;
		classA.field2.field1=2;
		classA.field3=3;
		classA.field4=4;
		
		os.writeUTF("�ȳ�");
		os.writeObject(classA);
		
		os.flush();
		os.close();
		
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream("D:/JAVA_Project/object.txt"));
		System.out.println(oi.readUTF());
		ClassA instance = (ClassA)oi.readObject();
		
		System.out.println("Field1 : "+instance.field1);
		System.out.println("Field2 : "+instance.field2.field1);
		System.out.println("Field3 : "+instance.field3);
		System.out.println("Field4 : "+instance.field4);
		
		oi.close();

	}

}
