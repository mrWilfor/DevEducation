package HomeWork.HW_7_04_05_2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordWithVariousCharactersTest {

    @Test
    void searchWordTest1() {
        String str = "Anime it is soo hard content";
        String expected = "Anime it";

        assertTrue(
                expected.equals(WordWithVariousCharacters.searchWord(str)),
                "Test failed"
        );
    }

    @Test
    void searchWordTest2() {
        String str = "Aniime iti isi soo hardr content";
        String expected = "Words with various characters not found";

        assertTrue(
                expected.equals(WordWithVariousCharacters.searchWord(str)),
                "Test failed"
        );
    }

    @Test
    void searchWordTest3() {
        String str = "Anime iti isi soo hardr content";
        String expected = "Anime";

        assertTrue(
                expected.equals(WordWithVariousCharacters.searchWord(str)),
                "Test failed"
        );
    }
}