
//Here MAX_VALUE is present in both Integer as well as Byte package.

//Normal import talks upto class level
//static import talks upto member level

import static java.lang.System.*;
//import static java.lang.Integer.MAX_VALUE;
import static java.lang.Byte.*;

public class staticImportAmbiguity {

	//static int MAX_VALUE=1000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out.println(MAX_VALUE);

	}

}
