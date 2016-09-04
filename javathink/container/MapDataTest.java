package container;

import java.util.Iterator;
import java.util.Map;

import array.CountingGenerator;
import net.mindview.util.Generator;
import net.mindview.util.MapData;
import net.mindview.util.Pair;
import net.mindview.util.Print;
import net.mindview.util.RandomGenerator;

class Letters implements Generator<Pair<Integer, String>>,Iterable<Integer>{
	private int size=9;
	private int number = 1;
	private char letter='A';
	public Pair<Integer, String> next(){
		return new Pair<Integer, String>(number++, ""+letter++);
	}
	
	public Iterator<Integer> iterator(){
		return new Iterator<Integer>(){
			public Integer next() {
				return number++;
			}
			public boolean hasNext() {
				return number<size;
			}
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
}

public class MapDataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print.print(MapData.map(new Letters(), 11));
		Print.print(MapData.map(new CountingGenerator.Character()
				, new RandomGenerator.String(3),8));
		Print.print(MapData.map(new CountingGenerator.Character(),"value", 6));
		Print.print(MapData.map(new Letters(), new RandomGenerator.String(3)));
		Print.print(MapData.map(new Letters(), "Pop"));		
	}

}
