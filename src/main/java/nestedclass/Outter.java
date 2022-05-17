package nestedclass;

public class Outter {

	// 자바 7이전
	public void method1(final int arg) {
		final int localVariable = 1;
		// arg = 100; x
		// localVariable = 100; x
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}

	// 자바 8이후
	public void method2(int arg) {
		int localVariable = 1;
		// arg = 100; x
		// localVariable =100; x
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}

}