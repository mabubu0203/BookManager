package jp.team.study.book.manage.interfaces.definitions.requests;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;

@Data
@XmlRootElement(name = "request")
@Deprecated
public class Sample {

    private Long id;

    private Integer updateCount;

    private LocalDateTime createDatetime;

    private LocalDateTime updateDatetime;
}
