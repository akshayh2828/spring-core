package java8;

public class NumberStartWith
{
	private int x;
	private int y;
	private String name;
	public NumberStartWith(int x, int y) {
		super();
		this.x = x;
		this.y=y;
		
	}
	@Override
	public String toString() {
		return "NumberStartWith [x=" + x + ", y=" + y + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		NumberStartWith n=new NumberStartWith(10, 2);
		System.out.println(n);
	}
	

}
