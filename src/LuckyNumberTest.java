import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterTest;

class LuckyNumberTest {



        @Test
        public void testNine() {
            LuckyNumber lk=new LuckyNumber();
            String result = lk.Tryno(9);
            assertEquals(result,"congratulations you win!");

        }
        @Test
        public void testValidNo(){
            LuckyNumber lk=new LuckyNumber();
            String result = lk.Tryno(7);
            assertEquals(result,"sorry you lose");
        }
        @Test
        public void testInvalidNo(){
            LuckyNumber lk=new LuckyNumber();
            String result = lk.Tryno(13);
            assertEquals(result,"invalid number");
        }


    }

