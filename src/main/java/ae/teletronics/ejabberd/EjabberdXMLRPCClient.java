package ae.teletronics.ejabberd;

import ae.teletronics.ejabberd.entity.response.*;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by kristian on 4/7/16.
 */
public class EjabberdXMLRPCClient {

    ExecutorService executorService;
    XmlRpcClient client = new XmlRpcClient();
    ResponseParser responseParser = new ResponseParser();

    public EjabberdXMLRPCClient(ExecutorService executorService, XmlRpcClient client) {
        this.executorService = executorService;
        this.client = client;
    }

    public CompletableFuture<BooleanXmppResponse> createUser(String username, String host, String password){
        Map params = new HashMap();
        params.put("user", username);
        params.put("host", host);
        params.put("password", password);

        return CompletableFuture.supplyAsync(() -> {
            try {
                final HashMap createUserXMLRPCResponse = executeXmlRpc("register", Arrays.asList(params));
                return responseParser.parseBooleanResponse(createUserXMLRPCResponse);
            } catch (XmlRpcException e) {
                final BooleanXmppResponse booleanXmppResponse = new BooleanXmppResponse();
                booleanXmppResponse.setError(e.getMessage());
                return booleanXmppResponse;
            }
        }, executorService);

    }

    public CompletableFuture<BooleanXmppResponse> deleteUser(String username, String host){
        Map params = new HashMap();
        params.put("user", username);
        params.put("host", host);
        return CompletableFuture.supplyAsync(() -> {
            try {
                final HashMap deleteUserXMLRPCResponse = executeXmlRpc("unregister", Arrays.asList(params));
                return responseParser.parseBooleanResponse(deleteUserXMLRPCResponse);
            } catch (XmlRpcException e) {
                final BooleanXmppResponse booleanXmppResponse = new BooleanXmppResponse();
                booleanXmppResponse.setError(e.getMessage());
                return booleanXmppResponse;
            }
        }, executorService);
    }

    public CompletableFuture<GetUsersResponse> getUsers(String host){
        Map params = new HashMap();
        params.put("host", host);
        return CompletableFuture.supplyAsync(() -> {
            try {
                final HashMap response = executeXmlRpc("registered_users", Arrays.asList(params));
                final GetUsersResponse getUsersResponse = responseParser.parseGetUserResponse(response);
                return getUsersResponse;
            } catch (XmlRpcException e) {
                return new GetUsersResponse(e.getMessage());
            }
        }, executorService);
    }

    public CompletableFuture<BooleanXmppResponse> addRosterItem(String localuser, String localserver, String user, String server, String nick, String group, String subs){
        Map params = new HashMap();
        params.put("localuser", localuser);
        params.put("localserver", localserver);
        params.put("user", user);
        params.put("server", server);
        params.put("nick", nick);
        params.put("group", group);
        params.put("subs", subs);
        return CompletableFuture.supplyAsync(() -> {
            try {
                final HashMap response = executeXmlRpc("add_rosteritem", Arrays.asList(params));
                final BooleanXmppResponse booleanXmppResponse = responseParser.parseBooleanResponse(response);
                return booleanXmppResponse;
            } catch (XmlRpcException e) {
                return new BooleanXmppResponse(e.getMessage());
            }
        }, executorService);
    }

    public CompletableFuture<BooleanXmppResponse> deleteRosterItem(String localuser, String localserver, String user, String server){
        Map params = new HashMap();
        params.put("localuser", localuser);
        params.put("localserver", localserver);
        params.put("server", server);
        params.put("user", user);
        return CompletableFuture.supplyAsync(() -> {
            try {
                final HashMap response = executeXmlRpc("delete_rosteritem", Arrays.asList(params));
                return responseParser.parseBooleanResponse(response);
            } catch (XmlRpcException e) {
                return new BooleanXmppResponse(e.getMessage());
            }
        }, executorService);
    }

    public CompletableFuture<GetRosterResponse> getRoster(String user, String server){
        Map struct = new HashMap();
        struct.put("user", user);
        struct.put("server", server);
        return CompletableFuture.supplyAsync(() -> {
            try {
                final HashMap response = executeXmlRpc("get_roster", Arrays.asList(struct));
                return responseParser.parseGetRosterResponse(response);
            } catch (XmlRpcException e) {
                return new GetRosterResponse(e.getMessage());
            }
        }, executorService);
    }

    HashMap executeXmlRpc(String command, List params) throws XmlRpcException {
        return (HashMap) client.execute(command, params);
    }

}