package vn.com.tma.taskmanagement.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import vn.com.tma.taskmanagement.entities.Task
import vn.com.tma.taskmanagement.repositories.TaskRepository

@Service
class TaskService implements ITaskService {

    @Autowired
    TaskRepository repository

    @Override
    List<Task> findAll() {
        repository.findAll()
    }

    @Override
    Task findById(Integer TaskId) {
        return null
    }

    @Override
    Task saveTask(Task Task) {
        return null
    }

    @Override
    Task updateTask(Task Task) {
        return null
    }

    @Override
    Task deleteTask(Integer TaskId) {
        return null
    }
}
