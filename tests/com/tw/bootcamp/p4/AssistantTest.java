package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AssistantTest {

    @Test
    void shouldDisplayParkingLots() {
        Assistant mockAssistant = mock(Assistant.class);
        mockAssistant.display();
        verify(mockAssistant).display();
    }
}
