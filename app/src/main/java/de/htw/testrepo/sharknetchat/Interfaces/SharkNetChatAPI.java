package de.htw.testrepo.sharknetchat.Interfaces;

import net.sharkfw.knowledgeBase.PeerSemanticTag;

import java.util.List;

/**
 * SharknetChat
 * Created by René on 28.01.2016.
 */
public interface SharkNetChatAPI {

    void sendMessage(PeerSemanticTag peer, byte message);

    void sendMessage(SharkNetChatroom room, byte message);

    //MessageClass erstellen

    void createChatroom(String roomName); //Eindeutigkeit erschaffen //TopicTag

    //cloneChatroom

    //DeleteMessage

    //byte getConversationOfChatroom(SharkNetChatroom room);

    byte getConversationWithPeer(PeerSemanticTag peer);

    List<SharkNetChatroom> getOwnChatrooms();

    List<SharkNetChatroom> getAllChatrooms();

    List<PeerSemanticTag> getAvailablePeers();

    //void onMessagedReceived(SharkNetPeer peer, byte message);

   // void onMessagedReceived(SharkNetChatroom room ,SharkNetPeer peer, byte message);

    //setListener
}
