import com.pulkit.repository.HibernateSpeakerRepositoryImpl;
import com.pulkit.repository.SpeakerRepository;
import com.pulkit.service.SpeakerService;
import com.pulkit.service.SpeakerServiceImpl;
import com.pulkit.util.CalenderFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;
import java.util.concurrent.ExecutionException;

@Configuration
//For fully autowiring : we use stereotype annotations
@ComponentScan({"com.pulkit"})
public class AppConfig {

    //5 Scopes available
    //1. Singleton : by default
        //Single instance per spring container
    //2. Prototype
        //Unique bean per request
    //3. Request
        //Unique object per HTTP request
    //4. Session
        //Object scope stays till the time a session is live.
    //5. Global
        //Uniques object per application, as from the time of deployement to reboot or undeployement


    /**
     * For this project
     */
    @Bean(name = "cal")
    public CalenderFactory calenderFactory(){
        CalenderFactory calenderFactory = new CalenderFactory();
        calenderFactory.addDays(2);
        return calenderFactory;
    }

    @Bean
    public Calendar calendar() throws Exception{
        return calenderFactory().getObject();
    }

    /**
     *  THIS IS BEING Commented TO TRY STEREOTYPE ANNOTATIONS
     *  1. ComponentScan
     *  2. Component : For POJOs Bean
     *  3. Service : For Service Class
     *  4. Repository : For DB Ops Class
     *
     *          No Bean definition required now
     *
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
//    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    public SpeakerService getSpeakerService(){

        //Constructor Injection
//        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());

        //
         //* For autowiring demo
         //* we have commented both setter and constructor injection
         //* and added @Autowired annotation to setter method

        SpeakerServiceImpl service = new SpeakerServiceImpl();

        //Setter Injection
//        service.setRepository(getSpeakerRepository());
        return service;
    }


    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }

    */


}
