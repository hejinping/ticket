package com.guolun.sys.dto;


import lombok.Data;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/2/18 0018.
 */
@Data
public class Activity implements Serializable {
    private static final long serialVersionUID = 11121L;
    private int type;
    private String name;

}
