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
    //3. Request
    //4. Session
    //5. Global

    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService(){

        //Constructor Injection
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());

        //Setter Injection
        //service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }
}
