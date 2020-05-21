package org.zerock.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.demo.aws.S3Uploader;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    S3Uploader s3Uploader;

    @Test
    void contextLoads() {

        System.out.println(s3Uploader);
    }

}
