public class TestBinaryNum{
	
	//jdk1.7 新增特性：二进制表示形式，下划线分隔符表示形式
	public static void main(String[] args){
		System.out.println(System.getProperty("file.encoding"));
		
		int a = 0b00000000_00000000_00000000_00000011;
		int b = 012; 
		int c = 1_2098_1029;
		int d = 0x32F;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
}