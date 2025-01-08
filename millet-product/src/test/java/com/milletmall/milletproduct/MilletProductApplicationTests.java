package com.milletmall.milletproduct;

import com.milletmall.milletproduct.entity.BrandEntity;
import com.milletmall.milletproduct.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MilletProductApplication.class)
public class MilletProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    public void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();

        brandEntity.setName("small millet");
        brandService.save(brandEntity);
        System.out.println("Successfully saved"+ brandEntity.getName());
    }

}
