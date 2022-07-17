package com.ycz.springCloud.controller;

import com.ycz.springCloud.entity.Movie;
import com.ycz.springCloud.service.MovieService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * (Movie)表控制层
 *
 * @author makejava
 * @since 2021-12-17 09:12:12
 */
@RestController
@RequestMapping("movie")
public class MovieController {
    /**
     * 服务对象
     */
    @Autowired
    private MovieService movieService;

    @RequestMapping("getAll")
    public Object getAll(){
       return movieService.getAll();
    }

    @RequestMapping("/getOne/{id}")
    public Object getOne(@PathVariable Integer id){
        return movieService.getOne(id);
    }


}

