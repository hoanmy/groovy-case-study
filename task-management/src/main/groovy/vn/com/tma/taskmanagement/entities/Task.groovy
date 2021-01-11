package vn.com.tma.taskmanagement.entities

import javax.persistence.*

@Entity
@Table(name = 'task')
class Task {

    @Id
    int Id;

    @Column(name='task_code')
    String taskCode

    String name
    String description

    @Column(name='start_date')
    Date startDate
    @Column(name='end_date')
    Date endDate
    @Column(name='main_task_id')
    String mainTaskId
    int status
    @Column(name='employee_id')
    String employeeId

}
