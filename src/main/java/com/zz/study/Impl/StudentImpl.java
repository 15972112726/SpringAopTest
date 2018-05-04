package com.zz.study.Impl;

import com.zz.study.IStudent;

/**
 * Created by dell on 2018/5/4.
 */
public class StudentImpl implements IStudent {

    public void addStudent(String name) {
        System.out.println( " 欢迎  " + name + "  你加入Spring家庭! " );
    }
}
