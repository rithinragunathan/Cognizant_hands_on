package com.cognizant.javaframeworks;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaFrameworksApplicationTests {
    private LoginAuthenticator auth;

    @BeforeEach
    protected void setup() {
        auth = new LoginAuthenticator();
        System.out.println("Authenticator instance created");
    }

    @AfterEach
    protected void tearDown() {
        auth = null;
        System.gc();
        System.out.println("Clearing objects");
    }

    @Test
    protected void authTest() {
        String usr = "admin";
        String pwd = "admin";

        boolean authenticated = auth.authenticate(usr,pwd);

        assert(authenticated);

    }
}
