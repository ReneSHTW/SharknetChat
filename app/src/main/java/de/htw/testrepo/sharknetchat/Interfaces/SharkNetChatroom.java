package de.htw.testrepo.sharknetchat.Interfaces;

import net.sharkfw.knowledgeBase.PeerSemanticTag;

import java.util.List;

/**
 * SharknetChat
 * Created by René on 28.01.2016.
 */
public interface SharkNetChatroom {

    void addPeerToConversation(PeerSemanticTag peer) throws IllegalAccessException;

    void removePeerFromConversation(PeerSemanticTag peer);

    void grantAdminPermissionsToPeer(PeerSemanticTag peer);

    void removeAdminPermissionsToPeer(PeerSemanticTag peer);

    void setNewOwner(PeerSemanticTag peer);

    PeerSemanticTag getOwnerOfRoom();

    List<PeerSemanticTag> getAdmins();

    List<PeerSemanticTag> getPeers();

    byte getChatProtocolOfChatroom();
}
