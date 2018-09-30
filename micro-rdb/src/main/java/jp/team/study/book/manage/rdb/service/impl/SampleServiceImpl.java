package jp.team.study.book.manage.rdb.service.impl;

import jp.team.study.book.manage.rdb.domain.Sample;
import jp.team.study.book.manage.rdb.repository.SampleRepository;
import jp.team.study.book.manage.rdb.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class SampleServiceImpl implements SampleService {

    @Autowired
    private SampleRepository master;

    @Override
    public Stream<Sample> getAll() {
        return null;
    }

    @Override
    public void insert(Sample masterEntity) {
        master.save(masterEntity);
    }
}
