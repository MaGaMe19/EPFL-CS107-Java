public class OuterClass {
	private final int ID = 8;

	private class InnerClass {
		public InnerClass() {
			System.out.println(ID);
		}
	}

	public OuterClass(){
		new InnerClass();
		System.out.println("Outer Class");
	}

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
	}
}

