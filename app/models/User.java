package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 12-3-5
 * Time: 下午8:57
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class User extends Model {
    public String name;
    public String email;

    @Override
    public String toString() {
        return name;
    }
}
