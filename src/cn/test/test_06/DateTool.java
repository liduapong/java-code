package cn.test.test_06;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTool {
	private DateTool() {}
	
	public static String getRiQi(Date d) {
		return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(d);
	}

	public static String getNYR(Date d) {
		return new SimpleDateFormat("yyyy-MM-dd").format(d);
	}

	public static String getSFM(Date d) {
		return new SimpleDateFormat("hh:mm:ss").format(d);
	}
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(getNYR(d));
		System.out.println(getRiQi(d));
		System.out.println(getSFM(d));
	}
}

