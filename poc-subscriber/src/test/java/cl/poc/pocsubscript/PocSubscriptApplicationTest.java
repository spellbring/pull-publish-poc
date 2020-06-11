package cl.poc.pocsubscript;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PocSubscriptApplicationTest {


    @Test
    void main() {
    }

    @Test
    void messageChannelAdapter() {
    }

    @Test
    void pubsubInputChannel() {

        PocSubscriptApplication nibblerSubscriptorApplication = new PocSubscriptApplication();
        assertNotNull(nibblerSubscriptorApplication.messageReceiver());
    }

    @Test
    void messageReceiver() {


    }
}