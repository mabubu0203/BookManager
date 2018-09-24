package jp.team.study.book.manage.api.sample.controller;

import io.swagger.annotations.Api;
import jp.team.study.book.manage.rdb.domain.Sample;
import jp.team.study.book.manage.rdb.service.SampleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author uratamanabu
 * @version 1.0
 * @since 1.0
 */
@RestController
@RequestMapping(
        value = {"/sample/"},
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE
)
@Api(tags = {"Sampleです。"})
public class SampleController {

    @Autowired
    private SampleService service;

    @GetMapping(value = {"/all"})
    public ResponseEntity<List<jp.team.study.book.manage.interfaces.definitions.responses.Sample>> getGoods() {


        Stream<Sample> stream = service.getAll();
        List<jp.team.study.book.manage.interfaces.definitions.responses.Sample> list = new ArrayList<>();
        stream.forEach(sample -> {

            jp.team.study.book.manage.interfaces.definitions.responses.Sample res = new jp.team.study.book.manage.interfaces.definitions.responses.Sample();
            BeanUtils.copyProperties(res, sample);
            list.add(res);
        });


        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PostMapping(value = {"/"})
    public void createGoods(
            @Valid
            @RequestBody final jp.team.study.book.manage.interfaces.definitions.requests.Sample request) {
        Sample sample = new Sample();
        BeanUtils.copyProperties(sample, request);

        service.insert(sample);

    }
}
