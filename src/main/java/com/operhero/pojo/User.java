package com.operhero.pojo;

import javax.persistence.*;

@Entity
@Table(name = "t_user")
public class User {

    /** 编号 */
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;
    /** 密码*/
    @Column(nullable = false)
    private String password;

    public User(){
    }

    /**
     * 获取编号
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置编号
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取姓名
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }



    /**
     * 获取password
     * @return  password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     */
    @Override
    public String toString() {
        return "User [name=" + name + ", password=" + password + "]";
    }
}
