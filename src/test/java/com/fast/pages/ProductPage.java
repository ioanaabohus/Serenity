package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("http://qa1.fasttrackit.org:8008/product/beanie-with-logo/")
public class ProductPage extends PageObject {
    @FindBy (css= "li.reviews_tab a")
    private WebElementFacade reviewButton;
    @FindBy (css="textarea#comment")
    private WebElementFacade reviewField;

    public void clickOnReviewButton () {
        clickOn(reviewButton);
    }
    public void writeComment (){
        typeInto(reviewField, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris congue nisl et turpis congue maximus. Etiam vestibulum facilisis arcu, ultricies porttitor nibh tristique quis. Nullam dapibus, elit quis ullamcorper ultricies, quam lacus scelerisque ipsum, nec venenatis metus tortor at nibh. Maecenas vel magna non tellus mattis aliquet a quis nibh. Nullam at nulla a dolor ornare faucibus sit amet id urna. Nulla euismod mattis nibh a semper. Nam fermentum iaculis ultricies. Suspendisse non aliquet erat. Phasellus feugiat finibus posuere. Phasellus mauris lorem, aliquam ut nibh auctor, auctor ultrices turpis. In auctor commodo nunc, sit amet consequat quam commodo vel. Vestibulum ligula ante, efficitur nec quam quis, bibendum viverra tellus. In lobortis sollicitudin leo, ut viverra ipsum tincidunt at. Proin malesuada nec quam id ultrices. Nam luctus lacus sed quam facilisis, vel viverra ipsum congue.\n" +
                "\n" +
                "Vestibulum tristique interdum finibus. Phasellus quis accumsan sem. Quisque vel condimentum libero. Sed hendrerit dictum quam eu vulputate. Etiam malesuada pretium orci, eget tincidunt lectus ultricies nec. Etiam placerat purus nec dictum aliquet. Nunc tincidunt justo id tellus fermentum ultrices. Pellentesque diam diam, hendrerit sed leo sed, tincidunt vulputate turpis. Maecenas at consectetur ipsum. Etiam feugiat, orci sed elementum pellentesque, ex enim molestie tortor, ut congue elit eros semper leo. Nam luctus neque sapien, quis bibendum sapien convallis vel. Phasellus orci tortor, accumsan eget erat eget, ultricies condimentum est. Suspendisse lacinia in nulla ac convallis. Sed pulvinar sagittis finibus. Morbi consectetur turpis sit amet luctus imperdiet.\n" +
                "\n" +
                "Curabitur lacus enim, hendrerit ac pulvinar eget, malesuada at nibh. Nunc semper eros finibus, tempus turpis vitae, suscipit dui. Cras lectus felis, ornare a fermentum in, sollicitudin at lacus. Pellentesque vitae est id enim accumsan iaculis. Nulla facilisi. Aenean convallis feugiat augue. Vestibulum ut ipsum ultrices, interdum nibh lobortis, sodales ex. Morbi lacinia nulla neque, quis rutrum leo scelerisque in.");
    }


}
