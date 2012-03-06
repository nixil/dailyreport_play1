package controllers;

import models.User;
import play.cache.Cache;
import play.mvc.Scope;

/**
 * Created by IntelliJ IDEA.
 * User: Alex Li
 * Date: 12-2-15
 * Time: 下午4:31
 * To change this template use File | Settings | File Templates.
 */
public class Security extends Secure.Security{

    /**
     * 使用邮件地址和密码进行校验
     * @param username 邮箱
     * @param password
     * @return
     */
    static boolean authenticate(String username, String password) {
        return User.find("byEmail",username).first() != null
                && "ananda".equals(password);
    }

    /**
     * This method is called after a successful authentication.
     * You need to override this method if you with to perform specific actions (eg. Record the time the user signed in)
     */
    static void onAuthenticated() {
        Cache.add(connected(), User.find("byEmail", connected()).first());
    }

    /**
     * This method is called before a user tries to sign off.
     * You need to override this method if you wish to perform specific actions (eg. Record the name of the user who signed off)
     */
    static void onDisconnect() {
        Cache.delete(connected());
    }

    /**
     * This method is called after a successful sign off.
     * You need to override this method if you wish to perform specific actions (eg. Record the time the user signed off)
     */
    static void onDisconnected() {
    }


}
