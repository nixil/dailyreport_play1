package utils;

import controllers.DailyReports;
import models.DailyReport;
import play.mvc.Mailer;

/**
 * Created by IntelliJ IDEA.
 * User: xli
 * Date: 12-3-6
 * Time: 下午3:18
 * To change this template use File | Settings | File Templates.
 */
public class Mails extends Mailer{
    public static void dailyReport(DailyReport report){
        setFrom("xli@nwnit.com");
        addRecipient("tomorrow009@163.com","alexleebiti@gmail.com");
        setSubject("Dailly Report");
        send(report);
    }
}
