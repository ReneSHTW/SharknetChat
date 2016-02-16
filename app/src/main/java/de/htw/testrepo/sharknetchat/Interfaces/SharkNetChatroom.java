package de.htw.testrepo.sharknetchat.Interfaces;

import java.util.List;

/**
 * Created by René on 28.01.2016.
 */
public interface SharkNetChatroom {

    void addPeerToConversation(SharkNetPeer peer) throws IllegalAccessException;

    void removePeerFromConversation(SharkNetPeer peer);

    void grantAdminPermissionsToPeer(SharkNetPeer peer);

    void removeAdminPermissionsToPeer(SharkNetPeer peer);

    void setNewOwner(SharkNetPeer peer);

    SharkNetPeer getOwnerOfRoom();

    List<SharkNetPeer> getAdmins();

    List<SharkNetPeer> getPeers();

    byte getChatProtocolOfChatroom();
}
