package com.nianticproject.ingress.common.model;

import com.nianticproject.ingress.common.PlayerLocation;
import com.nianticproject.ingress.shared.Faction;

public interface PlayerModel {

    public PlayerLocation getPlayerLocation();
    public void addListener(PlayerListener listener);
    public void removeListener(PlayerListener listener);
    public String getName();
    public String getGuid();
    public long getCurrentXM();
    public long getCurrentAP();
    public Faction getFaction();
}
