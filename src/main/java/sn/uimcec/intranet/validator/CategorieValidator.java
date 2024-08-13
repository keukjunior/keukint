package sn.uimcec.intranet.validator;

import org.springframework.util.StringUtils;
import sn.uimcec.intranet.dto.CategorieDto;

import java.util.ArrayList;
import java.util.List;

public class CategorieValidator {


    public static List<String> validate(CategorieDto categoryDto) {
        List<String> errors = new ArrayList<>();

        if (categoryDto == null || !StringUtils.hasLength(categoryDto.getNom())) {
            errors.add("Veuillez renseigner le nom de la categorie");
        }
        return errors;
    }
}
