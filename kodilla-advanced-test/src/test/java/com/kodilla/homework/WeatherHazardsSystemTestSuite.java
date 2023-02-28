package com.kodilla.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherHazardsSystemTestSuite {


    WeatherHazardSystemService weatherHazardSystemService = new WeatherHazardSystemService();

        User davie = Mockito.mock(User.class);
        User john = Mockito.mock(User.class);
        User jenny = Mockito.mock(User.class);
        Alert alert = Mockito.mock(Alert.class);
        Location oslo = Mockito.mock(Location.class);
        Location canada = Mockito.mock(Location.class);
        Location ohio = Mockito.mock(Location.class);

    @Test
    public void shouldAddPersonsToSpecificLocationAndSendThemAlerts() {


        weatherHazardSystemService.addLocation(oslo);
        weatherHazardSystemService.addUserToLocation(oslo,davie);
        weatherHazardSystemService.sendAlert(oslo,alert);

        Mockito.verify(davie, Mockito.times(1)).receive(alert);
    }

    @Test
    public void shouldRemovePersonFormSpecificLocation() {

        weatherHazardSystemService.addLocation(canada);
        weatherHazardSystemService.addUserToLocation(canada,jenny);
        weatherHazardSystemService.removeUserFromLocation(canada,jenny);
        weatherHazardSystemService.sendAlert(canada,alert);

        Mockito.verify(jenny,Mockito.never()).receive(alert);
    }
    @Test
    public void shouldRemovePersonFromAllLocationsAndFromSystem() {

        weatherHazardSystemService.addLocation(canada);
        weatherHazardSystemService.addLocation(ohio);
        weatherHazardSystemService.addLocation(oslo);
        weatherHazardSystemService.addUserToLocation(canada,davie);
        weatherHazardSystemService.addUserToLocation(ohio,davie);
        weatherHazardSystemService.addUserToLocation(oslo,davie);
        weatherHazardSystemService.removeUserFromAllLocations(davie);
        weatherHazardSystemService.sendAlert(canada,alert);
        weatherHazardSystemService.sendAlert(ohio,alert);
        weatherHazardSystemService.sendAlert(oslo,alert);

        Mockito.verify(davie,Mockito.never()).receive(alert);



    }
    @Test
    public void alertShouldBeDeliveredOnlyToSpecificGroupInLocation() {
        weatherHazardSystemService.addLocation(canada);
        weatherHazardSystemService.addLocation(ohio);
        weatherHazardSystemService.addLocation(oslo);
        weatherHazardSystemService.addUserToLocation(canada,john);
        weatherHazardSystemService.addUserToLocation(canada,davie);
        weatherHazardSystemService.addUserToLocation(canada,jenny);
        weatherHazardSystemService.addUserToLocation(oslo,jenny);
        weatherHazardSystemService.addUserToLocation(oslo,john);
        weatherHazardSystemService.addUserToLocation(ohio,davie);
        weatherHazardSystemService.addUserToLocation(ohio,jenny);
        weatherHazardSystemService.sendAlert(canada,alert);

        Mockito.verify(canada,Mockito.times(9));
    }

    public void alertShouldBeDeliveredToAllUsersInSystem() {

    }

    public void shouldRemoveLocationFromSystem() {

    }
}
