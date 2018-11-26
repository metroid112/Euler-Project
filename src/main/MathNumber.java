package main;


// TODO: Finish
public class MathNumber extends Number {
	private static final long serialVersionUID = -2776647321189400681L;
	
	private Number value;
	
	public MathNumber(Number value) {
		this.setValue(value);
	}

	@Override
	public double doubleValue() {
		return (double) this.value;
	}

	@Override
	public float floatValue() {
		return (float) this.value;
	}

	@Override
	public int intValue() {
		return (int) this.value;
	}

	@Override
	public long longValue() {
		return (long) this.value;
	}

	public Number getValue() {
		return value;
	}

	public void setValue(Number value) {
		this.value = value;
	}	
}
