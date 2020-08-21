package com.wno704.boot;

import com.wno704.boot.model.Student;
import com.wno704.boot.service.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = EhcacheApplication.class)
class EhcacheApplicationTests {

    @Autowired
    private StudentService studentService;

    @Test
    public void test1() throws Exception {
        Student student1 = this.studentService.queryStudentBySno(1);
        System.out.println("学号" + student1.getSno() + "的学生姓名为：" + student1.getName());

        Student student2 = this.studentService.queryStudentBySno(1);
        System.out.println("学号" + student2.getSno() + "的学生姓名为：" + student2.getName());

        Student student3 = this.studentService.queryStudentBySno(1);
        System.out.println("学号" + student3.getSno() + "的学生姓名为：" + student3.getName());
    }

    @Test
    public void test2() throws Exception {
        Student student1 = this.studentService.queryStudentBySno(1);
        System.out.println("学号" + student1.getSno() + "的学生姓名为：" + student1.getName());

        student1.setName("康康");
        this.studentService.update(student1);

        Student student2 = this.studentService.queryStudentBySno(1);
        System.out.println("学号" + student2.getSno() + "的学生姓名为：" + student2.getName());

        Student student3 = this.studentService.queryStudentBySno(1);
        System.out.println("学号" + student3.getSno() + "的学生姓名为：" + student3.getName());
    }

}
