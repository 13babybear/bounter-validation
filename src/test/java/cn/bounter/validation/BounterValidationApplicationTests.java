package cn.bounter.validation;

import cn.bounter.validation.entity.Bounter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BounterValidationApplicationTests {

    //参数校验器
    @Autowired
    private Validator validator;


    /**
     * 测试手动触发校验
     */
    @Test
    public void testValidation() {
        Bounter bounter = new Bounter().setName("").setAge(17);

        Set<ConstraintViolation<Bounter>> violationSet = validator.validate(bounter);
        violationSet.forEach(violation -> {
            //name不能为空
            //age最小不能小于18
            System.out.println(violation.getPropertyPath() + violation.getMessage());
        });
    }

}
