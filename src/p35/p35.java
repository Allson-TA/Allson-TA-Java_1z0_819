package p35;

public class p35 {
	/*
	/proj/msg/messages.properties file:
	消息文件路径：/proj/msg/messages.properties
	message=Hello {0}, regards {1}

	/proj/msg/messages_ja_JP.properties file:
	消息文件路径：/proj/msg/messages_ja_JP.properties
	message=こんにちは {0}, に関して {1}

	/proj/msg/Test.java class:
	Java类文件路径：/proj/msg/Test.java
	public class Test {
	    public static void main(String[] args) throws Exception {
	        // line 1
	        System.out.println(message);
	    }
	}

	To print the message こんにちは Joe, に関して Jane., you should insert the following code at line 1 in the main method:
	要打印消息 こんにちは Joe, に関して Jane., 你应该在 main 方法的第1行插入以下代码：

	ResourceBundle msg = ResourceBundle.getBundle("messages", Locale.JAPAN);
	String[] names = {"Joe", "Jane"};
	String message = MessageFormat.format(msg.getString("message"), names);
	*/

}	//	一定要有Locale.JAPAN
	//	因為有先出msg變數，所以必須要msg.messages

/*
/proj/msg/messages.properties file:
消息文件路径：/proj/msg/messages.properties
message=Hello {0}, regards {1}

/proj/msg/messages_ja_JP.properties file:
消息文件路径：/proj/msg/messages_ja_JP.properties
message=こんにちは {0}, に関して {1}

/proj/msg/Test.java class:
Java类文件路径：/proj/msg/Test.java
public class Test {
    public static void main(String[] args) throws Exception {
        // line 1
        System.out.println(message);
    }
}

To print the message こんにちは Joe, に関して Jane., you should insert the following code at line 1 in the main method:
要打印消息 こんにちは Joe, に関して Jane., 你应该在 main 方法的第1行插入以下代码：

ResourceBundle msg = ResourceBundle.getBundle("messages", Locale.JAPAN);
String[] names = {"Joe", "Jane"};
String message = MessageFormat.format(msg.getString("message"), names);
*/

