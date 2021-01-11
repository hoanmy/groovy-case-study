package vn.com.tma.taskmanagement.services

import vn.com.tma.taskmanagement.entities.Task

interface ITaskService {
    List<Task> findAll()

    Task findById(Integer TaskId)

    Task saveTask(Task Task)

    Task updateTask(Task Task)

    Task deleteTask(Integer TaskId)
}