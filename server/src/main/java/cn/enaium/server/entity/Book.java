package cn.enaium.server.entity;

import org.babyfish.jimmer.sql.*;

import java.time.LocalDateTime;

/**
 * @author Enaium
 */
@Entity
@Table(name = "book")
public interface Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id();

    String title();

    String author();

    LocalDateTime createTime();
}
