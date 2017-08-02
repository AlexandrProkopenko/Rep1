package Chapter7;

import java.util.Date;

/**
 * Created by Александр on 02.06.2017.
 */
public class DateTest {
    public static void main(String[] args) throws Exception {
        Date startTime = new Date();

        long endTime = startTime.getTime() + 2000;   //    +5 секунд
        Date endDate = new Date(endTime);

        Thread.sleep(3000);              // ждем 3 секунды

        Date currentTime = new Date();
        if (currentTime.after(endDate))//проверяем что время currentTime после endDate
        {
            System.out.println("End time!");
        }
    }
}
