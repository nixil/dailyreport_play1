package controllers;

import models.ReportItem;
import models.User;
import play.cache.Cache;
import play.db.Model;
import play.exceptions.TemplateNotFoundException;
import play.mvc.Controller;
import play.mvc.Scope;
import play.mvc.With;

import java.lang.reflect.Constructor;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 12-3-5
 * Time: 下午9:10
 * To change this template use File | Settings | File Templates.
 */

@With(Secure.class)
@CRUD.For(ReportItem.class)
public class DailyReports extends CRUD{

    public static void blank() throws Exception {
        ObjectType type = ObjectType.get(getControllerClass());
        notFoundIfNull(type);
        Constructor<?> constructor = type.entityClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        ReportItem object = new ReportItem();
        object.reportDate = new Date();
        object.who = Cache.get(Security.connected(), User.class);
        try {
            render(type, object);
        } catch (TemplateNotFoundException e) {
            render("CRUD/blank.html", type, object);
        }
    }

    public static void sendMail(){

    }
}
