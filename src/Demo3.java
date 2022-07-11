
//Date class is present in both sql as well as util package. But here, it will give priority to explicit import first.
//Precedence order considered by compiler=>1)explicit import, 2)classes present in CWD(default package), 3)implicit import

import java.util.Date;
import java.sql.*;
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();

	}

}
