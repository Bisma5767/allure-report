package allureeexamples;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

@Epic("Just an epic")
@Feature("Pass feature")
public class EpicFeatureStoryTest {
   @Test
   public void tcl1() {
      CalculatorStep steps = new CalculatorStep();
      steps.writeText("This is important information");


   }
   @Story("This is an image attachment example")
   @DisplayName("This is an image attachment example")
   @Test
   public void tc2() throws IOException {

      CalculatorStep steps = new CalculatorStep();

      BufferedImage bufferImage = ImageIO.read(
              new File( System.getProperty("user.dir") +File.separator + "IMG_9144.png" ));

      ByteArrayOutputStream byteArrOS =  new ByteArrayOutputStream();
      ImageIO.write(bufferImage , "png" , byteArrOS);

      byte[] imageData =  byteArrOS.toByteArray();

      steps.attachImage(imageData);
   }
}

