package com.zmo.FlashCard;
import java.util.List;

public class MultipleChoiceQuestion extends Terminology {
    private String question;
    private List<String> options;
    private int correctOptionIndex;

    public MultipleChoiceQuestion(String term, String definition, String chapter, List<String> options, int correctOptionIndex) {
        super(term, definition, chapter);
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    public String getQuestion() {
        return question;
    }

    public int getCorrectOptionIndex() {
        return correctOptionIndex;
    }

    public List<String> getOptions() {
        return options;
    }
    public boolean isCorrect(int selectedOptionIndex) {
        return selectedOptionIndex == correctOptionIndex;
    }
    @Override
    public String getDefinition() {
        String definition = super.getDefinition();
        StringBuilder fullDefinition = new StringBuilder(definition);
        fullDefinition.append("\nOptions:");
        for (int i = 0; i < options.size(); i++) {
            fullDefinition.append("\n").append(i + 1).append(". ").append(options.get(i));
        }
        return fullDefinition.toString();
    }
}
