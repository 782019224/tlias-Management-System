package com.weide.tlias.controller;

import com.weide.tlias.pojo.Dept;
import com.weide.tlias.pojo.Result;
import com.weide.tlias.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 部门管理Controller
 */
@Slf4j //属于Lombok工具包里面的注解。用于替代private static Logger log = LoggerFactory.getLogger(DeptController.class);
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    //private static Logger log = LoggerFactory.getLogger(DeptController.class);

    //    @RequestMapping(value = "/depts",method =RequestMethod.GET)  //指定了请求方式为GET
    @GetMapping("/depts")  //RequestMapping的衍生注解
    public Result list() {
//        System.out.println("查询全部部门数据"); 用logger将其替代显得更加专业
        log.info("查询全部部门数据");

        //调用service查询部门数据
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }
}
