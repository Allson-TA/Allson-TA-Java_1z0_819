package p107;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class p107 {
	
	public static void main(String[] args) throws IOException {
		
		Path v1 = Paths.get("/./forest/./").resolve(Paths.get("tree.txt"));
		Path v2 = new File ("/./forest/./water/../tree.txt").toPath();
		System.out.println(Files.isSameFile(v1,v2));
		System.out.println(" " + v1.equals(v2));
		System.out.println(" " + v1.normalize().equals(v2.normalize()));
	}

}
/*
Assuming all referenced paths exist within file system, what is the result?
假設所有引用的路徑在文件系統中都存在，結果是什麼？

A. true true true
B. false true true
C. true false true
D. false false true
*/
