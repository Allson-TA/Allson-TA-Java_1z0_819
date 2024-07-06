package p125;

public class p125 {
	public static void main(String[] args) {
		   String filename = "/u01/work" + args[0];

		   // line n1

		   // ...
		}

		/*
		You want to validate a path name before the read file. Before validation, all path names should be canonicalized.
		你想在讀取文件之前驗證路徑名。在驗證之前，所有路徑名都應該被標準化。

		Which code inserted on line n1 will accomplish this?
		插入在第n1行的哪段程式碼可以實現這一目標？

		A. File file = new File(filename).getAbsoluteFile();
		   FileInputStream fis = new FileInputStream(file);

		B. Path file = Paths.get(filename);
		   String canonicalPath = file.toAbsolutePath().toString();
		   FileInputStream fis = new FileInputStream(canonicalPath);

		C. Path file = Paths.get(filename);
		   String canonicalPath = file.normalize().toString();
		   FileInputStream fis = new FileInputStream(canonicalPath);

		D. File file = new File(filename);
		   String canonicalPath = file.getCanonicalPath();
		   FileInputStream fis = new FileInputStream(canonicalPath);
		*/

}
