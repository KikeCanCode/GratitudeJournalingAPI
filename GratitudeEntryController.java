
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@RestController
@RequestMapping(path = "/api/gratitudeentry")

public class GratitudeEntryController {

    @Autowired
    public GratitudeEntryX gratitudeEntry; // Instance of the service class

    public GratitudeEntryController(GratitudeEntryService gratitudeEntryService){ 
        this.gratitudeentryService = gratitudeentryService;
    }
    @PostMapping
    public ResponseEntity<GratitudeEntry> createGratitudeEntry(@RequestBody GratitudeEntry gratitudeEntry) {
        GratitudeEntry createGratitudeEntry = gratitudeEntryService.createGratitudeEntry(gratitudeEntry);
        return ResponseEntity.status(HttpStatus.CREATED).body(createGratitudeEntry);
    }
  
    @GetMapping // Get all GratitudeEntries
    public List<GratitudeEntry> getAllGratitudeEntry() {
        return gratitudeEntryService.getAllGratitudeEntry();
    }

    @GetMapping("/{id}") //("/{created}")// Get GratitudeEntry by user id? or something else?

    public ResponseEntity <GratitudeEntry> getGratitudeEntry(@PathVariable UUID id) {
    //public ResponseEntity <GratitudeEntry> getGratitudeEntry(@PathVariable String created) {
        try {
            return new ResponseEntity<>(gratitudeEntryService.getGratitudeEntry(id),HttpStatus.OK);
        } catch (NoSuchElementException noSuchElementException) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    public ResponseEntity<GratitudeEntry>updatedGratitudeentry(@PathVariable UUID userId, @RequestBody Gratitudeentry updatedGratitudeEntry) {
        try {
            GratitudeEntry updatedgraGratitudeEntry = gratitudeService.updateGratitudeEntry(id, updatedGratitudeEntry);
            return ResponseEntity.status(HttpStatus.OK).body(updatedgraGratitudeEntry);    
        } catch (NoSuchElementException noSuchElementException) {// when an element cannot be found.
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

   
    }

}
//https://naveen-metta.medium.com/mastering-exception-handling-in-spring-boot-a-comprehensive-guide-fa3f916d1981#:~:text=In%20Spring%20Boot%2C%20you%20have,exceptions%2C%20managing%20specific%20HTTP%20statusGr