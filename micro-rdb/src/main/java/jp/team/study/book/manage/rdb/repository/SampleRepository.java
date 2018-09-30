package jp.team.study.book.manage.rdb.repository;


import io.swagger.annotations.Api;
import jp.team.study.book.manage.rdb.domain.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * @author uratamanabu
 * @version 1.0
 * @since 1.0
 */
@Api
@Repository
@RepositoryRestResource(path = "samples",collectionResourceRel = "sampleList")
public interface SampleRepository extends JpaRepository<Sample, Long> {
}
