package cn.edu.nju.notebook.service;

import cn.edu.nju.notebook.entity.UserEntity;

/**
 * Created by Jiayiwu on 19/5/2.
 * Mail:wujiayi@lgdreamer.com
 * Change everywhere
 */
public interface SessionService {
    //目前只有注册部分

    public UserEntity login(String email,String password);
}
