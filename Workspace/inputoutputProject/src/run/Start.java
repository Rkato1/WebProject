package run;

import func.ByteStreamTest;
import func.CharStream;
import func.FileTest;
import func.ImageStream;
import func.SerialList;
import func.SerialTest;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteStreamTest bs = new ByteStreamTest();
		//bs.primaryStream();
		//bs.subStream();
		CharStream cs = new CharStream();
		//cs.primaryStream();
		//cs.subStream();
		//cs.charStreamReader();
		FileTest ft = new FileTest();
		//ft.fileTest();
		ImageStream is = new ImageStream();
		//is.main();
		SerialTest st = new SerialTest();
		//st.main();
		SerialList sl = new SerialList();
		sl.main();
	}

}
