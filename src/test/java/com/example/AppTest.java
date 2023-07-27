package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    void convertGlobalTest() {
        String date = "2023-07-27T01:00:00Z";
        Instant data = Instant.parse(date);
        LocalDateTime r1 = LocalDateTime.ofInstant(data, ZoneId.systemDefault());

        assertEquals("2023-07-26T22:00", r1.toString());
    }
}
