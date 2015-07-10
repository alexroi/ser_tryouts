package net.thucydides.showcase.junit.features.petstore;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.showcase.junit.model.Pet;
import net.thucydides.showcase.junit.steps.serenity.PetStoreSteps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class AddAPetToThePetStoreTest {

    @Steps
    PetStoreSteps petStore;

    @Test
    public void shouldBeAbleToAddPetsToAStore() {

        Pet fido = new Pet("available","fido");

        petStore.when_i_add_the_pet_to_the_store(fido);

        petStore.the_pets_should_be_available();

    }
}
