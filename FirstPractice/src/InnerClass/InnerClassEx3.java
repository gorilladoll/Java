package InnerClass;

abstract class cyka{
	abstract int getValue();
}

class OutClass3{
	cyka run(){
		int Value = 18;
			class InnerClass4 extends cyka{
				void prt(){
					System.out.println(Value);
				}
				int getValue(){
					return Value;
				}
			}
			cyka varCyka = new InnerClass4();
			return varCyka;
	}
}

public class InnerClassEx3 {
	public static void main(String[] args){
		OutClass3 OC3 = new OutClass3();
		cyka varCyka = OC3.run();
		System.out.println(varCyka.getValue());
	}
}
