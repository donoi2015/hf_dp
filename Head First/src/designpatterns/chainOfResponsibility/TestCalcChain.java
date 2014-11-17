package designpatterns.chainOfResponsibility;

public class TestCalcChain {

	public static void main(String[] args) {
		Chain add = new AddNumbers();
		Chain sub = new SubtractNumbers();
		Chain div = new DivideNumbers();
		Chain mult = new MultiplyNumbers();
		
		add.setNextChain(sub);
		sub.setNextChain(div);
		div.setNextChain(mult);
		
		Numbers n = new Numbers(4,10,"mult");
		
		add.calculate(n);
	}

}
