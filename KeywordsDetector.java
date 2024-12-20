public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        
        for(int i=0;i<sentences.length;i++){
            for(int j=0;j<keywords.length;j++){
                
                for(int x=0;x<sentences[i].length();x++){
                    if(sentences[i].length()-x>keywords[j].length())
                    {
                        if(sentences[i].charAt(x)==keywords[j].charAt(0)||sentences[i].charAt(x)==keywords[j].charAt(0)+32||(int)
                        sentences[i].charAt(x)+32==keywords[j].charAt(0))
                        {
                            if(sentences[i].substring(x+1,x+keywords[j].length()).equals(keywords[j].substring(1)))
                        {System.out.println(sentences[i]);
                            break;}}
                }}
            }
        }
    }
}
