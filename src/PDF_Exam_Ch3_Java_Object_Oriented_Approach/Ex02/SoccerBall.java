package PDF_Exam_Ch3_Java_Object_Oriented_Approach.Ex02;

public class SoccerBall extends Ball implements Equipment { // 定義一個公開類SoccerBall，繼承自Ball並實現Equipment接口
    public SoccerBall() { // 定義無參構造函數
        super(5); // 調用父類Ball的構造函數，將size設為5
    }
    public Ball get() { return this; } // 定義一個方法get，返回當前對象(this)，返回類型為Ball
    public static void main(String[] passes) { // 定義主方法
        var equipment = (Equipment)(Ball)new SoccerBall().get(); // 創建一個SoccerBall對象，通過get方法獲得其引用，並先後轉型為Ball和Equipment
        System.out.print(((SoccerBall)equipment).size); // 將equipment轉型為SoccerBall並打印其size屬性
    }
}
