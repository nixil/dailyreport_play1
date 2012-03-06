package models;

import play.libs.Mail;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xli
 * Date: 12-3-6
 * Time: 下午3:25
 * To change this template use File | Settings | File Templates.
 */
public class DailyReport{
    public Date reportDate ;
    public List<ReportItem> reportItems;
}
