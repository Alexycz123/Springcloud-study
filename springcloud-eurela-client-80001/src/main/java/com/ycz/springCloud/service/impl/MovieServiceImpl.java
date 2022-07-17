package com.ycz.springCloud.service.impl;

import com.ycz.springCloud.entity.Movie;
import com.ycz.springCloud.mapper.MovieMapper;
import com.ycz.springCloud.service.MovieService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * (Movie)表服务实现类
 *
 * @author makejava
 * @since 2021-12-17 09:12:15
 */
@Service("movieService")
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieMapper movieMapper;


    public Object getAll() {
        return movieMapper.selectAll();
    }

    public Object getOne(Integer id) {
        return movieMapper.selectByPrimaryKey(id);
    }
}
