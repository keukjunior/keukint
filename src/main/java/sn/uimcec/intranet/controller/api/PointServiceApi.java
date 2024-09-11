package sn.uimcec.intranet.controller.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sn.uimcec.intranet.dto.EntiteDto;
import sn.uimcec.intranet.dto.PointServiceDto;

import java.util.List;

import static sn.uimcec.intranet.utils.Constants.APP_ROOT;

public interface PointServiceApi {


    @PostMapping(value = APP_ROOT + "/pointservice/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Enregistrer un pointservice", description = "Cette methode permet d'enregistrer ou modifier un pointservice")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "L'objet pointservice cree / modifie"),
            @ApiResponse(responseCode = "400", description = "L'objet pointservice n'est pas valide")
    })
    PointServiceDto save(@RequestBody PointServiceDto dto);

    @GetMapping(value = APP_ROOT + "/pointservice/{idpointservice}", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Rechercher un pointservice par ID", description = "Cette methode permet de chercher un pointservice par son ID")

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Le pointservice a ete trouve dans la BDD"),
            @ApiResponse(responseCode = "404", description = "Aucun pointservice  n'existe dans la BDD avec l'ID fourni")
    })
    EntiteDto findById(@PathVariable("idpointservice") Integer id);

    // @GetMapping(value = APP_ROOT + "/articles/filter/{codeArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    // @ApiOperation(value = "Rechercher un article par CODE", notes = "Cette methode permet de chercher un article par son CODE", response =
    //    ArticleDto.class)
    // @ApiResponses(value = {
    //       @ApiResponse(code = 200, message = "L'article a ete trouve dans la BDD"),
    //      @ApiResponse(code = 404, message = "Aucun article n'existe dans la BDD avec le CODE fourni")
    // })
    //ArticleDto findByCodeArticle(@PathVariable("codeArticle") String codeArticle);

    @GetMapping(value = APP_ROOT + "/pointservice/all", produces = MediaType.APPLICATION_JSON_VALUE)
        // @ApiOperation(value = "Renvoi la liste des articles", notes = "Cette methode permet de chercher et renvoyer la liste des pointservice qui existent "
        //      + "dans la BDD", responseContainer = "List<ArticleDto>")
        //@ApiResponses(value = {
        //      @ApiResponse(code = 200, message = "La liste des article / Une liste vide")
        // })
    List<PointServiceDto> findAll();

    //@GetMapping(value = APP_ROOT + "/articles/historique/vente/{idArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    // List<LigneVenteDto> findHistoriqueVentes(@PathVariable("idArticle") Integer idArticle);

    // @GetMapping(value = APP_ROOT + "/articles/historique/commandeclient/{idArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    //List<LigneCommandeClientDto> findHistoriaueCommandeClient(@PathVariable("idArticle") Integer idArticle);

    // @GetMapping(value = APP_ROOT + "/articles/historique/commandefournisseur/{idArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    //List<LigneCommandeFournisseurDto> findHistoriqueCommandeFournisseur(@PathVariable("idArticle") Integer idArticle);



    @DeleteMapping(value = APP_ROOT + "/pointservice/delete/{idpointservice}")
        // @ApiOperation(value = "Supprimer un article", notes = "Cette methode permet de supprimer une categorie par ID")
        // @ApiResponses(value = {
        //     @ApiResponse(code = 200, message = "La categorie a ete supprime")
        //})
    void delete(@PathVariable("idpointservice") Integer id);
}
