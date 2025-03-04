```java
@Repository
public interface HealthRepository extends JpaRepository<HealthMetric, Long> {
}
```

5. **`HealthService.java` (Service Layer)**
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