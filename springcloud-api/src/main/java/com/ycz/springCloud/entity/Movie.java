package com.ycz.springCloud.entity;

import java.util.Date;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * (Movie)实体类
 *
 * @author makejava
 * @since 2021-12-17 09:12:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "movie")
public class Movie implements Serializable {
    private static final long serialVersionUID = -30737887108345962L;
    @Id
    private Integer id;

    private String movieName;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date movieData;


}

