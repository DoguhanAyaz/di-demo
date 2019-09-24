package ayaz.doguhan.didemo;

import ayaz.doguhan.didemo.controllers.ConstructorInjectedController;
import ayaz.doguhan.didemo.controllers.GetterInjectedController;
import ayaz.doguhan.didemo.controllers.MyController;
import ayaz.doguhan.didemo.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"ayaz.doguhan.services","ayaz.doguhan.didemo"})
public class DiDemoDiOptionsInSpringApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoDiOptionsInSpringApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

//       controller.hello();

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
