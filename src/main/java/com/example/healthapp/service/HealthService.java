```java
@Service
public class HealthService {
    @Autowired
    private HealthRepository healthRepository;
    
    public HealthMetric saveMetric(HealthMetric metric) {
        return healthRepository.save(metric);
    }
    
    public List<HealthMetric> getAllMetrics() {
        return healthRepository.findAll();
    }
}
```