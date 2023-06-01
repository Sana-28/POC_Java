
import org.example.service.TodoBusiness;
import org.example.todoInter.TodoService;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;
public class TodoBusinessMock {

    @Test
    public void getTodosforHibernateTestUsingMMocks(){
        TodoService todoService= Mockito.mock(TodoService.class);

       // List<String> combList= Arrays.asList(new String[]{"core java", "spring", "hibernate"});
        List<String> combinedlist = Arrays.asList(" Use Core Java ", " Use Spring Core ", " Use w3eHibernate ", " Use Spring MVC ");

        Mockito.when(todoService.getTodos("dummy")).thenReturn(combinedlist);

        TodoBusiness todoBusiness=new TodoBusiness(todoService);
        List<String> allTodos= todoBusiness.getTodosforHibernate("dummy");
        System.out.println(allTodos);
        Assert.assertEquals(1, allTodos.size());
    }
}
