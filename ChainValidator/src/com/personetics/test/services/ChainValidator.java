package com.personetics.test.services;


import com.personetics.test.models.Node;

import java.util.ArrayList;
import java.util.List;

public class ChainValidator {

    public boolean validate(List<Node> nodes){

        List<String> nodesValuesToValidate = new ArrayList<>();
        List<String> nodesValuesToCompare = new ArrayList<>();

        for (Node value : nodes){
            if(value.getValue().length() > 1 ){
                nodesValuesToValidate.add(value.getValue().toLowerCase());
            } else {
                nodesValuesToCompare.add(value.getValue().toLowerCase());
            }
        }

        return compareChainList(nodesValuesToValidate, nodesValuesToCompare);
    }


    private static boolean compareChainChar(String valueToValidate, List<String> listToCompare){
        return listToCompare.contains(valueToValidate);
    }

    private static boolean  compareChainList(List<String> nodesValuesToValidate, List<String> nodesValuesToCompare) {
        boolean resultBoolean = false;
        for (String value : nodesValuesToValidate) {
            for(int i = 0; i < value.length(); i++){
                if(!compareChainChar(String.valueOf(value.charAt(i)), nodesValuesToCompare)){
                    return false;
                } else {
                    resultBoolean =  true;
                }
            }
        }
        return  resultBoolean;
    }

}
