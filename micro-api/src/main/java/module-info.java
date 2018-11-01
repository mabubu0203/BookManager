module micro.api.main {
    requires spring.web;
    requires micro.interfaces.main;
    requires micro.rdb.main;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.beans;
    requires spring.context;
    requires spring.data.jpa;
    requires java.validation;
}