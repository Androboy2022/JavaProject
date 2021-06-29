package quiz2;

public class Box<T, U> {
	
	private T id;
    private U con;

    public Box(T i, U c) {
        id = i;
        con = c;
    }

    public void showIt() {
        System.out.println("ID: " + id + ", " + "Contents: " + con);
    }

}
