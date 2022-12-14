package Practicejava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdff = new SimpleDateFormat("dd/MM/yy hh:mm:ss");
		
		System.out.println(d.toString());
		System.out.println(sdf.format(d));
		System.out.println(sdff.format(d));
		
		

	}

}
