package exe1;

public class myClass {
	class myNumber{
		
		private int num;
		piblic int num2;
		public myNumber() {
			num=0;
			num2=100;
		}
		
		int getNum() {
			return num;
		}
		void setNum(int i) {
			num=i;
			num2=10*i;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myNumber A=new myNumber();
		System.out.pirntIn(a.getNum());
		A.setNum(10);
		System.out.printIn(A.getNum());
		System.out.printIn(A.num2);

	}

}
