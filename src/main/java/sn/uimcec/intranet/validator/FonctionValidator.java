package sn.uimcec.intranet.validator;

import org.springframework.util.StringUtils;
import sn.uimcec.intranet.dto.EntiteDto;
import sn.uimcec.intranet.dto.FonctionDto;

import java.util.ArrayList;
import java.util.List;

public class FonctionValidator {
    public static List<String> validate(FonctionDto Dto){

        List<String> errors = new ArrayList<>();

        if (Dto == null || !StringUtils.hasLength(Dto.getNom())) {
            errors.add("Veuillez renseigner le code de la fonction");
        }
        return errors;
    }
}
