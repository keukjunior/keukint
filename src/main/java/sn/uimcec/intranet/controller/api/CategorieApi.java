package sn.uimcec.intranet.controller.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sn.uimcec.intranet.dto.AnnonceDto;
import sn.uimcec.intranet.dto.CategorieDto;

import java.util.List;

import static sn.uimcec.intranet.utils.Constants.APP_ROOT;

public interface CategorieApi {


    @PostMapping(value = APP_ROOT + "/categories/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Enregistrer une categorie", description = "Cette methode permet d'enregistrer ou modifier une categorie")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "L'objet categorie cree / modifie"),
            @ApiResponse(responseCode = "400", description = "L'objet categorie n'est pas valide")
    })
    CategorieDto save(@RequestBody CategorieDto dto);

    @GetMapping(value = APP_ROOT + "/categorie/{idcategorie}", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Rechercher une categorie par ID", description = "Cette methode permet de chercher une categorie par son ID")

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "La categorie a ete trouve dans la BDD"),
            @ApiResponse(responseCode = "404", description = "Aucune categorie n'existe dans la BDD avec l'ID fourni")
    })
    CategorieDto findById(@PathVariable("idcategorie") Integer id);

    // @GetMapping(value = APP_ROOT + "/articles/filter/{codeArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    // @ApiOperation(value = "Rechercher un article par CODE", notes = "Cette methode permet de chercher un article par son CODE", response =
    //    ArticleDto.class)
    // @ApiResponses(value = {
    //       @ApiResponse(code = 200, message = "L'article a ete trouve dans la BDD"),
    //      @ApiResponse(code = 404, message = "Aucun article n'existe dans la BDD avec le CODE fourni")
    // })
    //ArticleDto findByCodeArticle(@PathVariable("codeArticle") String codeArticle);

    @GetMapping(value = APP_ROOT + "/categorie/all", produces = MediaType.APPLICATION_JSON_VALUE)
        // @ApiOperation(value = "Renvoi la liste des articles", notes = "Cette methode permet de chercher et renvoyer la liste des articles qui existent "
        //      + "dans la BDD", responseContainer = "List<ArticleDto>")
        //@ApiResponses(value = {
        //      @ApiResponse(code = 200, message = "La liste des article / Une liste vide")
        // })
    List<CategorieDto> findAll();

    //@GetMapping(value = APP_ROOT + "/articles/historique/vente/{idArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    // List<LigneVenteDto> findHistoriqueVentes(@PathVariable("idArticle") Integer idArticle);

    // @GetMapping(value = APP_ROOT + "/articles/historique/commandeclient/{idArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    //List<LigneCommandeClientDto> findHistoriaueCommandeClient(@PathVariable("idArticle") Integer idArticle);

    // @GetMapping(value = APP_ROOT + "/articles/historique/commandefournisseur/{idArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    //List<LigneCommandeFournisseurDto> findHistoriqueCommandeFournisseur(@PathVariable("idArticle") Integer idArticle);



    @DeleteMapping(value = APP_ROOT + "/categories/delete/{idcategorie}")
        // @ApiOperation(value = "Supprimer un article", notes = "Cette methode permet de supprimer une categorie par ID")
        // @ApiResponses(value = {
        //     @ApiResponse(code = 200, message = "La categorie a ete supprime")
        //})
    void delete(@PathVariable("idcategorie") Integer id);
}
