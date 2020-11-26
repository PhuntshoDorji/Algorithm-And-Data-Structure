public class SolutionTest{
	public static void main(String[] args) {
		Solution<Integer, String> obj = new Solution<Integer, String>();
		obj.put(7, "A");
		obj.put(8, "B");
		obj.put(9, "C");
		obj.put(10, "D");
		System.out.println(obj.isEmpty());
		System.out.println(obj.get(7));
		System.out.println(obj.size());
		System.out.println(obj.floor(7));
		System.out.println(obj.select(2));
		System.out.println(obj.keys(7,9));

	}
}