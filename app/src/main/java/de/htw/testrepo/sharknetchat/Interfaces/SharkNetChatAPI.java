package de.htw.testrepo.sharknetchat.Interfaces;

import java.util.List;

/**
 * Created by René on 28.01.2016.
 */
public interface SharkNetChatAPI {

    void sendMessage(SharkNetPeer peer, byte message);

    void sendMessage(SharkNetChatroom room, byte message);

    //MessageClass erstellen

    void createChatroom(String roomName); //Eindeutigkeit erschaffen //TopicTag

    //cloneChatroom

    //DeleteMessage

    //byte getConversationOfChatroom(SharkNetChatroom room);

    byte getConversationWithPeer(SharkNetPeer peer);

    List<SharkNetChatroom> getOwnChatrooms();

    List<SharkNetChatroom> getAllChatrooms();

    List<SharkNetPeer> getAvailablePeers();

    //void onMessagedReceived(SharkNetPeer peer, byte message);

   // void onMessagedReceived(SharkNetChatroom room ,SharkNetPeer peer, byte message);

    //setListener
}
