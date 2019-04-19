package com.leyou.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@Data
@Table(name = "tb_user")
public class User {

    @KeySql(useGeneratedKeys = true)
    @GeneratedValue(generator = "JDBC") //主键回写
    @Id //主键声明
    private Long id;
    private String userName;
    private String password;
    private String name;
    private Integer age;
    private Integer sex;
    private Date birthday;
    private Date created;
    private Date updated;
    @Transient //不需要持久化的字段
    private String note;

}
