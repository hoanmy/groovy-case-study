package vn.com.tma.taskmanagement.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import vn.com.tma.taskmanagement.entities.Task
import vn.com.tma.taskmanagement.services.ITaskService
import vn.com.tma.taskmanagement.services.TaskService

@RestController
@RequestMapping('/api/task')
class TaskController {
    @Autowired
    ITaskService service

    @GetMapping
    List<Task> getAllTodoList(){
        service.findAll()
    }
}
