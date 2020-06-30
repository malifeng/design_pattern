package com.mlf.tank;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class TankTest {

    @org.junit.Test
    public void setX() {
        try {
            BufferedImage image = ImageIO.read(new File("/Users/unicareer/IdeaProjects/design_pattern/src/main/resources/images/3.gif"));
            InputStream resourceAsStream = TankTest.class.getClassLoader().getResourceAsStream("images/bulletD.gif");
            System.out.println(resourceAsStream);
            BufferedImage image1 = ImageIO.read(resourceAsStream);
            System.out.println(image1);
            assertNotNull(image);
            assertNotNull(image1);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @org.junit.Test
    public void setY() {
    }
}
