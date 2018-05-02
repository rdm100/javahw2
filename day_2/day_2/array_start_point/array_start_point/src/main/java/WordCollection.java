public class WordCollection {
    private String[] myWords;

    public WordCollection(String[] myWords) {
        this.myWords = new String[5];
    }

    public int getWordCount(){
        return this.myWords.length;
    }

}
