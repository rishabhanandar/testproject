package com.bajra.program;

public class BrokenImmutable {

	private final int value;

    public BrokenImmutable(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
