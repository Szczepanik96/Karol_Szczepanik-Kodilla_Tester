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
        weatherHazardSystemService.sendAlertToAll(alert);

        Mockito.verify(davie, Mockito.times(1)).receive(alert);
    }

    @Test
    public void shouldRemovePersonFormSpecificLocation() {

        weatherHazardSystemService.addLocation(canada);
        weatherHazardSystemService.addUserToLocation(canada,jenny);
        weatherHazardSystemService.removeUserFromLocation(canada,jenny);
        weatherHazardSystemService.sendAlertToAll(alert);

        Mockito.verify(jenny,Mockito.never()).receive(alert);
    }

    @Test
    public void shouldRemovePersonFromAllLocationsAndFromSystem() {

        weatherHazardSystemService.addLocation(canada);
        weatherHazardSystemService.addLocation(ohio);
        weatherHazardSystemService.addLocation(oslo);
        weatherHazardSystemService.addUserToLocation(canada,jenny);
        weatherHazardSystemService.addUserToLocation(canada,davie);
        weatherHazardSystemService.addUserToLocation(ohio,davie);
        weatherHazardSystemService.addUserToLocation(oslo,davie);
        weatherHazardSystemService.removeUserFromAllLocations(davie);
        weatherHazardSystemService.sendAlertToAll(alert);

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
        weatherHazardSystemService.sendAlertToUsersInLocation(oslo,alert);

        Mockito.verify(john,Mockito.times(1)).receive(alert);
        Mockito.verify(davie,Mockito.never()).receive(alert);
    }

    @Test
    public void alertShouldBeDeliveredToAllUsersInSystem() {

        weatherHazardSystemService.addLocation(canada);
        weatherHazardSystemService.addLocation(oslo);
        weatherHazardSystemService.addLocation(ohio);
        weatherHazardSystemService.addUserToLocation(canada,jenny);
        weatherHazardSystemService.addUserToLocation(oslo,davie);
        weatherHazardSystemService.addUserToLocation(ohio,john);
        weatherHazardSystemService.addUserToLocation(ohio,jenny);
        weatherHazardSystemService.sendAlertToAll(alert);

        Mockito.verify(jenny,Mockito.times(2)).receive(alert);
        Mockito.verify(john,Mockito.times(1)).receive(alert);
        Mockito.verify(davie,Mockito.times(1)).receive(alert);
    }

    @Test
    public void shouldRemoveLocationFromSystem() {

        weatherHazardSystemService.addLocation(canada);
        weatherHazardSystemService.addLocation(ohio);
        weatherHazardSystemService.addLocation(oslo);
        weatherHazardSystemService.addUserToLocation(canada,davie);
        weatherHazardSystemService.addUserToLocation(ohio,davie);
        weatherHazardSystemService.addUserToLocation(oslo,davie);
        weatherHazardSystemService.removeLocation(canada);
        weatherHazardSystemService.sendAlertToAll(alert);

        Mockito.verify(davie,Mockito.times(2)).receive(alert);
    }
}