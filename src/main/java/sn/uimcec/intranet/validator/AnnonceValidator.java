package sn.uimcec.intranet.validator;

import org.springframework.util.StringUtils;
import sn.uimcec.intranet.dto.AnnonceDto;

import java.util.ArrayList;
import java.util.List;

public class AnnonceValidator {


    public static List<String> validate(AnnonceDto dto){

        List<String> errors = new ArrayList<>();

        if (dto == null) {
            errors.add("Veuillez renseigner le le titre'");
            errors.add("Veuillez renseigner le contenu");
            errors.add("Veuillez renseigner le document'");
            errors.add("Veuillez renseigner la date ");
            errors.add("Veuillez renseigner le categorie'");

            return errors;
        }


        if (!StringUtils.hasLength(dto.getTitre())) {
            errors.add("Veuillez renseigner le titre'");
        }

        if (!StringUtils.hasLength(dto.getContenu())) {
            errors.add("Veuillez renseigner le contenu'");
        }

        if (!StringUtils.hasLength(dto.getDocument())) {
            errors.add("Veuillez renseigner le document'");
        }

        if (dto.getDatepub()==null) {
            errors.add("Veuillez renseigner la date");
        }
        if ( dto.getCategorieDto() == null ||  dto.getCategorieDto().getId() == null) {
            errors.add("Veuillez selectionner la catégorie");
        }



        return errors;

    }

}
