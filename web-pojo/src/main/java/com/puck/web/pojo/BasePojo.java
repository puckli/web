package com.puck.web.pojo;

import java.io.Serializable;
import java.util.Date;

public class BasePojo implements Serializable {
    private Long id;
    private Date created;
    private Date modified;
    private Short yn;

    private Integer currentPage;
    private Integer pageSize;
    private String orderBy;
    private String sequence;
}
