package dao;

import entity.Mp;

/**
 * @Author chenKeju
 * @Description :dao
 * @Date :2019\6\25 0025
 * @version:1.0
 */
public class MpDao {
    public static void main(String[] args) {
        new Mp().set("name","zs").save();
    }
}
