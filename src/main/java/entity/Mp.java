package entity;

import com.jfinal.plugin.activerecord.Model;

/**
 * @Author chenKeju
 * @Description :entity
 * @Date :2019\6\25 0025
 * @version:1.0
 */
public class Mp extends Model<Mp> {
    public static final User dao = new User().dao();
}
