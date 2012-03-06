import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.junit.*;
import java.util.*;

import play.libs.Mail;
import play.test.*;
import models.*;
import utils.Mails;

public class BasicTest extends UnitTest {

    @Test
    public void aVeryImportantThingToTest() {
        assertEquals(2, 1 + 1);
    }

    @Test
    @Ignore
    public void mailTest() throws EmailException {
        SimpleEmail email = new SimpleEmail();
        email.setFrom("alexleebiti@gmail.com");
        email.addTo("tomorrow009@163.com");
        email.setSubject("Hello Tomorrow");
        email.setMsg("Message");
        Mail.send(email);
    }
    
    @Test
    public void dailyReportMailTest(){
        DailyReport report = new DailyReport();
        report.reportDate = new Date();
        report.reportItems = ReportItem.findAll();
        Mails.dailyReport(report);
    }
}
