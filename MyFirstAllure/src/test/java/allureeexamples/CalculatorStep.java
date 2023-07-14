package allureeexamples;
import MyFirstAlluretest.Calculator;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
public class CalculatorStep {


        @Step("Adding 2 numbers: {0} & {1}")
        public double add2Numbers(double n1, double n2) {
 Calculator addnum= new Calculator();
  return addnum.add2Num(n1,n2);


        }


      /*  public double sub2Numbers(double n1, double n2) {


            return n1-n2;
        }

        public double mul2Numbers(double n1, double n2) {


            return n1*n2;
        }

        public double div2Numbers(double n1, double n2) {


            return n1/n2;
        }*/
        @Attachment(value="{0}" , type = "text/plain")
        public String writeText( String message) {
            return message;
        }

        @Attachment(value="Im" , type = "image/png")
        public byte[] attachImage( byte[] image) {
            return image;
        }

    }


