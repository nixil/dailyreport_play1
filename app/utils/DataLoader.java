package utils;

import models.ReportItem;
import models.User;
import play.test.Fixtures;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 12-3-5
 * Time: 下午7:50
 * To change this template use File | Settings | File Templates.
 */
public class DataLoader {

    public static void refreshDB(){

        Fixtures.deleteDatabase();
        Fixtures.loadModels("initial-data.yml");

        for(int i=0;i<10;i++){
            ReportItem item = new ReportItem();
            item.doneToday = "今天啥也没完成";
            item.todoTomorrow = "明日何其多";
            item.issue = "世上本无事，庸人自扰之";
            item.who = User.find("byName","李新").first();
            item.save();
        }
    }
}
