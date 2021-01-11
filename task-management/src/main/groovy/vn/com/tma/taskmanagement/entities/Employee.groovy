package vn.com.tma.taskmanagement.entities

import javax.persistence.*

@Entity
@Table(name = 'employee')
class Employee {
    @Id
    String id
    String first_name
    String last_name
}
