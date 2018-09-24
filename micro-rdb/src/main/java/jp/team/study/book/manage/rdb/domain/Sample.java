package jp.team.study.book.manage.rdb.domain;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author uratamanabu
 * @version 1.0
 * @since 1.0
 */
@ApiModel("Sample")
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
            name = "UPDATE_COUNT",
            nullable = false,
            length = 5,
            columnDefinition = "SMALLINT"
    )
    private Integer updateCount;

    @CreatedDate
    @Column(
            name = "CREATE_DATETIME",
            nullable = false,
            columnDefinition = "DATETIME"
    )
    private LocalDateTime createDatetime;

    @LastModifiedDate
    @Column(
            name = "UPDATE_DATETIME",
            nullable = false,
            columnDefinition = "DATETIME"
    )
    private LocalDateTime updateDatetime;

}
