@RestController
@RequestMapping("/health")
public class HealthController {
    @Autowired
    private HealthService healthService;
    
    @PostMapping("/add")
    public ResponseEntity<HealthMetric> addMetric(@RequestBody HealthMetric metric) {
        return ResponseEntity.ok(healthService.saveMetric(metric));
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<HealthMetric>> getAllMetrics() {
        return ResponseEntity.ok(healthService.getAllMetrics());
    }
}
