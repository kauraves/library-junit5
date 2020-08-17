package com.example.libraryunit5;

import com.example.libraryjunit5.Library;
import org.apache.log4j.BasicConfigurator;
import org.junit.jupiter.api.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class LibraryTest {
    private static Library library;

    private static final Logger log = LoggerFactory.getLogger(LibraryTest.class);

    @BeforeAll
    public static void init() {
        library = new Library("TestLibrary");
        BasicConfigurator.configure();
    }

    @BeforeEach
    @DisplayName("Create basic data.")
    public void createBasicData() {
        ;
    }

    @Test
    @DisplayName("test one")
    public void testOne() {
        log.info("Executing test one.");
        assertTrue(true);
    }

    @Test
    @DisplayName("test two")
    public void testTwo() {
        log.info("Executing test two.");
        assertFalse(false);
    }

    @AfterEach
    public void cleanBasicData(){
        log.info("Clean after test.");
    }

    @AfterAll
    public static void cleanAll(){
        log.info("Clean all.");
    }
}
