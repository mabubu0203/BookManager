package jp.team.study.book.manage.rdb.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author uratamanabu
 * @version 1.0
 * @since 1.0
 */
@Entity(name = "Sample")
@Table(
        name = "Sample",
        uniqueConstraints = @UniqueConstraint(columnNames = {"ID"})
)
@Data
@EqualsAndHashCode(callSuper = false)
public class Sample implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "ID",
            unique = true,
            nullable = false,
            length = 10,
            columnDefinition = "BIGINT"
    )
    private Long id;

    @Column(
            name = "SAMPLE_NAME",
            nullable = false,
            length = 5,
            columnDefinition = "INT"
    )
    private String sampleName;

    @Version
    @Column(
            name = "VERSION",
            nullable = false,
            length = 5,
            columnDefinition = "INT"
    )
    private Integer version;

    @Column(
            name = "DELETE_FLAG",
            nullable = false,
            columnDefinition = "TINYINT"
    )
    private Boolean deleteFlag;

    @CreatedDate
    @JsonIgnore
    @Column(
            name = "CREATE_DATETIME",
            nullable = false,
            columnDefinition = "DATETIME"
    )
    private LocalDateTime createDatetime;

    @LastModifiedDate
    @JsonIgnore
    @Column(
            name = "UPDATE_DATETIME",
            nullable = false,
            columnDefinition = "DATETIME"
    )
    private LocalDateTime updateDatetime;

    /**
     * @author uratamanabu
     * @since 1.0
     */
    @PrePersist
    public void onPrePersist() {
        version = 0;
        deleteFlag = false;
        createDatetime = LocalDateTime.now();
        updateDatetime = LocalDateTime.now();
    }

    /**
     * @author uratamanabu
     * @since 1.0
     */
    @PreUpdate
    public void onPreUpdate() {
        updateDatetime = LocalDateTime.now();
    }

    /**
     * @author uratamanabu
     * @since 1.0
     */
    public void addVersion() {
        version++;
    }

}
