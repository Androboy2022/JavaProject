package quiz2;

import java.util.function.BiFunction;

public class BoxMaker {
	
	public static void main(String[] args) {
        
		//BiFunction<Integer, String, Box<Integer, String>> bf = (i, c) -> new Box<>(i, c);
		BiFunction<Integer, String, Box<Integer, String>> bf = Box::new;
        
		Box<Integer, String> b1 = bf.apply(1, "Toy");
        Box<Integer, String> b2 = bf.apply(2, "Robot");
        
        b1.showIt();
        b2.showIt();
    }

}
