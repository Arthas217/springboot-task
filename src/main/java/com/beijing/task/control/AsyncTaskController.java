package com.beijing.task.control;

import com.beijing.task.service.AsyncTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zc217
 * @Date 2020/10/20
 */
@RestController
public class AsyncTaskController {

    @Autowired
    AsyncTaskService asyncTaskService;

    /**
     * 同步模拟任务需要花费3s时间，返回success
     */
    @GetMapping("async/task")
    public String  task(){
        asyncTaskService.dataHandle();
        return "task success";
    }

    /**
     * 异步任务处理
     */
    @GetMapping("async/task2")
    public String  task2(){
        asyncTaskService.dataHandle2();
        return "async task success";
    }


}
