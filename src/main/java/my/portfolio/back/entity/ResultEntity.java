package my.portfolio.back.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import my.portfolio.back.enums.JobTypes;

import java.sql.Timestamp;

@Entity
@Table(name = "result")
@Getter
@Setter
public class ResultEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "icon")
    private String icon;

    @Column(name = "title")
    private String title;

    @Column(name = "body_uz")
    private String bodyUz;

    @Column(name = "body_en")
    private String bodyEn;

    @Column(name = "body_jp")
    private String bodyJp;

    @Column(name = "job_type")
    @Enumerated(EnumType.STRING)
    private JobTypes jobType;

    @Column(name = "created_at")
    private Timestamp createdAt;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBodyUz() {
        return bodyUz;
    }

    public void setBodyUz(String bodyUz) {
        this.bodyUz = bodyUz;
    }

    public String getBodyEn() {
        return bodyEn;
    }

    public void setBodyEn(String bodyEn) {
        this.bodyEn = bodyEn;
    }

    public String getBodyJp() {
        return bodyJp;
    }

    public void setBodyJp(String bodyJp) {
        this.bodyJp = bodyJp;
    }

    public JobTypes getJobType() {
        return jobType;
    }

    public void setJobType(JobTypes jobType) {
        this.jobType = jobType;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
