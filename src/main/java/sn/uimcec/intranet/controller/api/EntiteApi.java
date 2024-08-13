package sn.uimcec.intranet.controller.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sn.uimcec.intranet.dto.EntiteDto;

import java.util.List;

import static sn.uimcec.intranet.utils.Constants.APP_ROOT;

public interface EntiteApi {


    @PostMapping(value = APP_ROOT + "/entite/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Enregistrer une entité", description = "Cette methode permet d'enregistrer ou modifier une entite")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "L'objet entite cree / modifie"),
            @ApiResponse(responseCode = "400", description = "L'objet entite n'est pas valide")
    })
    EntiteDto save(@RequestBody EntiteDto dto);

    @GetMapping(value = APP_ROOT + "/entite/{identite}", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Rechercher une entite par ID", description = "Cette methode permet de chercher une entite par son ID")

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "La entite a ete trouve dans la BDD"),
            @ApiResponse(responseCode = "404", description = "Aucune entite n'existe dans la BDD avec l'ID fourni")
    })
    EntiteDto findById(@PathVariable("identite") Integer id);

    // @GetMapping(value = APP_ROOT + "/articles/filter/{codeArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    // @ApiOperation(value = "Rechercher un article par CODE", notes = "Cette methode permet de chercher un article par son CODE", response =
    //    ArticleDto.class)
    // @ApiResponses(value = {
    //       @ApiResponse(code = 200, message = "L'article a ete trouve dans la BDD"),
    //      @ApiResponse(code = 404, message = "Aucun article n'existe dans la BDD avec le CODE fourni")
    // })
    //ArticleDto findByCodeArticle(@PathVariable("codeArticle") String codeArticle);

    @GetMapping(value = APP_ROOT + "/entite/all", produces = MediaType.APPLICATION_JSON_VALUE)
        // @ApiOperation(value = "Renvoi la liste des articles", notes = "Cette methode permet de chercher et renvoyer la liste des articles qui existent "
        //      + "dans la BDD", responseContainer = "List<ArticleDto>")
        //@ApiResponses(value = {
        //      @ApiResponse(code = 200, message = "La liste des article / Une liste vide")
        // })
    List<EntiteDto> findAll();

    //@GetMapping(value = APP_ROOT + "/articles/historique/vente/{idArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    // List<LigneVenteDto> findHistoriqueVentes(@PathVariable("idArticle") Integer idArticle);

    // @GetMapping(value = APP_ROOT + "/articles/historique/commandeclient/{idArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    //List<LigneCommandeClientDto> findHistoriaueCommandeClient(@PathVariable("idArticle") Integer idArticle);

    // @GetMapping(value = APP_ROOT + "/articles/historique/commandefournisseur/{idArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    //List<LigneCommandeFournisseurDto> findHistoriqueCommandeFournisseur(@PathVariable("idArticle") Integer idArticle);



    @DeleteMapping(value = APP_ROOT + "/entite/delete/{identite}")
        // @ApiOperation(value = "Supprimer un article", notes = "Cette methode permet de supprimer une categorie par ID")
        // @ApiResponses(value = {
        //     @ApiResponse(code = 200, message = "La categorie a ete supprime")
        //})
    void delete(@PathVariable("identite") Integer id);
}
