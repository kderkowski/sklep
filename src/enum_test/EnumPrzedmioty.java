package enum_test;

public enum EnumPrzedmioty {

	JABLKO(0) {
		public void gnije() {
			System.out.println("To jablko gnije");
		}
	},
	ARBUZ(1) {
		public void gnije() {
			System.out.println("Ten arbuz gnije");
		}
	};

	private int code;

	private EnumPrzedmioty(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
	 public abstract void gnije();
}
