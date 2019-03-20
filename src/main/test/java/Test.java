import com.github.pagehelper.PageHelper;
import com.ssm.mapper.UserMapper;
import com.ssm.pojo.User;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-dao.xml")
public class Test {
    @Autowired
    private UserMapper userMapper;

   @org.junit.Test
    public void run(){
       PageHelper.startPage(1,5);
       List<User> users = userMapper.selectByExample(null);
       System.out.println(users);


    }
}
