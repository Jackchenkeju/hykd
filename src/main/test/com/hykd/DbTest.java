package com.hykd;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.sun.corba.se.spi.legacy.connection.Connection;
import org.junit.Test;

/**
 * @Author chenKeju
 * @Description :com.hykd
 * @Date :2019\6\25 0025
 * @version:1.0
 */
public class DbTest {
    @Test
    public void test(){
        Record mp= new Record().set("name","zs");
     //   Db.save("mp",mp);
        Record mp1 = Db.findById("mp", 1);

        Page<Record> paginate = Db.paginate(1, 2,true, "select * ", "from mp where id > ?", 2);

     /*   Db.tx(()->{

        });*/


    }
}
