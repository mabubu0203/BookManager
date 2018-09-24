package jp.team.study.book.manage.rdb.service;

import jp.team.study.book.manage.rdb.domain.Sample;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Stream;

/**
 * @author uratamanabu
 * @version 1.0
 * @since 1.0
 */
public interface SampleService {

    /**
     * Sampleを全件抽出します。
     *
     * @return Stream
     * @author uratamanabu
     * @since 1.0
     */
    Stream<Sample> getAll();

    /**
     * Sampleを１件挿入します。
     *
     * @param masterEntity カテゴリー
     * @author uratamanabu
     * @since 1.0
     */
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    void insert(final Sample masterEntity);
}
