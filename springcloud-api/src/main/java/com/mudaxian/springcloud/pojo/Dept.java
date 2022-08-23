package com.mudaxian.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    private int deptno;
    private String deptname;
    private String db_source;

    public Dept(String deptname){
        this.deptname = deptname;
    }
}
