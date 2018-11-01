module micro.rdb.main {
    requires lombok;
    requires jackson.annotations;
    requires spring.data.commons;
    requires java.persistence;
    requires spring.data.jpa;
    requires spring.data.rest.core;
    requires spring.context;
    requires spring.beans;
    requires spring.tx;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    exports jp.team.study.book.manage.rdb;
    exports jp.team.study.book.manage.rdb.domain;
    exports jp.team.study.book.manage.rdb.repository;
    exports jp.team.study.book.manage.rdb.service;
}