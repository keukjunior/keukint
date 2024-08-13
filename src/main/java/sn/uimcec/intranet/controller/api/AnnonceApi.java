package sn.uimcec.intranet.controller.api;
import static sn.uimcec.intranet.utils.Constants.APP_ROOT;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;
import sn.uimcec.intranet.dto.AnnonceDto;
import org.springframework.http.MediaType;

import java.util.List;

//@Api("annonces")
public interface AnnonceApi {



    @PostMapping(value = APP_ROOT + "/annonces/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
   @Operation(summary = "Enregistrer une annonce", description = "Cette methode permet d'enregistrer ou modifier une annonce")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "L'objet annonce cree / modifie"),
            @ApiResponse(responseCode = "400", description = "L'objet annonce n'est pas valide")
    })
    AnnonceDto save(@RequestBody AnnonceDto dto);

    @GetMapping(value = APP_ROOT + "/annonce/{idannonce}", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Rechercher une annonce par ID", description = "Cette methode permet de chercher une annonce par son ID")

   @ApiResponses(value = {
           @ApiResponse(responseCode = "200", description = "L'annonce a ete trouve dans la BDD"),
           @ApiResponse(responseCode = "404", description = "Aucune annonce n'existe dans la BDD avec l'ID fourni")
    })
    AnnonceDto findById(@PathVariable("idannonce") Integer id);

   // @GetMapping(value = APP_ROOT + "/articles/filter/{codeArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
   // @ApiOperation(value = "Rechercher un article par CODE", notes = "Cette methode permet de chercher un article par son CODE", response =
        //    ArticleDto.class)
   // @ApiResponses(value = {
     //       @ApiResponse(code = 200, message = "L'article a ete trouve dans la BDD"),
      //      @ApiResponse(code = 404, message = "Aucun article n'existe dans la BDD avec le CODE fourni")
   // })
    //ArticleDto findByCodeArticle(@PathVariable("codeArticle") String codeArticle);

    @GetMapping(value = APP_ROOT + "/annonce/all", produces = MediaType.APPLICATION_JSON_VALUE)
   // @ApiOperation(value = "Renvoi la liste des articles", notes = "Cette methode permet de chercher et renvoyer la liste des articles qui existent "
      //      + "dans la BDD", responseContainer = "List<ArticleDto>")
    //@ApiResponses(value = {
      //      @ApiResponse(code = 200, message = "La liste des article / Une liste vide")
   // })
    List<AnnonceDto> findAll();

    //@GetMapping(value = APP_ROOT + "/articles/historique/vente/{idArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
   // List<LigneVenteDto> findHistoriqueVentes(@PathVariable("idArticle") Integer idArticle);

   // @GetMapping(value = APP_ROOT + "/articles/historique/commandeclient/{idArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    //List<LigneCommandeClientDto> findHistoriaueCommandeClient(@PathVariable("idArticle") Integer idArticle);

   // @GetMapping(value = APP_ROOT + "/articles/historique/commandefournisseur/{idArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    //List<LigneCommandeFournisseurDto> findHistoriqueCommandeFournisseur(@PathVariable("idArticle") Integer idArticle);

    @GetMapping(value = APP_ROOT + "/annonces/filter/category/{idcategorie}", produces = MediaType.APPLICATION_JSON_VALUE)
    List<AnnonceDto> findAllAnnonceByIdCategory(@PathVariable("id") Integer id);

    @DeleteMapping(value = APP_ROOT + "/annonces/delete/{idannonce}")
   // @ApiOperation(value = "Supprimer un article", notes = "Cette methode permet de supprimer un article par ID")
   // @ApiResponses(value = {
       //     @ApiResponse(code = 200, message = "L'article a ete supprime")
    //})
    void delete(@PathVariable("idannonce") Integer id);
}
