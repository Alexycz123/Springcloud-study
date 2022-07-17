package com.ycz.springCloud.service;

import com.ycz.springCloud.entity.Movie;


/**
 * (Movie)表服务接口
 *
 * @author makejava
 * @since 2021-12-17 09:12:14
 */
public interface MovieService {


    Object getAll();

    Object getOne(Integer id);
}
