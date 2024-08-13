package sn.uimcec.intranet.validator;

import org.springframework.util.StringUtils;
import sn.uimcec.intranet.dto.EntiteDto;

import java.util.ArrayList;
import java.util.List;

public class EntiteValidator {


    public static List<String> validate(EntiteDto entiteDto){

        List<String> errors = new ArrayList<>();

        if (entiteDto == null || !StringUtils.hasLength(entiteDto.getNom())) {
            errors.add("Veuillez renseigner le code de la categorie");
        }
        return errors;
    }


}
