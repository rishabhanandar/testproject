package com.bajra.program;

public class SampleHashcode {

	private int tempInt;
	private String tenpString;
	private double tempDouble;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(tempDouble);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + tempInt;
		result = prime * result + ((tenpString == null) ? 0 : tenpString.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SampleHashcode other = (SampleHashcode) obj;
		if (Double.doubleToLongBits(tempDouble) != Double.doubleToLongBits(other.tempDouble))
			return false;
		if (tempInt != other.tempInt)
			return false;
		if (tenpString == null) {
			if (other.tenpString != null)
				return false;
		} else if (!tenpString.equals(other.tenpString))
			return false;
		return true;
	}
	
}
