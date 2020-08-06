package com.capgemini.oops;

public class TestD {
	public static void main(String[] args) {
		FirstGen fg=new FirstGen();
		fg.msg();
		fg.call();
         FirstGen.block();
		System.out.println("*******************************");
		SecondGen sg=new SecondGen();
		sg.msg();
		sg.call();
		sg.games();
		sg.torch();
		SecondGen.block();
		System.out.println("*******************************");
		 ThirdGen tg=new ThirdGen();
		 tg.call();
		 tg.msg();
		 tg.games();
		 tg.torch();
		 tg.camera();
		 tg.music();
		 System.out.println("*******************************");
	}

}
