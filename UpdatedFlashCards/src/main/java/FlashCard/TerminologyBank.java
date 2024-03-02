package FlashCard;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TerminologyBank {
    private List<Terminology> terminologies;

    public TerminologyBank() {
        this.terminologies = new ArrayList<>();
    }

    public void addTerminology(Terminology terminology) {
        terminologies.add(terminology);
    }

    // Method to get terminologies, possibly filtered by chapter
    public List<Terminology> getTerminologiesByChapter(String chapter) {
        return terminologies.stream()
                .filter(t -> t.getChapter().equals(chapter))
                .collect(Collectors.toList());
    }

}