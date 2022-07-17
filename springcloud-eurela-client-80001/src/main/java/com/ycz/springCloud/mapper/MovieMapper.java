package com.ycz.springCloud.mapper;

import com.ycz.springCloud.entity.Movie;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * (Movie)表数据库访问层
 *
 * @author makejava
 * @since 2021-12-17 09:12:13
 */
@Mapper
public interface MovieMapper extends tk.mybatis.mapper.common.Mapper<Movie>,MySqlMapper<Movie> {


}

