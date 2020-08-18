package com.example.libraryunit5;

import com.example.libraryjunit5.CustomException;
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
        String desc = "Nikean-Konstantinopolin tunnustusta lausuu valtaosa maailman kristityistä. Sen merkitys kristikuntaa yhdistävänä tekstinä on lähes Isä meidän -rukouksen veroinen. ";
        desc += "Sen sanoin voi esitellä kristikunnan uskoa ulkopuolisille tai opettaa sen ydintä kirkon jäsenille.Edesmennyt professori Jukka Thur$/en kommentoi teoksessaan tunnustusta ";
        desc += "lause lauseelta, esittäen samalla sen juuret Raamatussa ja kirkkoisien teksteissä. Professori Thur$/en on seurannut tunnustuksen tulkintaa myös oman aikamme oppikeskusteluissa. ";
        desc += "Kirjan on päivittänyt kirjoittajan poika, professori Lauri Thur$/en. Kirja heijastaa myös kirkkokuntien välisen dialogin nykytilaa. ";
        desc += "Teos soveltuu kaikille kristinuskon oppisisällöstä kiinnostuneille.";

        library.addBook("2254a171-76ba-4d91-84dd-cef78dbf518e", "020-978-951-888-798-3",
                "Thurén, Jukka, kirjoittaja",
                "Thurén, Lauri, kirjoittaja", 2017, "Finnish",
                "23.7", "Non-fiction", desc,
                "Kauniainen : Perussanoma, [2017] : EU, 2017.",
                "272 sivua ; 21 cm ; nide", "978-951-888-798-3", "", "");

        library.addBook("c2930566-2ab5-40f6-bfc7-53a2b1600c29", "020-978-0-321-99278-9",
                "Stroustrup, Bjarne, kirjoittaja",
                "", 2018, "English",
                "61.3", "Non-fiction", "",
                "Upper Saddle River, NJ : Addison-Wesley, 2018. : ©2014",
                "xxxi, 1274 sivua ; kuvitettu, kaavioita; 24 cm ; nide", "978-0-321-99278-9",
                "Second edition, sixth printing.",
                "Sisältää bibliografisia lähdeviitteitä ja hakemiston. Julkaistu myös verkkoaineistona.");
        try {
            library.addCustomer("070677-484", "Matti Mainio", "Halmekatu 17 33100 Tampere",
                    "040 88888888", "matti.mainio@gmail.com", "837A12345");
        } catch (CustomException ex) {

        }
    }

    @BeforeEach
    @DisplayName("Create basic data.")
    public void createBasicData() {
        ;
    }

    @Test
    @DisplayName("test assertTrue")
    public void testAssertTrue() {
        log.info("Executing test testAssertTrue.");
        assertTrue(true);
    }

    @Test
    @DisplayName("test assertFalse")
    public void testAssertFalse() {
        log.info("Executing test assertFalse.");
        assertFalse(false);
    }

    @Test
    @DisplayName("Test adding another copy of the book already existing in the library.")
    public void testAddAnotherItemOfExistingBook(){
        log.info("Executing test testAddAnotherItemOfExistingBook.");
        int records_size = library.getRecords().size();
        int items_size = library.getItems().size();

        // Add another copy of the book already existing in the library.
        library.addBook("780f559d-28e3-4098-a575-8f647e3d83a6", "020-978-0-321-99278-9",
                "Stroustrup, Bjarne, kirjoittaja",
                "", 2018, "English",
                "61.3", "Non-fiction", "",
                "Upper Saddle River, NJ : Addison-Wesley, 2018. : ©2014",
                "xxxi, 1274 sivua ; kuvitettu, kaavioita; 24 cm ; nide", "978-0-321-99278-9",
                "Second edition, sixth printing.",
                "Sisältää bibliografisia lähdeviitteitä ja hakemiston. Julkaistu myös verkkoaineistona.");

        // Then no new records.
        Assertions.assertEquals(records_size, library.getRecords().size());
        // Items increased by one.
        Assertions.assertEquals(items_size + 1, library.getItems().size());
    }

    @Test
    @DisplayName("Test adding customer with non valid ssn.")
    public void testAddingCustomerWithNonValidSsn() {
        log.info("Executing test testAddingCustomerWithNonValidSsn.");
        assertThrows(CustomException.class,
                () -> {
                    library.addCustomer("050677-484", "Testi Asiakas", "Halmekatu 7 33100 Tampere",
                            "040 7777777", "testi.asiakas@gmail.com", "837A1234567");
                });
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
