package cn.enaium.server.controller;

import cn.enaium.server.entity.Book;
import cn.enaium.server.entity.Tables;
import lombok.RequiredArgsConstructor;
import org.babyfish.jimmer.sql.JSqlClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Enaium
 */
@RestController
@RequiredArgsConstructor
public class BookController {
    private final JSqlClient sql;

    @GetMapping("/book")
    public List<Book> getBooks() {
        return sql.createQuery(Tables.BOOK_TABLE).select(Tables.BOOK_TABLE).execute();
    }

    @PostMapping("/book")
    public void saveBook(@RequestBody Book book) {
        sql.save(book);
    }
}
