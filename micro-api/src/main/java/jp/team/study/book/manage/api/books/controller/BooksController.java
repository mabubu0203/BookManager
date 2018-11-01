package jp.team.study.book.manage.api.books.controller;

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
public class BooksController {

    @GetMapping(value = {"/{id}"})
    public ResponseEntity<Sample> findBook(
            @PathVariable(name = "id") final Long id
    ) {

        return new ResponseEntity<>(new Sample(), HttpStatus.OK);

    }

}
