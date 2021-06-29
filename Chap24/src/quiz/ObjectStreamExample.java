package quiz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectStreamExample {

	public static void main(String[] args) throws Exception {
		writeList();
		List<Board> list = readList();
				
		for(Board board : list) {
			System.out.printf("%-5d\t%-10s\t%-20s\t%-20s\t%-15s\n", board.getBno(), board.getTitle(), board.getSinger(), board.getAlbum(), board.getDate());
		}
	}
	
	public static void writeList() throws Exception {
		List<Board> list = new ArrayList<>();
		list.add(new Board(1, "π„«œ¥√¿« ∫∞¿ª", "∞Êº≠", "π„«œ¥√¿« ∫∞¿ª(2020)", "2020-11-14"));
		list.add(new Board(2, "Dynamite", "πÊ≈∫º“≥‚¥‹", "Dynamite", "2020-08-24"));
		list.add(new Board(3, "Lovesick Girls", "BLACKPINK", "THE ALBUM", "2020-10-02"));
		
		FileOutputStream fos = new FileOutputStream("C:/Temp/board.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}
	
	public static List<Board> readList() throws Exception {
		FileInputStream fis = new FileInputStream("C:/Temp/board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Board> list = (List<Board>) ois.readObject();
		return list;
	}
}
