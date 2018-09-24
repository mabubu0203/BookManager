package jp.team.study.book.manage.api.books.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import jp.team.study.book.manage.interfaces.definitions.responses.Sample;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
        value = {"/books/"},
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE
)
@Api(tags = {"書籍を扱います。"})
public class BooksController {

    @GetMapping(value = {"/{id}"})
    public ResponseEntity<Sample> findBook(
            @PathVariable(name = "id")
            @ApiParam(example = "1") final Long id
    ) {

        return new ResponseEntity<>(new Sample(), HttpStatus.OK);

    }

}
