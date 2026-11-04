package com.learning.interface4.markerinterface;

public class Account implements Cloneable // giving permisson so that object of this class can be copied and cloned
{
	String name;
	String address;
	String accNo;

	public Account(String _name, String _address, String _accNo) {
		super();
		this.name = _name;
		this.address = _address;
		this.accNo = _accNo;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
