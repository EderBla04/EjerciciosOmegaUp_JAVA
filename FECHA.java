package NOSE;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FECHA {
	
	public static void main(String[] args) {
		
		Date ahora = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
		System.out.println(formato.format(ahora));
	}

}
