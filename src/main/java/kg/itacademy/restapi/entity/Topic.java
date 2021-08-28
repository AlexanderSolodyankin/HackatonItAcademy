package kg.itacademy.restapi.entity;


import javax.persistence.*;

@Entity
@Table(name = "topic")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userLong;
    private Long TeacherLong;
    private String date;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserLong() {
        return userLong;
    }

    public void setUserLong(Long userLong) {
        this.userLong = userLong;
    }

    public Long getTeacherLong() {
        return TeacherLong;
    }

    public void setTeacherLong(Long teacherLong) {
        TeacherLong = teacherLong;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
