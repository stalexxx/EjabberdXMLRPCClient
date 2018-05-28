package ae.teletronics.ejabberd;

import ae.teletronics.ejabberd.entity.response.BooleanXmppResponse;
import ae.teletronics.ejabberd.entity.response.GetRosterResponse;
import ae.teletronics.ejabberd.entity.response.GetUserPairListResponse;
import ae.teletronics.ejabberd.entity.response.GetUsersResponse;

import java.util.concurrent.CompletableFuture;

/**
 * Created by carlos on 9/3/17.
 */
public interface IEjabberdXMLRPCClient {
    CompletableFuture<BooleanXmppResponse> createUser(String username, String host, String password);

    CompletableFuture<BooleanXmppResponse> createRoom(String name, String host, String service);

    CompletableFuture<BooleanXmppResponse> changeRoomOptions(String name, String service, String option, String value);

    CompletableFuture<BooleanXmppResponse> setRoomAffiliation(String roomName, String service, String jid, String member);

    CompletableFuture<BooleanXmppResponse> deleteUser(String username, String host);

    CompletableFuture<GetUsersResponse> getUsers(String host);

    CompletableFuture<BooleanXmppResponse> addRosterItem(String localuser, String localserver, String user, String server, String nick, String group, String subs);

    CompletableFuture<BooleanXmppResponse> deleteRosterItem(String localuser, String localserver, String user, String server);

    CompletableFuture<GetRosterResponse> getRoster(String user, String server);

    CompletableFuture<BooleanXmppResponse> sendChatMessage(String to, String from, String subject, String body);

    CompletableFuture<BooleanXmppResponse> sendStanza(String to, String from, String stanza);

    CompletableFuture<GetUserPairListResponse> processRosterItems(String action, String subs, String asks, String users, String contacts);
}
