package p44;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

	public static void main(String[] args) {
		
		String soruce = "/u01/word/stage/nessage.txt";
		String destinaion = "/u01/word/nessage.txt";
		
		//	line1

		
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

/*
You want to move source.txt to the destination directory even if a file with the same name already exists in the destination directory.
你想要將 source.txt 移動到目標目錄，即使目標目錄中已經存在同名的檔案。

Which code inserted on line 1 will accomplish this?
哪一段程式碼插入在第1行可以達成這個目的？

A. try {
       Files.move(Paths.get(source), Paths.get(destination));
   }
   
B. try {	//	StandardCopyOption.REPLACE_EXISTING-->強制覆蓋的意思 (取代)
       Files.move(Paths.get(source), Paths.get(destination), StandardCopyOption.REPLACE_EXISTING);
   }

C. try(FileChannel in = new FileInputStream(source).getChannel();
       FileChannel out = new FileOutputStream(destination).getChannel()) {
       in.transferTo(0, in.size(), out);
   }

D. try {
       Files.copy(Paths.get(source), Paths.get(destination), StandardCopyOption.CREATE_NEW);
       Files.delete(Paths.get(source));
   }
*/
