package ayaz.doguhan.services;

public class PrimaryGermanGreetingService implements GreetingService {

    GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting()
    {
        return greetingRepository.getGermanGreeting();
    }
}
