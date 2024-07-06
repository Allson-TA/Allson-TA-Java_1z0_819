package p17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandler {

    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("foo.txt")) {
            // line 1
        } catch (Exception e) {
          
        }
    }
}


/*
Which code fragment can be inserted in line 1 to make the code compile?
哪段程式碼片段可以插入第 1 行以使程式碼編譯成功？

A. finally { in.close(); }	//	語句自動處理資源的關閉，無需 finally 塊來手動關閉資源
B. catch (FileNotFoundException e) {}	//	FileImageInputStream 構造函數會拋出 IOException 而不是 FileNotFoundException。
C. catch (FileNotFoundException | Exception e) {}	//	因為 Exception 是 FileNotFoundException 的父類，不能同時捕獲
   finally { in.close(); }
D. catch (Exception | IOException e) {}	//	因為 IOException 是 Exception 的子類，不能同時捕獲
E. catch (Exception e) {}
*/

