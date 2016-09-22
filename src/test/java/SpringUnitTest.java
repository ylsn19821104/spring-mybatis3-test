import com.sky.mybatis.entity.Teacher;
import com.sky.mybatis.mapper.TeacherMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by hongxp on 2016/9/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class SpringUnitTest extends AbstractTransactionalJUnit4SpringContextTests {
    @Autowired
    private TeacherMapper teacherMapper;

    @Test
    public void test() {
        Teacher teacher = teacherMapper.selectByPrimaryKey(1);
        System.out.println(teacher);
    }
}
