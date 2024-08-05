package sn.uimcec.intranet.validator;

import org.springframework.util.StringUtils;
import sn.uimcec.intranet.dto.AgenceDto;
import sn.uimcec.intranet.dto.PointServiceDto;

import java.util.ArrayList;
import java.util.List;

public class AgenceValidator {


    public static List<String> validate(AgenceDto agenceDto){

        List<String> errors = new ArrayList<>();

        if (agenceDto == null) {

            errors.add("Veuillez renseigner l'agence");
            errors.add("Veuillez renseigner la caisse'");

            return errors;
        }



        if (!StringUtils.hasLength(String.valueOf(agenceDto.getEntite()))) {
            errors.add("Veuillez renseigner la Caisse");
        }

        return errors;

    }
}
