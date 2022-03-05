class Language{
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  Language(String name, int numSpeakers, String regionsSpoken, String wordOrder){
    this.name = name;
    this.numSpeakers = numSpeakers;
    this.regionsSpoken = regionsSpoken;
    this.wordOrder = wordOrder;
  }

  public void getInfo(){
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder);
  }

  public static void main(String[] args){
    Language german = new Language("German", 132_000_000, "Europe", "subject-verb-object");
    Mayan mam = new Mayan("Mam", 488_500); 
    SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
    SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);

    mam.getInfo();
    german.getInfo();
    mandarin.getInfo();
    burmese.getInfo();


  }

}