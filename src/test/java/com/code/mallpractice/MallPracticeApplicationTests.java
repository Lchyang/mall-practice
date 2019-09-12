package com.code.mallpractice;

import com.code.mallpractice.mbg.mapper.PmsBrandMapper;
import com.code.mallpractice.mbg.model.PmsBrand;
import com.code.mallpractice.mbg.model.PmsBrandExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallPracticeApplicationTests {
    @Autowired
    private PmsBrandMapper brandMapper;

    @Test
    public void testSelectByExample() {
        List<PmsBrand> pmsBrandList = brandMapper.selectByExample(new PmsBrandExample());
        for (PmsBrand pmsBrand : pmsBrandList) {
            System.out.println(pmsBrand.getName());
        }
    }

}
