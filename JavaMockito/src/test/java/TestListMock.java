import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;
import org.junit.Test;
import org.mockito.Mock;

public class TestListMock {

    @Test
    public void testList(){
        List<String > list= mock(List.class);
        when(list.size()).thenReturn(1);

        assertEquals(1, list.size());
        assertEquals(1, list.size());

        System.out.println( list.size());
        System.out.println(list);

    }

    @Test
    public void testList_Returns_MultipleValues() {

        List mocklist = mock(List.class);
        when(mocklist.size()).thenReturn(1).thenReturn(2).thenReturn(3);

        assertEquals(1, mocklist.size());
        assertEquals(2, mocklist.size());
        assertEquals(3, mocklist.size());

        System.out.println(mocklist.size());
        System.out.println(mocklist);

    }

    @Test
    public void testList_get() {

        List mocklist = mock(List.class);

        when(mocklist.get(0)).thenReturn("Mockito");

        assertEquals("Mockito", mocklist.get(0));
        System.out.println(mocklist.get(0));
    }
}
