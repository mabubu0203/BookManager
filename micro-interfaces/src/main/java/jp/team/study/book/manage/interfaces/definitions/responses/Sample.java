package jp.team.study.book.manage.interfaces.definitions.responses;

import lombok.Data;

import java.time.LocalDateTime;

@Data
@Deprecated
public class Sample {

    private Long id;

    private Integer updateCount;

    private LocalDateTime createDatetime;

    private LocalDateTime updateDatetime;
}
