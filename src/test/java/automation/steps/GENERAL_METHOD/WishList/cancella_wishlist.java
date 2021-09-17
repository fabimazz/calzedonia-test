package automation.steps.GENERAL_METHOD.WishList;

import cucumber.api.java.en.And;
import divcostants.constantsP;
import org.openqa.selenium.By;
import world.calzedoniaWorld;

public class cancella_wishlist {

    public cancella_wishlist cancella_wishlist;
    public calzedoniaWorld calzedoniaWorld;





    @And("^cancella prodotti wish$")
    public void cancellaProdottiWish() throws Exception {

        //isDisplayed() verifica se l'elemento è visibile su schermo, restituisce un booleano.
        //SERVE QUANDO è PRESENTE UN SOLO ELEMENTO O PIU ELEMENTI DA ELIMINARE

        try {
            Thread.sleep(2000);
            boolean cestino = calzedoniaWorld.driver.findElement(By.xpath(constantsP.CESTINO_WISH_BUTTON)).isDisplayed();
            Thread.sleep(1000);
            while (cestino = true) {
                Thread.sleep(1000);
                calzedoniaWorld.driver.findElement(By.xpath(constantsP.CESTINO_WISH_BUTTON)).click();
            }
        } catch (Exception e) {
        }
    }








}
