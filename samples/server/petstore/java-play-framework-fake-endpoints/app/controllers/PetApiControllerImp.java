package controllers;

import java.io.InputStream;
import apimodels.ModelApiResponse;
import apimodels.Pet;
<<<<<<< HEAD
import java.util.Set;
=======
>>>>>>> ooof

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
<<<<<<< HEAD
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen")
=======
import java.io.FileInputStream;
import javax.validation.constraints.*;

>>>>>>> ooof
public class PetApiControllerImp implements PetApiControllerImpInterface {
    @Override
    public void addPet(Pet body) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void deletePet(Long petId, String apiKey) throws Exception {
        //Do your magic!!!
    }

    @Override
    public List<Pet> findPetsByStatus( @NotNull List<String> status) throws Exception {
        //Do your magic!!!
        return new ArrayList<Pet>();
    }

    @Override
<<<<<<< HEAD
    public Set<Pet> findPetsByTags( @NotNull Set<String> tags) throws Exception {
        //Do your magic!!!
        return new LinkedHashSet<Pet>();
=======
    public List<Pet> findPetsByTags( @NotNull List<String> tags) throws Exception {
        //Do your magic!!!
        return new ArrayList<Pet>();
>>>>>>> ooof
    }

    @Override
    public Pet getPetById(Long petId) throws Exception {
        //Do your magic!!!
        return new Pet();
    }

    @Override
    public void updatePet(Pet body) throws Exception {
        //Do your magic!!!
    }

    @Override
    public void updatePetWithForm(Long petId, String name, String status) throws Exception {
        //Do your magic!!!
    }

    @Override
    public ModelApiResponse uploadFile(Long petId, String additionalMetadata, Http.MultipartFormData.FilePart file) throws Exception {
        //Do your magic!!!
        return new ModelApiResponse();
    }

    @Override
    public ModelApiResponse uploadFileWithRequiredFile(Long petId, Http.MultipartFormData.FilePart requiredFile, String additionalMetadata) throws Exception {
        //Do your magic!!!
        return new ModelApiResponse();
    }

}
