@Entity
public class HealthMetric {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int steps;
    private int calories;
    private int sleepHours;
    private int heartRate;
    
    // Getters and Setters
}