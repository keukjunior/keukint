package sn.uimcec.intranet.validator;

import java.util.ArrayList;
import java.util.List;

public class DirectionValidator {

    public static List<String> validate(DirectionDto directionDto){

        List<String> errors = new ArrayList<>();

        if (directionDto == null) {

            errors.add("Veuillez renseigner la Direction");
            errors.add("Veuillez renseigner l'entité'");

            return errors;
        }



        if ( directionDto.getEntite() == null ||  directionDto.getEntite().getId() == null) {
            errors.add("Veuillez selectionner une entité");
        }

        return errors;

    }
}
