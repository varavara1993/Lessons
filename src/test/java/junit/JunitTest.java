package junit;

import org.junit.jupiter.api.*;

public class JunitTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println(" Это метод beforeAll");
    }
    @AfterAll
    static void afterAll() {
        System.out.println(" Это метод @AfterAll");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("    Это метод @BeforeEach");

    }
    @AfterEach
    void afterEach(){
        System.out.println("    Это метод @AfterEach");
    }


    @Test
    void firstTest() {
        System.out.println("Это тест");
        Assertions.assertTrue(3>2);
    }

}
