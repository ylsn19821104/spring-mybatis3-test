import com.sky.mybatis.dao.SchoolDao;
import com.sky.mybatis.entity.Teacher;
import com.sky.mybatis.mapper.TeacherMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hongxp on 2016/9/22.
 */
public class SpringMyBatisTest {

    ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
    }

    @Test
    public void test() {
        SchoolDao schoolDao = (SchoolDao) applicationContext.getBean("schoolDao");
        System.out.println(schoolDao.selectByPrimaryKey(2));
    }

    @Test
    public void testCollection() {
        TeacherMapper teacherMapper = applicationContext.getBean(TeacherMapper.class);
        Teacher teacher = teacherMapper.selectByPrimaryKey(1);
        System.out.println(teacher);
    }
}
