package com.ssm.demo.entity;

public class User {

    // 下面都是数据库表中每一列字段
    private int user_id;
    private String name;
    private int age;
    private int sex;
    private String create_time;
    private String _timestamp;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String get_timestamp() {
        return _timestamp;
    }

    public void set_timestamp(String _timestamp) {
        this._timestamp = _timestamp;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", create_time='" + create_time + '\'' +
                ", _timestamp='" + _timestamp + '\'' +
                '}';
    }
}
