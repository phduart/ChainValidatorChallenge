import com.personetics.test.models.Node;
import com.personetics.test.services.ChainValidator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        caseOne(); // True
        caseTwo(); // False
        caseThree(); // True
        caseFour(); // False

    }

    private static void caseOne(){
        ChainValidator chainValidator = new ChainValidator();

        List<Node> nodesValues = new ArrayList<>();
        nodesValues.add(new Node("27"));
        nodesValues.add(new Node("3"));
        nodesValues.add(new Node("2"));
        nodesValues.add(new Node("7"));
        nodesValues.add(new Node("47"));
        nodesValues.add(new Node("4"));
        nodesValues.add(new Node("24"));
        nodesValues.add(new Node("6"));
        nodesValues.add(new Node("36"));

        System.out.println(chainValidator.validate(nodesValues));
    }

    private static void caseTwo(){
        ChainValidator chainValidator = new ChainValidator();

        List<Node> nodesValues = new ArrayList<>();
        nodesValues.add(new Node("27"));
        nodesValues.add(new Node("2"));
        nodesValues.add(new Node("7"));
        nodesValues.add(new Node("47"));
        nodesValues.add(new Node("4"));
        nodesValues.add(new Node("24"));
        nodesValues.add(new Node("6"));
        nodesValues.add(new Node("36"));

        System.out.println(chainValidator.validate(nodesValues));
    }

    private static void caseThree(){
        ChainValidator chainValidator = new ChainValidator();

        List<Node> nodesValues = new ArrayList<>();
        nodesValues.add(new Node("p"));
        nodesValues.add(new Node("aba"));
        nodesValues.add(new Node("a"));
        nodesValues.add(new Node("b"));
        nodesValues.add(new Node("perso"));
        nodesValues.add(new Node("o"));
        nodesValues.add(new Node("r"));
        nodesValues.add(new Node("e"));
        nodesValues.add(new Node("s"));

        System.out.println(chainValidator.validate(nodesValues));
    }

    private static void caseFour(){
        ChainValidator chainValidator = new ChainValidator();

        List<Node> nodesValues = new ArrayList<>();
        nodesValues.add(new Node("p"));
        nodesValues.add(new Node("aba"));
        nodesValues.add(new Node("a"));
        nodesValues.add(new Node("perso"));
        nodesValues.add(new Node("o"));
        nodesValues.add(new Node("r"));
        nodesValues.add(new Node("e"));
        nodesValues.add(new Node("s"));

        System.out.println(chainValidator.validate(nodesValues));
    }
}