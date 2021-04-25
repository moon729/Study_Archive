package javastudy;

class Calculator {
	
	int[] oprands;
	
	//constructor
	public void setOprands(int[] oprands) {
		this.oprands = oprands;
	}
	
	//sum()
	public void sum() {
		int total = 0;
		for(int value:this.oprands) {
			total += value;
		}
		System.out.println("sum : " + total);
	}
	
	//avg()
	public void avg() {
		int total = 0;
		for(int value:this.oprands) {
			total += value;
		}
		System.out.println("avg : " + total/(this.oprands.length));
	}
}
public class CalculatorDemo {
	
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.setOprands(new int[] {10, 20});
		c1.sum();
		c1.avg();
		
		c1.setOprands(new int[] {10, 20, 30});
		c1.sum();
		c1.avg();
	}
	
}
