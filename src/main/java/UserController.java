import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：mizhaoya
 * @date ：2020/3/31 17:27
 * @description：
 */
public class UserController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        List<User2> userList = new ArrayList<User2>();
        User2 userA = new User2();
        User2 userB = new User2();
        userA.setUsername("张三");
        userA.setAge(27);
        userB.setUsername("李四");
        userB.setAge(37);
        userList.add(userA);
        userList.add(userB);
        System.out.print("test->");
        return new ModelAndView("/userlist", "users", userList);
    }
}
