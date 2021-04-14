package exchagemoney;

import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {
	public void filewrite(String abc) throws IOException {

		try {

			FileWriter fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\test.txt", true);

			fw.write(abc);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
