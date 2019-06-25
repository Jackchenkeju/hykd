package controller;

import com.alibaba.fastjson.JSON;
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.core.NotAction;
import com.jfinal.core.paragetter.Para;
import com.jfinal.json.Json;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.tx.Tx;
import entity.User;
import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.RequestMapping;

/**
 * @Author chenKeju
 * @Description :controller
 * @Date :2019\6\25 0025
 * @version:1.0
 */
@RequestMapping("/user")
public class UserConttroller extends JbootController {

    public  void add(){
        renderText("hello");
    }
    @NotAction
    public void test(){
        System.out.println("不是一个action");
    }

    public void getP(){
        String name = getPara("name");
        Integer age = getParaToInt("age");
        setAttr("name",name);
        render("/a.html");
    }
    public void getP1(@Para("name") String name){
        System.out.println("name"+name);
    }

    public void page(){
        render("/a.html");
    }

    public void getJson(){
        String json = getRawData();
        User user = (User) JSON.parse(json);
        User u = Json.getJson().parse("json", User.class);
    }
    public void testBean(){
        User u = getBean(User.class);
        System.out.println(u.getAge());
        render("/a.html");
    }
    public void testBean1(){
        User u = getBean(User.class,"",true);//不用前缀   跳过数据转换或者属性名错误异常可以传入true
        System.out.println(u.getAge());
        render("/a.html");
    }

    @Before(Tx.class)
    public void trans_demo(){
        Db.update("update account set cash = cash - ? where id ?");
    }

    public void testSet(){
        set("name","name").renderJsp("/getP1.html");
    }

    public void testCode(){
         renderQrCode("contetn",100,100);
    }

}
