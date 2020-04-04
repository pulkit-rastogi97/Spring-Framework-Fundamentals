import com.pulkit.repository.HibernateSpeakerRepositoryImpl;
import com.pulkit.repository.SpeakerRepository;
import com.pulkit.service.SpeakerService;
import com.pulkit.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
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

    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
//    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    public SpeakerService getSpeakerService(){

        //Constructor Injection
//        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());

        /**
         * For autowiring demo
         * we have commented both setter and constructor injection
         * and added @Autowired annotation to setter method
         */
        SpeakerServiceImpl service = new SpeakerServiceImpl();

        //Setter Injection
//        service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }
}
