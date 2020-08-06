package com.capgemini.oops;

public class TestB {
	public static void main(String[] args) {
		Pen p = new Pen();
		p.color = "pink";
		p.size = 12.7;
		p.price = 10;
		p.write();
		p.play();
		Marker marker = new Marker();
		marker.color = "Black";
		marker.price = 100;
		marker.size = 18.3;
		marker.isPermanent = false;
		marker.thickness = 40;
		marker.write();
		marker.writeOnBoard();
		marker.play();

	}

}
