import com.sky.mybatis.entity.Address;
import com.sky.mybatis.entity.School;
import com.sky.mybatis.entity.Teacher;
import com.sky.mybatis.entity.User;
import com.sky.mybatis.mapper.AddressMapper;
import com.sky.mybatis.mapper.SchoolMapper;
import com.sky.mybatis.mapper.TeacherMapper;
import com.sky.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by hongxp on 2016/9/21.
 */
public class TestMain {
    SqlSessionFactory factory;

    @Before
    public void init() throws IOException {
        String resource = "mybatis.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        System.out.println(sqlSessionFactory.getConfiguration());
        factory = sqlSessionFactory;
    }


    @Test
    public void insertSchool() {
        /*SqlSession sqlSession = factory.openSession();

        School school = new School();
        school.setName(UUID.randomUUID().toString().replace("-", ""));
        sqlSession.insert("com.sky.mybatis.entity.School.insert", school);
        sqlSession.commit();

        System.err.println(school.getSid());*/
        School school = new School();
        SqlSession sqlSession2 = factory.openSession();
        SchoolMapper mapper = sqlSession2.getMapper(SchoolMapper.class);
        school.setName(UUID.randomUUID().toString().replace("-", ""));
        mapper.insert(school);
        sqlSession2.commit();
        System.err.println(school.getSid());
    }

    @Test
    public void testUpdateSchool() {
        SqlSession sqlSession = factory.openSession();
        SchoolMapper schoolMapper = sqlSession.getMapper(SchoolMapper.class);

        School school = schoolMapper.selectByPrimaryKey(1);
        school.setName("haha");
        schoolMapper.update(school);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testDeleteSchool() {
        SqlSession sqlSession = factory.openSession();
        SchoolMapper schoolMapper = sqlSession.getMapper(SchoolMapper.class);

        schoolMapper.deleteByPrimaryKey(1);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testInsertTeacher() {
        SqlSession sqlSession = factory.openSession();
        SchoolMapper schoolMapper = sqlSession.getMapper(SchoolMapper.class);
        School school = schoolMapper.selectByPrimaryKey(2);

        Teacher teacher = new Teacher(uuid(), new Date(), school);
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        teacherMapper.insert(teacher);
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void testSelectTeacher() {
        SqlSession sqlSession = factory.openSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher = teacherMapper.selectByPrimaryKey(1);
        System.err.println(teacher);
        System.err.println(teacher.getSchool());
        sqlSession.close();

    }


    @Test
    public void testSelectAnnotation() {
        SqlSession sqlSession = factory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectWithAddress(205);
        System.err.println("user: " + user);

        List<User> users = userMapper.findAll();
        System.out.println(users);
        sqlSession.close();

    }

    @Test
    public void testInsertAnnotation() {
        SqlSession sqlSession = factory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setCreated(new Date());
        user.setName("mayun");
        user.setSummary("alibaba");

        userMapper.add(user);
        System.err.println("user: " + user);

        sqlSession.commit();
        sqlSession.close();

    }


    @Test
    public void testInsertAddressAnnotation() {
        SqlSession sqlSession = factory.openSession();
        AddressMapper addressMapper = sqlSession.getMapper(AddressMapper.class);
        Address address = new Address();
        address.setName("上海市浦东新区张江高科");

        addressMapper.insert(address);

        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void testSelectAddressAnnotation() {
        SqlSession sqlSession = factory.openSession();
        AddressMapper addressMapper = sqlSession.getMapper(AddressMapper.class);
        Address address = new Address();
        address.setName("上海市浦东新区张江高科");

        addressMapper.insert(address);

        sqlSession.commit();
        sqlSession.close();

    }

    public String uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    @After
    public void destroy() {
        factory = null;
    }
}
