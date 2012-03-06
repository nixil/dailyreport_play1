package models;

import play.data.validation.MaxSize;
import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 12-3-5
 * Time: 下午7:48
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class ReportItem extends Model {
    @MaxSize(value = 250)
    public String doneToday;
    @MaxSize(value = 250)
    public String todoTomorrow;
    @MaxSize(value = 250)
    public String issue;

    public Date reportDate;

    @ManyToOne
    public User who;

    @Override
    public String toString() {
        return who + "今天：" + doneToday +", 明天:" + todoTomorrow +
                ", 遇到的问题:" +issue;
    }
}
